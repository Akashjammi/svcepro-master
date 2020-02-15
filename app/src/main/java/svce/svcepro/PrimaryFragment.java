package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PrimaryFragment extends Fragment {
    FloatingActionButton fab;
    ImageView photos, bus, clubs, account, website, dev, results;
    TextView explore, links;
    CardView cv;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.primary_layout, null);
        //photos=(Button)view.findViewById(R.id.photosbutton);
        bus = view.findViewById(R.id.busbutton);
        clubs = view.findViewById(R.id.clubsbutton);
        account = view.findViewById(R.id.abtsvcebutton);
        website = view.findViewById(R.id.webbutton);
//        dev=(Button)view.findViewById(R.id.devbutton);
        results = view.findViewById(R.id.resbutton);
        explore = (TextView) view.findViewById(R.id.exploretxt);

        // cv.setFocusableInTouchMode(true);
       /* photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),photosActivity.class);
                startActivity(intent);
            }
        }); */
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bustab.class);
                startActivity(intent);

            }
        });
        clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), clubspie.class);
                startActivity(intent);
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), aboutcollege.class);
                startActivity(intent);
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webloader.class);
                intent.putExtra("firsel", 7);
                startActivity(intent);
            }
        });
//        dev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getActivity(),bedev.class);
//                startActivity(intent);
///
//            }
//        });

        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webloader.class);
                intent.putExtra("firsel", 6);
                startActivity(intent);

            }
        });
        List<maindat> maindat = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewcat);
        mainRecycler_View_Adapter adapter = new mainRecycler_View_Adapter(maindat, getActivity());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setNestedScrollingEnabled(false);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switch (position) {

                            case 0:
                                Intent intent = new Intent(getActivity(), rsemester.class);
                                startActivity(intent);
                                break;
                            case 1:
                                Intent nerintent = new Intent(getActivity(), Placements.class);
                                startActivity(nerintent);
                                break;
                            case 2:
                                Intent neintent = new Intent(getActivity(), webloader.class);
                                neintent.putExtra("firsel", 5);
                                startActivity(neintent);
                                break;
                            case 3:
                                Intent nepintent = new Intent(getActivity(), studentasso.class);
                                startActivity(nepintent);
                                break;
                            case 4:
                                Intent neqintent = new Intent(getActivity(), bout.class);
                                startActivity(neqintent);
                                break;

                        }
                        // do whatever
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        switch (position) {
                            case 1:
                                //Toast.makeText(getActivity(),"item one long",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }
                })
        );
        Typeface type1 = Typeface.createFromAsset(getContext().getAssets(), "fonts/billieBarred.ttf");
        explore.setTypeface(type1);
        explore.setText("Explore!");


        {
            List<svceimgdata> svceimgdatas = fill_with_dataimg();

            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerviewimg);
            svceimgrecyadapter adapter2 = new svceimgrecyadapter(svceimgdatas, getActivity());
            recyclerView2.setAdapter(adapter2);
            LinearLayoutManager horizontalLayoutManagaer2
                    = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//            recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            recyclerView2.setLayoutManager(horizontalLayoutManagaer2);


            RecyclerView.ItemAnimator itemAnimator2 = new DefaultItemAnimator();
            itemAnimator2.setAddDuration(1000);
            itemAnimator2.setRemoveDuration(1000);
            recyclerView2.setItemAnimator(itemAnimator);

            recyclerView2.addOnItemTouchListener(
                    new RecyclerItemClickListener(getActivity(), recyclerView2, new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            switch (position) {

                            }
                            // do whatever
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            switch (position) {
                                case 1:
                                    //Toast.makeText(getActivity(),"item one long",Toast.LENGTH_SHORT).show();
                                    break;
                            }
                            // do whatever
                        }
                    })
            );

        }

        return view;

    }

    public List<maindat> fill_with_data() {

        List<maindat> data = new ArrayList<>();

        data.add(new maindat("Students Corner", "Dig into this section for notes,timetables,question papers and many other essential resources", "https://cdn.pixabay.com/photo/2017/02/24/02/37/classroom-2093744_1280.jpg"));
        //data.add(new data("Bus Schedule", "Anyone can drive a car,It takes someone special to drive a college bus", R.drawable.svcebus));
        data.add(new maindat("Placements", "Choose a job you love, and you will never have to work a day in your life", "https://cdn.pixabay.com/photo/2017/08/04/17/56/application-2580867_1280.jpg"));
        data.add(new maindat("Anti Ragging", "Blowing out someone else's candle doesnt make yours shine any brighter", "https://upload.wikimedia.org/wikipedia/commons/5/5d/StompLOGO_2012_flat_Vector.jpg"));
        //data.add(new data("Clubs", "Let the enthusiasm and energy of the group be your fuel", R.drawable.gllb));
        data.add(new maindat("Student Association", "Its nice to be important but its more important to be nice", "https://www.svce.ac.in/images/slide/stucoun2018.jpg"));
        data.add(new maindat("Developers", "Three fundamental aspects for software development Lazy,Simple and Perfect", "https://cdn.pixabay.com/photo/2016/11/19/14/00/code-1839406_960_720.jpg"));

        //data.add(new data("Bus Routes", "Two roads diverged in a wood and I took the one less travelled by and that has made all the difference", R.drawable.busroute));
        //data.add(new data("Be a developer", "Innovation distinguishes between a leader and a follower", R.drawable.bedev));
        return data;
    }

    public List<svceimgdata> fill_with_dataimg() {

        List<svceimgdata> data = new ArrayList<>();


        //data.add(new svceimgdata("Our logo","https://upload.wikimedia.org/wikipedia/en/7/71/SVCE_logo.png"));
        data.add(new svceimgdata("Main Entrance", "https://upload.wikimedia.org/wikipedia/commons/5/5c/SVCE_entrance_close_up.jpg"));
        data.add(new svceimgdata("SVCE 1985", "https://upload.wikimedia.org/wikipedia/en/5/5f/Svceoldcamp.jpg"));
        data.add(new svceimgdata("Auditorium", "https://www.svce.ac.in/resources/album/inductionprogram/data/images/img_1258.jpg"));
        data.add(new svceimgdata("Hostel", "https://www.collegesearch.in/upload/institute/images/large/121024112525_03_t.jpg"));
        data.add(new svceimgdata("Campus", "https://svce.ac.in/images/slide/index/16062014/06.jpg"));
        data.add(new svceimgdata("Ground", "https://schoolbook.getmyuni.com/assets/images/rev_img/5228__1978/142902315109_t.jpg"));


        return data;
    }


}