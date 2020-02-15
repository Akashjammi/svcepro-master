package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

import co.intentservice.chatui.fab.FloatingActionButton;

/**
 * Created by harishananth on 17/09/16.
 */
public class studentasso extends Activity  {
    ListView listView;

    String[] stcouncil={"President - Miss. Madhuvanti M., IV - CS","Vice President - Mr. Harish Anantharaman ,IV - IT","General Secretary - Mr. Pranav Karnth.M III-ECE","Joint Secretary - Miss. Yagna Madhavan III-CH","Sports Secretary - Mr Heramba Ganesh, III-EEE","Treasurer - Miss. Pavitra Mohandas, II-CSE","PG Representative - Miss. Hemavathy M, II-CS"};
    android.support.design.widget.FloatingActionButton fab;
    Integer r,x,y,z,t;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentassolay);

        listView = (ListView) findViewById(R.id.names);
        fab=(android.support.design.widget.FloatingActionButton) findViewById(R.id.fabby);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:studentcouncil@svce.ac.in"));
                try {
                    startActivity(emailIntent);
                } catch (ActivityNotFoundException e) {
                    //TODO: Handle case where no email app is available
                }
            }
        });

        listView.setAdapter(new ArrayAdapter<String>(studentasso.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        new Async().execute();



        }

    public class Async extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();


            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:stcouncil)
            {
                publishProgress(value);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

        }
    }


}
