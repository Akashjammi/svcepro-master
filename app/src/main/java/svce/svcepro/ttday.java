package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
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

/**
 * Created by harishananth on 17/09/16.
 */
public class ttday extends Activity  {
    ListView listView;

    String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday"};

Integer r,x,y,z,t;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttday);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");

        t = extras.getInt("sec");
         listView = (ListView) findViewById(R.id.days);




    listView.setAdapter(new ArrayAdapter<String>(ttday.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
    new Async().execute();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0: {
                        Toast.makeText(ttday.this, "Monday", Toast.LENGTH_SHORT).show();
                        Intent newint = new Intent(ttday.this,ttperiod.class);
                        newint.putExtra("sec",t);
                        newint.putExtra("year",x);
                        newint.putExtra("sem",y);
                        newint.putExtra("sel",z);
                        newint.putExtra("day",0);
                        startActivity(newint);
                        break;
                    }
                    case 1: {
                        Toast.makeText(ttday.this, "Tuesday", Toast.LENGTH_SHORT).show();
                        Intent newint = new Intent(ttday.this,ttperiod.class);
                        newint.putExtra("sec",t);
                        newint.putExtra("year",x);
                        newint.putExtra("sem",y);
                        newint.putExtra("sel",z);
                        newint.putExtra("day",1);
                        startActivity(newint);
                        break;
                    }
                    case 2: {
                        Toast.makeText(ttday.this, "Wednesday", Toast.LENGTH_SHORT).show();
                        Intent newint = new Intent(ttday.this,ttperiod.class);
                        newint.putExtra("sec",t);
                        newint.putExtra("year",x);
                        newint.putExtra("sem",y);
                        newint.putExtra("sel",z);
                        newint.putExtra("day",2);
                        startActivity(newint);
                        break;
                    }
                    case 3: {
                        Toast.makeText(ttday.this, "Thursday", Toast.LENGTH_SHORT).show();
                        Intent newint = new Intent(ttday.this,ttperiod.class);
                        newint.putExtra("sec",t);
                        newint.putExtra("year",x);
                        newint.putExtra("sem",y);
                        newint.putExtra("sel",z);
                        newint.putExtra("day",3);
                        startActivity(newint);
                        break;
                    }
                    case 4: {
                        Toast.makeText(ttday.this, "Friday", Toast.LENGTH_SHORT).show();
                        Intent newint = new Intent(ttday.this,ttperiod.class);
                        newint.putExtra("sec",t);
                        newint.putExtra("year",x);
                        newint.putExtra("sem",y);
                        newint.putExtra("sel",z);
                        newint.putExtra("day",4);
                        startActivity(newint);
                        break;
                    }


                }

            }
        });


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
        progressBar= (ProgressBar)findViewById(R.id.progressBar);

        progressBar.setMax(10);
        progressBar.setProgress(0);
        progressBar.setVisibility(View.VISIBLE);
        count=0;

    }

    @Override
    protected String doInBackground(Void... voids) {

        for(String value:days)
        {
            publishProgress(value);
            try {
                Thread.sleep(100);
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
        progressBar.setProgress(count);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        progressBar.setVisibility(View.INVISIBLE);
    }
}


}
