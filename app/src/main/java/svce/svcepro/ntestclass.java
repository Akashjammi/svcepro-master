package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ntestclass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nfinallay);
        List<data> data = fill_with_data();
        setTitle("Hello!");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerviewfinal);
        finalRecycler_View_Adapter adapter = new finalRecycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(ntestclass.this,recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position)
                {
                    case 0:
                       // Intent intent=new Intent(rsection.this,ntestc.class);
                        //startActivity(intent);
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

               data.add(new data("Timetable", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.ntt));
        data.add(new data("Bus Schedule", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nbus));
        data.add(new data("Faculty Advisors", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nteachers));
        data.add(new data("Notes", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nnotes));
        data.add(new data("Question Papers", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nqp));
        data.add(new data("Notifications", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nnotif));
        data.add(new data("Teachers", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nteachers));
        data.add(new data("Office Bearers", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nofficeb));
        data.add(new data("College Map", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nmap));


        return data;
    }
}