package svce.svcepro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class selectme extends AppCompatActivity {
    Integer x, y, z,t;

    ImageView displayimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        t = extras.getInt("sec");
     displayimg=(ImageView)findViewById(R.id.myimg);
        Glide.with(this).load("http://quotesideas.com/wp-content/uploads/2015/03/Knowledge-is-of-no-value....png").into(displayimg);

        switch (z) // getting the valuefor depatrmnt
        {
            case 1:// automobile
            {
                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fautotwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fautoone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }
                }
                break;
            }
            case 2: // biotech
            {
                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fbiotechtwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fbiotechone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                }

                break;
            }

            case 3: // chemical
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fchematwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fchemaone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fchembtwo.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fchembone.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                }
                break;
            }
            case 4: // civil
            {

                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fciviltwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fcivilone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }
                }
                break;
            }
            case 5: //eee
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, feeeatwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, feeeaone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, feeebtwo.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, feeebone.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                }
                break;

            }
            case 6: // it
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {  //it a
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fitatwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fitaone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                    case 2: {  //it b
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fitbtwo.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fitbone.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                }
                break;
            }
            case 7:
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, feceatwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, feceaone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fecebtwo.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fecebone.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }
                    case 3:
                    {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fecectwo.class);
                            newint.putExtra("sec",3);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fececone.class);
                            newint.putExtra("sec",3);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;

                    }

                }
                break;
            }
            case 8: // cse
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fcseatwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fcseaone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fcsebtwo.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fcsebone.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }
                    case 3:
                    {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fcsectwo.class);
                            newint.putExtra("sec",3);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fcsecone.class);
                            newint.putExtra("sec",3);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;

                    }

                }
                break;

            }
            case 9:  // mech
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fmechatwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fmechaone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fmechbtwo.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fmechbone.class);
                            newint.putExtra("sec",2);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }

                }
                break;

            }
            case 10:// automobile
            {
                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Intent newint = new Intent(selectme.this, fmarinetwo.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);

                        } else {
                            Intent newint = new Intent(selectme.this, fmarineone.class);
                            newint.putExtra("sec",1);
                            newint.putExtra("year",x);
                            newint.putExtra("sem",y);
                            newint.putExtra("sel",z);
                            startActivity(newint);
                        }
                        break;
                    }
                }
                break;
            }
        }


    }
}