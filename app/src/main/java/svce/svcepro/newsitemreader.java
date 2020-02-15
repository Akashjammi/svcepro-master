package svce.svcepro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class newsitemreader extends AppCompatActivity {
ImageView expimg;
TextView exptitle,expdesc;
String titc,datc,url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            titc = bundle.getString("title");
            datc = bundle.getString("desc");
            url=bundle.getString("url");
        }
        setContentView(R.layout.expnewsitem);
        expimg=(ImageView)findViewById(R.id.expimg);
        exptitle=(TextView)findViewById(R.id.exptitle);
        expdesc=(TextView)findViewById(R.id.expdesc);
        setTitle("News Feed from SVCE");

        if(url.equals("none")){
            expimg.setVisibility(View.INVISIBLE);
        }else {
            Glide.with(this).load(url).into(expimg);
        }
        exptitle.setText(titc);
        expdesc.setText(datc);




    }

}
