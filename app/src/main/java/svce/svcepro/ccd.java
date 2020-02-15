package svce.svcepro;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
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
 * Created by harishananth on 20/12/16.
 */

public class ccd extends AppCompatActivity {
    int x=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        List<ctdata> ctdata = fill_with_data();
        setTitle("Cafe Coffee Day @SVCE");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xffD61820));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mctrecyadapter adapter = new mctrecyadapter(ctdata,ccd.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(ccd.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0:
                                Intent intent=new Intent(ccd.this,maincantlist.class);
                                intent.putExtra("mainselec",1);
                                intent.putExtra("mainsel",4);
                                startActivity(intent);
                                break;
                            case 1:
                                Intent intent1=new Intent(ccd.this,maincantlist.class);
                                intent1.putExtra("mainselec",2);
                                intent1.putExtra("mainsel",4);
                                startActivity(intent1);
                                break;
                            case 2:
                                Intent intent2=new Intent(ccd.this,maincantlist.class);
                                intent2.putExtra("mainselec",3);
                                intent2.putExtra("mainsel",4);
                                startActivity(intent2);
                                break;
                            case 3:
                                Intent intent3=new Intent(ccd.this,maincantlist.class);
                                intent3.putExtra("mainselec",4);
                                intent3.putExtra("mainsel",4);
                                startActivity(intent3);
                                break;
                            case 4:
                                Intent intent4=new Intent(ccd.this,maincantlist.class);
                                intent4.putExtra("mainselec",5);
                                intent4.putExtra("mainsel",4);
                                startActivity(intent4);
                                break;
                            case 5:
                                Intent intent5=new Intent(ccd.this,maincantlist.class);
                                intent5.putExtra("mainselec",6);
                                intent5.putExtra("mainsel",4);
                                startActivity(intent5);
                                break;
                            case 6:
                                Intent intent6=new Intent(ccd.this,maincantlist.class);
                                intent6.putExtra("mainselec",7);
                                intent6.putExtra("mainsel",4);
                                startActivity(intent6);
                                break;
                            case 7:
                                Intent intent7=new Intent(ccd.this,maincantlist.class);
                                intent7.putExtra("mainselec",8);
                                intent7.putExtra("mainsel",4);
                                startActivity(intent7);
                                break;
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                             //   Toast.makeText(ccd.this,"item one long",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(ccd.this,userrate.class);
                                startActivity(intent);
                                break;
                        }
                        // do whatever
                    }
                })
        );
    }
    public List<ctdata> fill_with_data() {

        List<ctdata> data = new ArrayList<>();

        data.add(new ctdata("Hot Coffees", (float) 3,"Rs 20-40","From 10.10 AM to 3.30 PM", R.drawable.coffee));
        data.add(new ctdata("Hoteas", (float) 3,"Rs 20-35","From 10.10 AM to 3.30 PM", R.drawable.tea));
        data.add(new ctdata("Healthy Classics",(float) 3 ,"Rs 25-40 ","From 10.10 AM to 3.30 PM", R.drawable.horlicks));
        data.add(new ctdata("Cold Coffees", (float) 3.5,"Rs 40","From 11 AM to 3.30 PM", R.drawable.coldcoffee));
        data.add(new ctdata("Frosteas", (float) 4,"Rs 25","From 11 AM to 3.30 PM", R.drawable.icetea));
        data.add(new ctdata("Chocoholicas", (float) 4,"Rs 35-40","From 10.10 AM to 3.30 PM", R.drawable.chocoholicas));
        data.add(new ctdata("Fruiteazers", (float) 4,"Rs 25-50","From 10.10 AM to 3.30 PM", R.drawable.fruiteazers));
        data.add(new ctdata("Soups", (float) 2.5,"Rs 30","From 10.10 AM to 3.30 PM", R.drawable.soup));
        return data;
    }
}
