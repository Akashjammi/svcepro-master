package svce.svcepro;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Iterator;
import java.util.List;

/**
 * Created by harishananth on 20/07/17.
 */

public class opennotif extends AppCompatActivity {
    DatabaseReference root;
    ImageView notifyimg;
    TextView notiftitle, notifcontent;
    String titletxt, contenttxt, notifurl;
    private ProgressDialog progDailog;

    RelativeLayout mylay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opennotif);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            titletxt = extras.getString("title");
            //Toast.makeText(this,titletxt+" is the title",Toast.LENGTH_LONG).show();
        }
        mylay=(RelativeLayout)findViewById(R.id.mylayout);
        notifyimg=(ImageView)findViewById(R.id.notifimg);
        notiftitle=(TextView)findViewById(R.id.notifytitle);
        notifcontent=(TextView)findViewById(R.id.notifycontent);
mylay.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.svce.ac.in/"));
        startActivity(browserintent);
    }
});
        root=FirebaseDatabase.getInstance().getReferenceFromUrl("https://svce-pro-26e5f.firebaseio.com/").child("News Feed");
        progDailog = ProgressDialog.show(this, "Loading", "Please wait...", true);
        progDailog.setCancelable(false);
        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                append_chat_conversation(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                append_chat_conversation(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    String titl, content, url;

    private void append_chat_conversation(DataSnapshot dataSnapshot) {


        Iterator i = dataSnapshot.getChildren().iterator();
        while (i.hasNext()) {
            content = (String) ((DataSnapshot) i.next()).getValue();
            titl = (String) ((DataSnapshot) i.next()).getValue();
            url = (String) ((DataSnapshot) i.next()).getValue();
            if(titl.equals(titletxt))
            {
                notiftitle.setText(titl);
                notifcontent.setText(content);
                if(url.equals("none"))
                    notifyimg.getLayoutParams().height=20;
                else
                    Glide.with(this).load(url).into(notifyimg);

            }


            //Toast.makeText(Areaselected.this,"title"+titl,Toast.LENGTH_SHORT).show();

        }
        progDailog.dismiss();

    }
}
