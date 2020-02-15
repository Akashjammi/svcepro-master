package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

import at.blogc.android.views.ExpandableTextView;


public class plthree extends Fragment {

    private DatabaseReference root;
    ImageView img;

    private ProgressDialog progDailog;


Button proceed;
    public RecyclerView recyclerView;
    TextView downtext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.plthree, null);
        final ExpandableTextView expandableTextView = (ExpandableTextView) v.findViewById(R.id.expandableTextView);
        final TextView buttonToggle = (TextView) v.findViewById(R.id.rdm);
        final ExpandableTextView expandableTextView2 = (ExpandableTextView) v.findViewById(R.id.expandableTextView2);
        final TextView buttonToggle2 = (TextView) v.findViewById(R.id.rdm2);
        proceed=(Button)v.findViewById(R.id.prob);
        downtext=(TextView)v.findViewById(R.id.downtxt);
        downtext.setPaintFlags(downtext.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);

        downtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager mManager = (DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                DownloadManager.Request mRqRequest = new DownloadManager.Request(
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/svce-pro-26e5f.appspot.com/o/AN%20EFFECTIVE%20RESUME%20FORMAT%20FOR%20STUDENTS%20(1)%20(1).pdf?alt=media&token=08b782e4-a682-4a66-b4c4-1ce8e12f4ae0"));
                mRqRequest.setDescription("Sample Resume");
//  mRqRequest.setDestinationUri(Uri.parse("give your local path"));
                long idDownLoad=mManager.enqueue(mRqRequest);
            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),interques.class);
                startActivity(intent);
            }
        });
// set animation duration via code, but preferable in your layout files by using the animation_duration attribute
        expandableTextView.setAnimationDuration(750L);

        // set interpolators for both expanding and collapsing animations
        expandableTextView.setInterpolator(new OvershootInterpolator());

// or set them separately
        expandableTextView.setExpandInterpolator(new OvershootInterpolator());
        expandableTextView.setCollapseInterpolator(new OvershootInterpolator());

// toggle the ExpandableTextView
        buttonToggle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                buttonToggle.setText(expandableTextView.isExpanded() ? R.string.plexp : R.string.placementtipcl);
                expandableTextView.toggle();
            }
        });

// but, you can also do the checks yourself
        buttonToggle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (expandableTextView.isExpanded())
                {
                    expandableTextView.collapse();
                    buttonToggle.setText("Read more");
                }
                else
                {
                    expandableTextView.expand();
                    buttonToggle.setText("Collapse");
                }
            }
        });

// listen for expand / collapse event

        expandableTextView2.setAnimationDuration(750L);

        // set interpolators for both expanding and collapsing animations
        expandableTextView2.setInterpolator(new OvershootInterpolator());

// or set them separately
        expandableTextView2.setExpandInterpolator(new OvershootInterpolator());
        expandableTextView2.setCollapseInterpolator(new OvershootInterpolator());

// toggle the ExpandableTextView
        buttonToggle2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                buttonToggle2.setText(expandableTextView2.isExpanded() ? R.string.plexp : R.string.placementtipcl);
                expandableTextView2.toggle();
            }
        });

// but, you can also do the checks yourself
        buttonToggle2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (expandableTextView2.isExpanded())
                {
                    expandableTextView2.collapse();
                    buttonToggle2.setText("Read more");
                }
                else
                {
                    expandableTextView2.expand();
                    buttonToggle2.setText("Collapse");
                }
            }
        });
        List<resumedata> resumedata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.resumerecy);
        resumerecyadapter adapter = new resumerecyadapter(resumedata, getActivity());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        List<bookdata> bookdata = fill_with_data2();

        RecyclerView recyclerView2 = (RecyclerView) v.findViewById(R.id.booksrecy);
        bookrecyadapter adapter2 = new bookrecyadapter(bookdata, getActivity());
        recyclerView2.setAdapter(adapter2);
        LinearLayoutManager horizontalLayoutManagaer2
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(horizontalLayoutManagaer2);

        RecyclerView.ItemAnimator itemAnimator2 = new DefaultItemAnimator();
        itemAnimator2.setAddDuration(1000);
        itemAnimator2.setRemoveDuration(1000);
        recyclerView2.setItemAnimator(itemAnimator2);

        return v;
    }
    public List<resumedata> fill_with_data() {

        List<resumedata> data = new ArrayList<>();

        data.add(new resumedata("https://i.pinimg.com/736x/ca/74/4b/ca744b64e471d800830ad3a58b1c177e--resume-layout-resume-writing.jpg"));
        data.add(new resumedata("https://i.pinimg.com/originals/26/21/55/2621558f24efbf03dfa12362b931cc53.png"));
        data.add(new resumedata("https://images.template.net/wp-content/uploads/2017/03/07083649/Modern-Resume-for-College-Student.jpg"));
        data.add(new resumedata("https://www.livecareer.com/images/uploaded/resume-examples-home-new/expanded/fast-food-server-food-restaurant-resume-example-emphasis-2-full-755x977.jpeg"));
        data.add(new resumedata("http://www.easyjob.net/wp-content/gallery/student/college-student-resume-examples.jpg"));
        data.add(new resumedata("https://i.pinimg.com/originals/d1/90/80/d190807a4a550d477bc5b8aed65318fd.jpg"));
       return data;
    }
    public List<bookdata> fill_with_data2() {

        List<bookdata> data = new ArrayList<>();

        data.add(new bookdata("https://images-na.ssl-images-amazon.com/images/I/51TzqQi5izL._SX384_BO1,204,203,200_.jpg","Quantitative Aptitude for Competitive Examinations","R S Aggarwal",4.5f));
        data.add(new bookdata("https://images-na.ssl-images-amazon.com/images/I/51-hMScr9VL._SX385_BO1,204,203,200_.jpg","Coding Interview Questions","Narasimha Karumanchi",4.0f));
        data.add(new bookdata("https://images-na.ssl-images-amazon.com/images/I/414h1QrMMzL._SX384_BO1,204,203,200_.jpg","Data Structures and Algorithms for GATE","Narasimha Karumanchi",4.0f));
        data.add(new bookdata("https://images-na.ssl-images-amazon.com/images/I/51L-JaikG7L._SX373_BO1,204,203,200_.jpg","Computer Networking: A Top-Down Approach"," Kurose James F & Ross Keith W",4.5f));
        data.add(new bookdata("https://images-na.ssl-images-amazon.com/images/I/41J6k0AL6yL._SX348_BO1,204,203,200_.jpg","Cracking the Coding Interview: 189 Programming Questions and Solutions","Gayle Laakmann McDowell",4.0f));
        data.add(new bookdata("https://images-eu.ssl-images-amazon.com/images/I/41CjfTb6WfL._SL218_PIsitb-sticker-arrow-dp,TopRight,12,-18_SH30_OU31_AC_US218_.jpg","Cracking the C, C++ and Java Interview","S.G. Ganesh and K.U. Subhash",4.5f));


        return data;
    }


}