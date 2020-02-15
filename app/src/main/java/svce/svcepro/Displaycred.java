package svce.svcepro;

/**
 * Created by harishananth on 18/07/17.
 */

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by harishananth on 15/06/17.
 */

public class Displaycred extends AppCompatActivity {
    EditText email;
    EditText phonenumber;
    String uphone;
    CircleImageView profpic;
    TextView name;
    Button proceed;
    private PrefManager prefManager;
    String uname,uemail,url;
    Spinner spinner;
    SharedPreferences sharedPref;
    Button next;
    String item;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPref = getSharedPreferences("userinfo", MODE_PRIVATE);

        // Checking for first time launch - before calling setContentView()
        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            sharedPref = getSharedPreferences("userinfo", MODE_PRIVATE);
            {
                if (sharedPref != null) {
                    uname = sharedPref.getString("name", "name");
                    uemail = sharedPref.getString("email", "email");
                    url = sharedPref.getString("url", "url");
                    uphone = sharedPref.getString("phone", "phone");
                    Intent intent = new Intent(Displaycred.this, navandtab.class);
                    intent.putExtra("name", uname);
                    intent.putExtra("email", uemail);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }
            }
            finish();
        }
        setContentView(R.layout.displaycred);
        setTitle("Hello!");

        Bundle extras=getIntent().getExtras();
        if(extras!=null) {
            uname = extras.getString("username");
            uemail = extras.getString("email");
            url = extras.getString("url");
        }


        profpic=(CircleImageView)findViewById(R.id.profile_image);
        name=(TextView)findViewById(R.id.username);
        email=(EditText) findViewById(R.id.email);
        phonenumber=(EditText) findViewById(R.id.phonenum);

        proceed=(Button)findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uphone=phonenumber.getText().toString();
                uemail=email.getText().toString();
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("email",uemail);
                editor.putString("phone",uphone);
                editor.putString("name",uname);
                editor.putString("url",url);
                editor.putString("flag","1");
                editor.apply();
                Savedata();
                sendEmail(uname,uemail,uphone);
                if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
                    Intent intent = new Intent(Displaycred.this, WelcomeActivity.class);
                    intent.putExtra("name", uname);
                    intent.putExtra("email", uemail);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Displaycred.this, navandtab.class);
                    intent.putExtra("name", uname);
                    intent.putExtra("email", uemail);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }


            }
        });


        // if(uname!=null && uemail!=null && uphone!=null && url!=null)
        {

            name.setText(uname);

            email.setText(uemail);

            Glide.with(Displaycred.this).load(url).into(profpic);

        }




    }
    private void sendEmail(String uname, String uemail, String uphone) {
        //Getting content for email
        String email =uemail;
        String subject = "Thank you for signing up - Svce Pro app";
        String message = "Hello "+uname+"\n"+
                "\n" +
                "Hope you're doing fantastic! We noticed that you just signed up at Svce Pro, and we wanted to personally thank you. Svce Pro is aimed at being your one stop destination to access News Feeds, Notifications, Notes, Question papers, Timetable, Faculty details and all other information pertaining to the college  \n\n  Cheers \n The Svce Pro team";

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
    }
    public void Savedata()
    {
        sharedPref=getSharedPreferences("userinfo",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putString("city",item);
        editor.apply();
    }


    private void launchHomeScreen() {
        Intent intent=new Intent(Displaycred.this,navandtab.class);
        intent.putExtra("name",uname);
        intent.putExtra("email",uemail);
        intent.putExtra("url",url);
        intent.putExtra("city",item);
        startActivity(intent);
        finish();
    }
}