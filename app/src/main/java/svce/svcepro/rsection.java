package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class rsection extends AppCompatActivity {

    public int x, y, z;
    public RecyclerView recyclerView;
    ImageView bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsection);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        setTitle("Choose your Section");
        bg=(ImageView)findViewById(R.id.sectionimg);
        Glide.with(this).load("http://www.pbs.org/newshour/extra/app/uploads/2016/05/GettyImages-535837803-1024x768-1024x768.jpg").into(bg);

        switch (z) {
            case 1: { //auto
                List<data> data = fill_with_dataone();
                recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 2: { //biotech
                List<data> data = fill_with_dataone();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 3: { //chemical
                List<data> data = fill_with_datatwo();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 4: { //civil
                List<data> data = fill_with_dataone();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 8: { //cse
                List<data> data = fill_with_datathree();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 5: { //eee
                List<data> data = fill_with_datatwo();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 7: { //ece
                List<data> data = fill_with_datathree();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 6: { //it
                List<data> data = fill_with_datatwo();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 9: { //mech
                List<data> data = fill_with_datatwo();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
            case 10: { //marine
                List<data> data = fill_with_dataone();
                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));

                RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                itemAnimator.setAddDuration(1000);
                itemAnimator.setRemoveDuration(1000);
                recyclerView.setItemAnimator(itemAnimator);
                recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switcher(position);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
                break;
            }
        }




        }

        void switcher(int position)
        {
            switch (z) {
                case 1: { //automobile

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }

                case 2: { //biotech

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 3: { //chem

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 1: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 2);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 4: { //civil

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }

                    }
                    break;
                }
                case 5: { //eee

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 1: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 2);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 6: { //it

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 1: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 2);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 7: { //ece

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 1: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 2);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 2: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 3);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 8: { //cse

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 1: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 2);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 2: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 3);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 9: { //mech

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                        case 1: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 2);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }
                case 10: { //marine

                    switch (position) {
                        case 0: {
                            Intent newintent = new Intent(rsection.this, selectme.class);
                            newintent.putExtra("sec", 1);
                            newintent.putExtra("year", x);
                            newintent.putExtra("sem", y);
                            newintent.putExtra("sel", z);
                            startActivity(newintent);
                            break;
                        }
                    }
                    break;
                }


            }
        }
        public List<data> fill_with_dataone() {

            List<data> data = new ArrayList<>();

            data.add(new data("A SECTION", "Your seniors are performing a lot better! learn from them!", R.drawable.nasec));

            return data;
        }
        public List<data> fill_with_datatwo() {

            List<data> data = new ArrayList<>();

            data.add(new data("A SECTION", "The B section is performing a lot better! learn from them!", R.drawable.nasec));
            data.add(new data("B SECTION", "The A section is performing a lot better! learn from them!", R.drawable.nbsec));

            return data;
        }
        public List<data> fill_with_datathree() {

            List<data> data = new ArrayList<>();

            data.add(new data("A SECTION", "The B and C sections are performing a lot better! learn from them!", R.drawable.nasec));
            data.add(new data("B SECTION", "The A and C sections are performing a lot better! learn from them!", R.drawable.nbsec));
            data.add(new data("C SECTION", "The A and B sections are performing a lot better! learn from them!", R.drawable.ncsec));

            return data;
        }
    }

