package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
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

import com.bumptech.glide.Glide;
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


public class plone extends Fragment {

    private DatabaseReference root;
    ImageView img;

    private ProgressDialog progDailog;



    public RecyclerView recyclerView,recyclerView2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.plprofile, null);
        List<pldata> pldata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.plofficers);
        plrecyadapter adapter = new plrecyadapter(pldata, getActivity());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);


        List<deptpldata> deptpldata = fill_with_data2();

        RecyclerView recyclerView2 = (RecyclerView) v.findViewById(R.id.deptpl);
        deptplrecyadapter adapter2 = new deptplrecyadapter(deptpldata, getActivity());
        recyclerView2.setAdapter(adapter2);
        LinearLayoutManager horizontalLayoutManagaer2
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(horizontalLayoutManagaer2);
        recyclerView2.setNestedScrollingEnabled(false);


        RecyclerView.ItemAnimator itemAnimator2 = new DefaultItemAnimator();
        itemAnimator2.setAddDuration(1000);
        itemAnimator2.setRemoveDuration(1000);
        recyclerView2.setItemAnimator(itemAnimator);


        return v;
    }
    public List<pldata> fill_with_data() {

        List<pldata> data = new ArrayList<>();

        data.add(new pldata("Chief Placement Officer", "Prof. S. MURALEEDHARAN, MS,MBA",R.drawable.chiefpl));
        data.add(new pldata("Placement Officer", "Dr. E. NAKKEERAN, M.Tech., Ph.D.",R.drawable.plofficer));
        return data;
    }

    public List<deptpldata> fill_with_data2() {

        List<deptpldata> data = new ArrayList<>();

        data.add(new deptpldata("Mechanical Engineering", "Mr.G.Sarvanaram,M.E \n" + "Mr.J.Sivaramapandian M.E"));
        data.add(new deptpldata("Electroncis and Communication Engineering", "Mr.G.Loganathan M.E \n" + "Mr. P.Arul M.E"));
        data.add(new deptpldata("Computer Science and Engineering", "Mr.M.Sureshkumar M.E\n" + "Mr.M.Adimoolam M.Tech"));
        data.add(new deptpldata("Electrical and Electronics Engineering", "Mr.T.Annamalai M.E\n" + "Mr.A.Sureshkumar M.E"));
        data.add(new deptpldata("Chemical Engineering", "Dr.R.Palani Ph.D,MBA"));
        data.add(new deptpldata("Information Technology", "Mr.V.Rajaram M.E.\n" + "Mr.E.Sakthivel M.E"));
        data.add(new deptpldata("Automobile Engineering", "Mr.E.Ravindar Rao M.E"));
        data.add(new deptpldata("Bio Technology", "Mr.S. Naga Vignesh M.S"));
        data.add(new deptpldata("Civil Engineering", "Mr.R.Mathiyazhagan M.E"));
        data.add(new deptpldata("Computer Applications", "Mr.M.P.Lakshmana Kumar,M.E"));


        return data;
    }


}