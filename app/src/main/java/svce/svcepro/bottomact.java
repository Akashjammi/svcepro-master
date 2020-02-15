package svce.svcepro;

/**
 * Created by harishananth on 29/12/16.
 */

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class bottomact extends AppCompatActivity {
    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottomact);
        bottomBar=BottomBar.attach(this,savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if(menuItemId==R.id.Bottombarone)
                {
                    PrimaryFragment f=new PrimaryFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                if(menuItemId==R.id.Bottombartwo)
                {
                  SocialFragment p=new SocialFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,p).commit();
                }
                if(menuItemId==R.id.Bottombarfive)
                {
                   busfthree fav=new busfthree();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fav).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });

        bottomBar.mapColorForTab(0,"#F44336");
        bottomBar.mapColorForTab(1,"#9C27B0");
        bottomBar.mapColorForTab(2,"#FF9800");
    }
}
