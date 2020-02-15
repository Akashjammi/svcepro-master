package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import pl.droidsonroids.gif.GifTextView;


public class secondfrag extends Fragment {

    private DatabaseReference root,rooth;

    private ProgressDialog progDailog;
    List<String> newstitles=new ArrayList<String>();
    List<String> newscontent=new ArrayList<String>();
    List<String> newsurl=new ArrayList<String>();


    Set<String> hs=new HashSet<>();
    Set<String> hs1=new HashSet<>();
    Set<String> hs2=new HashSet<>();
    GifTextView mainload;
    public RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.finalseclay, null);

        mainload=(GifTextView)v.findViewById(R.id.mainloadgif);

        if (isNetworkAvailable(getActivity())) {
            root = FirebaseDatabase.getInstance().getReferenceFromUrl("https://svce-pro-26e5f.firebaseio.com/").child("News Feed");
            rooth=FirebaseDatabase.getInstance().getReferenceFromUrl("https://svce-pro-26e5f.firebaseio.com/").child("Headlines");
            rooth.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    headlines(dataSnapshot, v);
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    headlines(dataSnapshot, v);

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
            root.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    append_chat_conversation(dataSnapshot, v);
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                    append_chat_conversation(dataSnapshot, v);
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


        return v;
    }

    public List<newsdata> fill_with_data() {

        List<newsdata> data = new ArrayList<>();


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
    private void append_chat_conversation(DataSnapshot dataSnapshot,View view)
    {



        Iterator i=dataSnapshot.getChildren().iterator();
        while(i.hasNext())
        {
            content=(String)((DataSnapshot)i.next()).getValue();
            titl= (String) ((DataSnapshot)i.next()).getValue();
            url= (String) ((DataSnapshot)i.next()).getValue();

            newstitles.add(titl);
            newscontent.add(content);
            newsurl.add(url);
        }
        List<newsdata> newsdatas = fill_with_data();
        newsrecyadapter adapter = new newsrecyadapter(newsdatas,getActivity());

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerviewnews);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            default:
                            {
                                Intent intent=new Intent(getContext(),newsitemreader.class);
                                intent.putExtra("title",newstitles.get(position));
                                intent.putExtra("desc",newscontent.get(position));
                                intent.putExtra("url",newsurl.get(position));
                                startActivity(intent);
                            }

                        }
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {

                        }
                    }
                })
        );
        mainload.setVisibility(View.INVISIBLE);
    }

    private void headlines(DataSnapshot dataSnapshot,View view)
    {

        Iterator i=dataSnapshot.getChildren().iterator();
        while(i.hasNext())
        {

            titl= (String) ((DataSnapshot)i.next()).getValue();

        }

    }



}