package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import pl.droidsonroids.gif.GifTextView;


public class pltwo extends Fragment {


    private ProgressDialog progDailog;
    ArrayList<String> list = new ArrayList<String>();
    ListView lv;
    TextView count;
    public GifTextView load;
    ArrayAdapter<String> arrayAdapter;
    Set<String> hs = new HashSet<>();
    TextView sv;




    public RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.plcompanies, null);
        lv=(ListView)v.findViewById(R.id.recruiters);
        count=(TextView)v.findViewById(R.id.countpl);
        load=(GifTextView)v.findViewById(R.id.busloadgif);
        sv=(TextView) v.findViewById(R.id.searchtxt);


        new Loader().execute();
        if(arrayAdapter!=null)
            arrayAdapter.notifyDataSetChanged();

        return v;
    }
    @Override
    public void onResume() {
        super.onResume();
        new Loader().execute();
    }
    public class Loader extends AsyncTask<Void, String, String> {


        Document doc=null,doc2=null,doc3=null,doc4=null;
        int val;
        Boolean status=false;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            arrayAdapter = (ArrayAdapter<String>) lv.getAdapter();


        }

        @Override
        protected String doInBackground(Void... voids) {

            do{
            try {
                doc = Jsoup.connect("https://www.svce.ac.in/place/recruit.php#nav").timeout(10*1000).get();
                doc2 = Jsoup.connect("https://www.svce.ac.in/place/rec2.php").timeout(30*1000).get();
                doc3 = Jsoup.connect("https://www.svce.ac.in/place/rec3.php").timeout(30*1000).get();
                doc4 = Jsoup.connect("https://www.svce.ac.in/place/rec4.php").timeout(30*1000).get();

            } catch (IOException e) {
                e.printStackTrace();
            }
            Elements table1 = null,table2=null,table3=null,table4=null; //select the first table.
            if (doc != null && doc2!=null && doc3!=null && doc4!=null) {
                table1 = doc.select("table");
                Elements rows1 = table1.select("tr");


                for (int i = 1; i < rows1.size(); i++) { //first row is the col names so skip it.
                    Element row = rows1.get(i);
                    Elements cols = row.select("td");

                    list.add(cols.get(1).text().toString());

                }
                table2 = doc2.select("table");
                Elements rows2 = table2.select("tr");


                for (int i = 1; i < rows2.size(); i++) { //first row is the col names so skip it.
                    Element row = rows2.get(i);
                    Elements cols = row.select("td");

                    list.add(cols.get(1).text().toString());

                }
                table3 = doc3.select("table");
                Elements rows3 = table3.select("tr");


                for (int i = 1; i < rows3.size(); i++) { //first row is the col names so skip it.
                    Element row = rows3.get(i);
                    Elements cols = row.select("td");

                    list.add(cols.get(1).text().toString());

                }
                table4 = doc4.select("table");
                Elements rows4 = table4.select("tr");


                for (int i = 1; i < rows4.size(); i++) { //first row is the col names so skip it.
                    Element row = rows4.get(i);
                    Elements cols = row.select("td");

                    list.add(cols.get(1).text().toString());

                }
                hs.addAll(list);
                list.clear();
                list.addAll(hs);
                Collections.sort(list);
                status=true;
                val=rows1.size()+rows2.size()+rows3.size()+rows4.size();


            }
            return "Added successfully";
        }while (status!=true);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if(val!=0)
            count.setText(String.valueOf(val-4));

            if(getActivity()!=null) {
                final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
                lv.setAdapter(adapter);
                load.setVisibility(View.INVISIBLE);
                sv.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        adapter.getFilter().filter(charSequence);
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
            }
        }
    }


}