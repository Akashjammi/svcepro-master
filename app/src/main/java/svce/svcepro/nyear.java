package svce.svcepro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 25/12/16.
 */

public class nyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nyear);
        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data,nyear.this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(nyear.this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(nyear.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                Toast.makeText(nyear.this,"item one",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                Toast.makeText(nyear.this,"item one long",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }
                })
        );

    }
    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("First Year", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.none));
        data.add(new data("Second Year", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.ntwo));
        data.add(new data("Third Year", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nthree));
        data.add(new data("Fourth Year", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.nfour));
        return data;
    }


}