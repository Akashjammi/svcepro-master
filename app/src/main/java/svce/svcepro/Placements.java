package svce.svcepro;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pl.droidsonroids.gif.GifTextView;

public class Placements extends AppCompatActivity {

    ViewPager viewPager;

    private TabLayout tablayout;
    public static android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placementtab);


        viewPager=(ViewPager)findViewById(R.id.pager);
        setupViewPager(viewPager);
        tablayout=(TabLayout)findViewById(R.id.tabs);
        tablayout.setupWithViewPager(viewPager);
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("svce pro");
        actionBar.hide();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.findViewById(R.id.plmail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plalert al=new plalert(Placements.this);
                al.show();
            }
        });


        if(tablayout!=null)
            tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }
                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

    }

    private void setupViewPager(ViewPager viewPager)
    {
        ViewPageAdapter viewpageadapter=new ViewPageAdapter(getSupportFragmentManager());
        viewpageadapter.add(new plone(),"Profile");
        viewpageadapter.add(new pltwo(),"Recruiters");
        viewpageadapter.add(new plthree(),"Preparation");
        viewPager.setAdapter(viewpageadapter);
    }

    private class ViewPageAdapter extends FragmentPagerAdapter
    {
        List<Fragment> fragmentlist= new ArrayList<>();
        List<String> fragmenttitle=new ArrayList<>();
        public ViewPageAdapter(FragmentManager supportFragmentManager)
        {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentlist.get(position);
        }

        @Override
        public int getCount() {
            return fragmentlist.size();
        }

        public void add(Fragment fragment, String title)
        {
            fragmentlist.add(fragment);
            fragmenttitle.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmenttitle.get(position);
        }
    }

}
