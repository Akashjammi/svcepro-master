package svce.svcepro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class photosActivity extends AppCompatActivity {
    private DatabaseReference root;
    List<photodata> photodatas = new ArrayList<>();

    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

getSupportActionBar().hide();
        root= FirebaseDatabase.getInstance().getReferenceFromUrl("https://svce-pro-26e5f.firebaseio.com/").child("Photo");

        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                photogetter(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                photogetter(dataSnapshot);
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
    String caption,author,date,url;
    private void photogetter(DataSnapshot dataSnapshot) {


        Iterator i = dataSnapshot.getChildren().iterator();
        while (i.hasNext()) {
            author = (String) ((DataSnapshot) i.next()).getValue();
            caption = (String) ((DataSnapshot) i.next()).getValue();
            date = (String) ((DataSnapshot) i.next()).getValue();
            url = (String) ((DataSnapshot) i.next()).getValue();

            /*newstitles.add(titl);
            newscontent.add(content);
            newsurl.add(url);*/
            photodatas.add(new photodata(caption, author, date, url));
        }
        if (photodatas != null) {
            photorecyadapter adapter = new photorecyadapter(photodatas, this);

            recyclerView = (RecyclerView) findViewById(R.id.photorecycler);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
            itemAnimator.setAddDuration(1000);
            itemAnimator.setRemoveDuration(1000);
            recyclerView.setItemAnimator(itemAnimator);
            recyclerView.addOnItemTouchListener(
                    new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            switch (position) {
                                default: {

                                }

                            }
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            switch (position) {

                            }
                        }
                    })
            );
        }
    }
}
