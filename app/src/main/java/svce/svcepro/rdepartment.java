package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class rdepartment extends AppCompatActivity {

    TextView deptdesc;
    public int x,y;
    ImageView bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdepartment);
        Bundle extras=getIntent().getExtras();
        x=extras.getInt("year");
        y=extras.getInt("sem");
        bg=(ImageView)findViewById(R.id.deptimg);
        Glide.with(this).load("http://www.pbs.org/newshour/extra/app/uploads/2016/05/GettyImages-535837803-1024x768-1024x768.jpg").into(bg);

        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerviewdept);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, rdepartment.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(rdepartment.this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(rdepartment.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0: { //auto
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 1);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 1: { //biotech
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 2);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 2: { //chemical
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 3);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 3: { //civil
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 4);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 4: { //cse
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 8);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 5: { //eee
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 5);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 6: { //ece
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 7);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 7: { //it
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 6);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 8: { //mech
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 9);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 9: { //marine
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 10);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:

                                break;
                        }
                        // do whatever
                    }
                })
        );

    }
    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("Automobile", "Thank you for bringing in the BMW i8, Rolls Royce and Harley Davidson into the college.\n" +
                "Yours thankfully,\n" +
                "Everyone ", R.drawable.nauto));
        data.add(new data("Biotech", "The doc feel that you get when wearing a lab coat.Tell me who doesn't love this department.", R.drawable.nbio));
        data.add(new data("Chemical", "The luckiest department in SVCE! who else gets a canteen and a stall so close to the classroom", R.drawable.nchem));
        data.add(new data("Civil", "Let's take a minute to appreciate these people for having to draw engineering graphics sheets for the whole four years. ", R.drawable.ncivil));
        data.add(new data("CSE", "Red Bull and lines of code makes the best pair", R.drawable.ncse));
        data.add(new data("EEE", "Guys, please stop calling us a \'lineman'. That joke is as old as floppy disk.", R.drawable.neee));
        data.add(new data("ECE", "Remember that with great power comes great current squared times resistance", R.drawable.nece));
        data.add(new data("IT", "To them cloud brings AWS, IBM and Azure to their mind and no longer the white figures in the sky ", R.drawable.nit));
        data.add(new data("Mechanical", "The Pink Floyd of all departments,Legend says that everytime u walk into their classrooms ur facial hair grows by a millimetre", R.drawable.mechic));
        data.add(new data("Marine", "I mean, how cool is it to have classes in the swimming pool and pretending to be captain Jack Sparrow", R.drawable.nmarine));

        return data;
    }


}