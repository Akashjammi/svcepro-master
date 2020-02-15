package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import android.widget.Toast;

import static com.facebook.FacebookSdk.getApplicationContext;

public class TabFragment extends Fragment implements View.OnClickListener {

    public static TabLayout tablayout;
    public static ViewPager viewPager;
    TextView displaytxt;
    public static int int_items = 3 ;
    private FloatingActionButton fab;
    private FloatingActionButton fab2;
    ViewPager mViewPager;
    private Boolean isFabOpen = false;
    private FloatingActionButton fabs,fabt;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;


    String[] titles={"Hi "+navandtab.username+"!","Stay up-to-date","Who's hungry?"};
    int[] colorIntArray = {R.color.white,R.color.orange,R.color.white};
    int[] iconIntArray = {R.drawable.pri,R.drawable.wall,R.drawable.food};

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         *Inflate tab_layout and setup Views.
         */
        View x =  inflater.inflate(R.layout.tab_layout,null);

        fab=(FloatingActionButton)x.findViewById(R.id.fab);

        //anim
        //below is the main fab
        fab2=(FloatingActionButton)x.findViewById(R.id.fab2);
        fabs = (FloatingActionButton)x.findViewById(R.id.fab3);
        fabt = (FloatingActionButton)x.findViewById(R.id.fab4);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_opens);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_closes);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);
        fab2.setOnClickListener(this);
        fabs.setOnClickListener(this);
        fabt.setOnClickListener(this);

        tablayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);
        displaytxt=(TextView)x.findViewById(R.id.displaytxt);
        displaytxt.setText("Hello!");
       /* fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Chat.class);
                intent.putExtra("name",navandtab.username);
                intent.putExtra("email",navandtab.email);
                startActivity(intent);
            }
        });*/

       // if(tablayout!=null)
            tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                    animateFab(tab.getPosition());


                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });


        /**
         *Set an Apater for the View Pager
         */
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        /**
         * Now , this is a workaround ,
         * The setupWithViewPager dose't works without the runnable .
         * Maybe a Support Library Bug .
         */

        tablayout.post(new Runnable() {
            @Override
            public void run() {
                tablayout.setupWithViewPager(viewPager);
            }
        });

        return x;

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.fab2:

                animateFAB();
                break;
            case R.id.fab3:
                String url = "https://www.facebook.com/svceproapp/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.fab4:
                Intent intent=new Intent(getActivity(),Chat.class);
                intent.putExtra("uname",navandtab.username);
                startActivity(intent);
                Log.d("test", "Fab 2");
                break;
        }
    }


    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new PrimaryFragment();
                case 1 : return new SocialFragment();
                case 2 : return new UpdatesFragment();
            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }
        /**
         * This method returns the title of the tab according to the position.
         */

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0 :
                    return "Primary";
                case 1 :
                    return "Wall";
                case 2 :
                    return "Canteen";
            }
            return null;
        }
    }

    public void animateFAB(){

        if(isFabOpen){

            fab2.startAnimation(rotate_backward);
            fabs.startAnimation(fab_close);
            fabt.startAnimation(fab_close);
            fabs.setClickable(false);
            fabt.setClickable(false);
            isFabOpen = false;
            Log.d("test", "close");

        } else {

            fab2.startAnimation(rotate_forward);
            fabs.startAnimation(fab_open);
            fabt.startAnimation(fab_open);
            fabs.setClickable(true);
            fabt.setClickable(true);
            isFabOpen = true;
            Log.d("test","open");

        }
    }
    protected void animateFab(final int position) {
        displaytxt.clearAnimation();
        fab.clearAnimation();
        // Scale down animation
        ScaleAnimation shrink =  new ScaleAnimation(1f, 0.2f, 1f, 0.2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        shrink.setDuration(150);     // animation duration in milliseconds
        shrink.setInterpolator(new DecelerateInterpolator());
        shrink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }


            @Override
            public void onAnimationEnd(Animation animation) {
                // Change FAB color and icon

                displaytxt.setText(titles[position]);
                fab.setBackgroundTintList(getResources().getColorStateList(colorIntArray[position]));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    fab.setImageDrawable(getResources().getDrawable(iconIntArray[position], null));
                }

                // Scale up animation
                ScaleAnimation expand =  new ScaleAnimation(0.2f, 1f, 0.2f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                expand.setDuration(100);     // animation duration in milliseconds
                expand.setInterpolator(new AccelerateInterpolator());
                fab.startAnimation(expand);
                displaytxt.startAnimation(expand);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        fab.startAnimation(shrink);
        displaytxt.startAnimation(shrink);
    }



}