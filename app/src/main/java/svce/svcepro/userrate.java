package svce.svcepro;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by harishananth on 27/12/16.
 */

public class userrate extends AppCompatActivity {

    Button rate;
   @Override
    protected void onCreate(Bundle savedInstanceState)
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.canteenuserrate);
       rate=(Button)findViewById(R.id.submit);
       rate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(userrate.this,Maincant.class);
               intent.putExtra("mainsel",1);
               intent.putExtra("mainselec",2);
               startActivity(intent);
           }
       });
    }

}
