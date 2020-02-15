package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */

import android.app.Activity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class navandtab extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    CircleImageView profimg;
    TextView name,emai;
    String value;
    FragmentManager mFragmentManager;
    private View navheader;
    public static String username, email,url;
    FragmentTransaction mFragmentTransaction;
    private static ArrayList<Activity> activities = new ArrayList<Activity>();
public static android.support.v7.widget.Toolbar toolbar;
    public static Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabandnav);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            username = extras.getString("name");
            email = extras.getString("email");
            url = extras.getString("url");

        }
Get_hash_key();
        Activity activity=this;
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("svce pro");
        actionBar.hide();
        activities.add(this);
        /**
         *Setup the DrawerLayout and NavigationView
         */
window=activity.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(activity,R.color.newc));
        }
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff);
navheader=mNavigationView.getHeaderView(0);
        name=(TextView)navheader.findViewById(R.id.unamenav);
        emai=(TextView)navheader.findViewById(R.id.uemailnav);

        profimg = (CircleImageView) navheader.findViewById(R.id.profile_imagenav);
        name.setText(username);
        emai.setText(email);
        Glide.with(navandtab.this).load(url).into(profimg);

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */
        mNavigationView.setItemIconTintList(null);

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.checkbus) {
                    //Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    checkbusrfrag bus = new checkbusrfrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView, bus).commit();
                }

                if (menuItem.getItemId() == R.id.beadev) {
                    // Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    beadevfrag bedev = new beadevfrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView, bedev).commit();
                }
                if (menuItem.getItemId() == R.id.lic) {
                    //  Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    license lic = new license();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView, lic).commit();
                }

                if (menuItem.getItemId() == R.id.app) {
                    // Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    aboutapp app = new aboutapp();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView, app).commit();

                }
                if (menuItem.getItemId() == R.id.License) {
                    //   Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    license lic = new license();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView, lic).commit();

                }
                if (menuItem.getItemId() == R.id.rateus) {
                    //  Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + getPackageName()));
                    startActivity(i);
                }
                if(menuItem.getItemId()==R.id.home)
                {
                    TabFragment tabFragment = new TabFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView, tabFragment).commit();
                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setSubtitle(" Official app of SVCE");
        toolbar.setSubtitleTextColor(Color.parseColor("#18FFFF"));
        toolbar.setLogo(R.drawable.ic_svce);
          toolbar.findViewById(R.id.callsvce).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  String phone = "044 2715 2021";
                  Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                  startActivity(intent);
              }
          });

        toolbar.findViewById(R.id.notifimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customalert al=new customalert(navandtab.this);
                al.show();
            }
        });
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        activities.remove(this);
    }


    @Override
    public void onBackPressed() {



             if(getFragmentManager().getBackStackEntryCount()>0)
             {                 super.onBackPressed();
             }
           else if(mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                mDrawerLayout.closeDrawer(GravityCompat.START);

            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    this.finishAffinity();
                }
                System.exit(0);
                // finish activity


            }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);//Menu Resource, Menu
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:
                Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.License:
                Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void Get_hash_key() {
        PackageInfo info;
        try {
            info = getPackageManager().getPackageInfo("com.svce.svcepro", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md;
                md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String something = new String(Base64.encode(md.digest(), 0));
                //String something = new String(Base64.encodeBytes(md.digest()));
                Log.e("hash key", something);
            }
        } catch (PackageManager.NameNotFoundException e1) {
            Log.e("name not found", e1.toString());
        } catch (NoSuchAlgorithmException e) {
            Log.e("no such an algorithm", e.toString());
        } catch (Exception e) {
            Log.e("exception", e.toString());
        }
    }
}