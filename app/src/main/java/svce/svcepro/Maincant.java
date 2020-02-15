package svce.svcepro;

import android.content.Intent;
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

public class Maincant extends AppCompatActivity {
    int x=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        setTitle("SVCE Main Canteen");
        List<ctdata> ctdata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mctrecyadapter adapter = new mctrecyadapter(ctdata,Maincant.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(Maincant.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0:
                                Intent intent=new Intent(Maincant.this,maincantlist.class);
                                intent.putExtra("mainselec",1);
                                intent.putExtra("mainsel",1);
                                startActivity(intent);
                                break;
                            case 1:
                                Intent intent1=new Intent(Maincant.this,maincantlist.class);
                                intent1.putExtra("mainselec",2);
                                intent1.putExtra("mainsel",1);
                                startActivity(intent1);
                                break;
                            case 2:
                                Intent intent2=new Intent(Maincant.this,maincantlist.class);
                                intent2.putExtra("mainselec",3);
                                intent2.putExtra("mainsel",1);
                                startActivity(intent2);
                                break;
                            case 3:
                                Intent intent3=new Intent(Maincant.this,maincantlist.class);
                                intent3.putExtra("mainselec",4);
                                intent3.putExtra("mainsel",1);
                                startActivity(intent3);
                                break;
                            case 4:
                                Intent intent4=new Intent(Maincant.this,maincantlist.class);
                                intent4.putExtra("mainselec",5);
                                intent4.putExtra("mainsel",1);
                                startActivity(intent4);
                                break;
                            case 5:
                                Intent intent5=new Intent(Maincant.this,maincantlist.class);
                                intent5.putExtra("mainselec",6);
                                intent5.putExtra("mainsel",1);
                                startActivity(intent5);
                                break;
                            case 6:
                                Intent intent6=new Intent(Maincant.this,maincantlist.class);
                                intent6.putExtra("mainselec",7);
                                intent6.putExtra("mainsel",1);
                                startActivity(intent6);
                                break;
                            case 7:
                                Intent intent7=new Intent(Maincant.this,maincantlist.class);
                                intent7.putExtra("mainselec",8);
                                intent7.putExtra("mainsel",1);
                                startActivity(intent7);
                                break;
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                //Toast.makeText(Maincant.this,"item one long",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(Maincant.this,userrate.class);
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

        data.add(new ctdata("Breakfast", (float) 4,"Rs 25 - Rs 45","From 7.45 AM to 8.30 AM", R.drawable.idli));
        data.add(new ctdata("Lunch", (float) 4.5,"Rs 35 - Rs 60","From 11 AM to 11.40 AM/12.05 PM to 12.45 PM", R.drawable.rice));
        data.add(new ctdata("Snacks",(float) 3.5 ,"Rs 15 per piece","From 8 AM to 4 PM", R.drawable.samosa));
        data.add(new ctdata("Chocolates", (float) 5,"Rs 5/10/20","From 8 AM to 4 PM", R.drawable.choci));
        data.add(new ctdata("Parle biscuits", (float) 3,"Rs 5/10/20","From 8 AM to 4 PM", R.drawable.parle));
        data.add(new ctdata("Chips", (float) 5,"Rs 5/10/20","From 8 AM to 4 PM", R.drawable.chips));
        data.add(new ctdata("Britannia biscuits", (float) 3,"Rs 5/10/20","From 8 AM to 4 PM", R.drawable.brittania));
        data.add(new ctdata("Soft drinks", (float) 5,"Rs 5/10/20","From 8 AM to 4 PM", R.drawable.pepsi));
        return data;
    }
}
