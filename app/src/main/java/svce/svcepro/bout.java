package svce.svcepro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 11/10/16.
 */

public class bout extends AppCompatActivity {
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bout);
        setTitle("Developers");
        List<pldata> pldata = fill_with_data();

        recyclerView = (RecyclerView)findViewById(R.id.devrecy);
        plrecyadapter adapter = new plrecyadapter(pldata, bout.this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(bout.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
    }
    public List<pldata> fill_with_data() {

        List<pldata> data = new ArrayList<>();
        data.add(new pldata("Project Incharge ","Sreenidhi M.J IVrd Year IT",R.drawable.sree));
        data.add(new pldata("Senior Developer","Subramanya Sujith M IVrd Year IT",R.drawable.sujith));
        data.add(new pldata("Senior developer","Akash JP IIIrd Year IT",R.drawable.akashcomp));
        data.add(new pldata("Cloud developer","HareHaran IIIrd Year IT",R.drawable.akashcomp));
        data.add(new pldata("Junior developer","Pradeepan IIrd Year IT",R.drawable.akashcomp));

        return data;
    }
}