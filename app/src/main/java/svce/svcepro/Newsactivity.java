package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Newsactivity extends AppCompatActivity {

    private DatabaseReference root;

    private ProgressDialog progDailog;
    List<String> newstitles=new ArrayList<String>();
    List<String> newscontent=new ArrayList<String>();
    List<String> newsurl=new ArrayList<String>();


    Set<String> hs=new HashSet<>();
    Set<String> hs1=new HashSet<>();
    Set<String> hs2=new HashSet<>();


    public RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newsact);
        if (isNetworkAvailable(Newsactivity.this)) {
            root = FirebaseDatabase.getInstance().getReferenceFromUrl("https://svce-pro-26e5f.firebaseio.com/").child("News Feed");
            progDailog = ProgressDialog.show(Newsactivity.this, "Loading", "Please wait...", true);
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


    }

    public List<newsdata> fill_with_data() {

        List<newsdata> data = new ArrayList<>();

        /*{
            hs.addAll(newstitles);
            newstitles.clear();
            newstitles.addAll(hs);
        }*/

        /*{
            hs1.addAll(newscontent);
            newscontent.clear();
            newscontent.addAll(hs);
        }

        {
            hs2.addAll(newsurl);
            newsurl.clear();
            newsurl.addAll(hs);
        }*/


        for(int i=0;i<newstitles.size();i++)
        {

            data.add(new newsdata(newstitles.get(i),newscontent.get(i),newsurl.get(i)));
        }
        return data;
    }
    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }


    String titl,content,url;
    private void append_chat_conversation(DataSnapshot dataSnapshot)
    {



        Iterator i=dataSnapshot.getChildren().iterator();
        while(i.hasNext())
        {
            content=(String)((DataSnapshot)i.next()).getValue();
            titl= (String) ((DataSnapshot)i.next()).getValue();
            url= (String) ((DataSnapshot)i.next()).getValue();

            //Toast.makeText(Areaselected.this,"title"+titl,Toast.LENGTH_SHORT).show();
            newstitles.add(titl);
            newscontent.add(content);
            newsurl.add(url);
        }
        List<newsdata> newsdatas = fill_with_data();
        newsrecyadapter adapter = new newsrecyadapter(newsdatas,Newsactivity.this);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerviewnews);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Newsactivity.this));
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        progDailog.dismiss();
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(Newsactivity.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        switch (position)
                        {
                            default:
                            {

                            }

                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {

                        }
                        // do whatever
                    }
                })
        );

    }

}