package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class UpdatesFragment extends Fragment{

    int x=3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.third_layout,null);

        List<cdata> cdata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview2);
        Canteenrecyadapter adapter = new Canteenrecyadapter(cdata, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new CanteenItemClickListener(getActivity(), recyclerView ,new CanteenItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0: {
                                Toast.makeText(getActivity(), "Main Canteen", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Maincant.class);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Food Court", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(),foodcourt.class);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Gurunath details not available.", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "CCD", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ccd.class);
                                startActivity(newint);
                                break;
                            }
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                               // Toast.makeText(getActivity(),"item one long",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }
                })
        );
        return view;

    }
    public List<cdata> fill_with_data() {

        List<cdata> data = new ArrayList<>();

        data.add(new cdata("Main Canteen", (float) 5,"Hygenic and Reasonably priced, \n not many varieties though", R.drawable.mc));
        data.add(new cdata("Food Court", (float) 4.5,"This place is heaven!\n okay in a Relative manner", R.drawable.scc));
        data.add(new cdata("Gurunath Store",(float) 3.5 ,"Head here for stationaries \nand light snacks", R.drawable.guru));
        data.add(new cdata("Coffee Day", (float) 4,"Nothing can beat the cakes\n and Noodles", R.drawable.ccd));

        return data;
    }


}