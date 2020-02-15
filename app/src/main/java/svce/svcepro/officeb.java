package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

/**
 * Created by harishananth on 14/10/16.
 */

public class officeb extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    String[] mech={"1-President-Mr.T.V.Praveen-IV year A","2-General secretary- Mr.A.Vishnuvarthan-III year– B","4-Treasurer-Mr.S.P.Arunram-III year – A","5-Executive members-Mr.R.Dhinesh Ram,Mr.R.Anand Vijay Raj-2nd year A,Mr.E.Y.Gladson-2nd year-A,Mr.M.R.Melvin-2nd year A,Mr.D.Kishore Kumar- 2nd year-A,Mr.S.Sharan-2nd year B,Mr.P.Sharan-Mr.V.Varun-2nd year B,Mr.M.Thirumugam-2nd year B,Mr.P.R.Mohammaed Zishan-2nd year-B"};
    String[] it={"1-President-HINDUMATHY.M-Final Year IT ‘A’ Batch","2-Vice President-SHEBUEL ASHER PAUL.J-Final Year IT ‘B’ Batch","3-Secretary-SHAKTHI NARAYAN.S.R-Third Year IT ‘B’ Batch","4-Treasurer-MALAVIKA.H-Third Year IT ‘A’ Batch","5-Executive Member-NANDHINI.R A-Second Year IT ‘A’ Batch","6-Executive Member-SABARESHAN.M M-Second Year IT ‘B’ Batch"};
    String[] ece={"1-President-Vishnu Srinivasan-Final Yr,ECE-C","2-Vice President-Deepika A-Final Yr,ECE-A","3-Secretary-Dhanraj Vedanth R-Third Yr,ECE-A","4-Treasurer-Joshua A Samuel-Third Yr,ECE-A","5-Joint Secretary - Lokesh B, Madumitha P-Second Yr,ECE-B","6-Executive Members-Keerthana T-Third Yr,ECE-B,lakshmi Narayanan N.V- Third Yr,ECE-B,Ms. Anantha Bhairavi-Third Yr,ECE-A, Jeyenth Kumar G.K-Third Yr,ECE-A,Roshini B.S-Third Yr,ECE-C,Sanjay P- Third Yr,ECE-C"};
    String[] cse={"1-President-A.Vikram -IV year CS c","2-Vice President- Aditi Prakash-IV year CS A","3-Secretory-S. Chran-III year CS A","4-Treasurer-K. Chandhini -III year CS A","5-Joint Secretary-Arjun Aravind-II year CS A","6-Executive Members- Amrutha Gurumoorthy (III year CS A),Hemanth Kumar(III year CS A),Nandagopal Sridhar (III year CS B),M.Noorjahan Fahema (III year CS B),J. Santhosh Kumar(III year CS C),Sathvik Manikantan N U(II year CS C),Dhivyalekha(II year CS A),Hariharasubramanium V(II year CS A),Koushika. K(II year CS B),Shravan Dheep R(II year CS C)"};
    String[] civil ={"1-PRESIDENT-Praveen Raj-4th year","2-GENERAL SECRETARY-Aruneshwar-3rd year","3- JOINT SECRETARY-Shanmuga Priyan-3rd year","4-TREASURER-Dinesh Kumar-2nd year","5-EXECUTIVE MEMBERs- Praveena-2nd year,Ashwini-2nd year,Nishanth-2nd year,Vijay Vishvesh-2nd year,Arjun.M-3rd year,BhuvaneshwarA.S.M-3rd year,Sree Swathi-3rd year"};
    String[] chem ={"1-President-S. Dhruv Chandhoh-4th year","2-Vice- President- Keerthiga R-3rd year","3-secretary- Sharanya S-4th year","4-Joint Secretary- Fazil Prabakaran M & Sharath J Kumar-3rd year"};
    String[]bio={"1-President: Gerra Vikram Kumar- IV yr B.Tech Biotech ","2-General Secretary: Nilavunesan.D -III yr B.Tech Biotech","3-Treasurer: Sneha.R yr B.Tech Biotech","4-Joint Secretary: Ricky Robinson.S III yr B.Tech Biotech ","5-Executive Members: Adhithiya Charlie & Vaishnavi Shankar-II yr B.Tech Biotech"};
    String[]auto ={"1- President-Mr. S. Praveen Kumar-Final year Automobile Engineering","2- General Secretary- Mr. M. Ramshan-III year Automobile Engineering","3- Treasurer - Mr. A. Dileepan -III year Automobile Engineering","4- Executive Member -Mr. R. Nithin Daniel Masilamoni -II year Automobile Engineering","5- Executive Member -Mr. B. Yoneshwar -II year Automobile Engineering"};            Integer x,y,z;
    String[]marine={"1.PRESIDENT-Mr.S.Aneesh Kumar-4th year","SECRETARY-Mr.K.Chola Raj-4th year","JOINT SECRETARY-Mr.J.Anoop-3rd year","TREASURER-Mr.P.Narendraraja-2nd year"};
    String[] eee={"1.PRESIDENT-Mr.A.J.Sriram-4th year-B","2.Vice president-Mr.A.Harish-4th year-A","GENERAL SECRETARY-Mr.R.Nishanth-3rd year B","JOINT SECRETARY-Ms.Aishwarya Rajan-3rd year-A","TREASURER-Ms.B.Deepika-3rd year-A,Mr.A.S.Ganeshkumar-3rd year-A,Mr.T.S.Srivathsan-3rd year-B,Ms.J.Narmatha-3rd year-B","OFFICE BEARERS-Mr.S.Jayaraman-3rd year-A,Ms.P.J.AminaUlFath Salima-3rd year-A,Mr.N.Yokeshwar-3rd year-B,Ms.A.Shri Lakshmi-3rd year-B,Mr.P.Dhinakaran-2nd year-A,Ms.A.Mary Delphin Breesha-2nd year-A,Mr.N.M.Vijayadith-2nd year-B,Ms.S.Varsha-2nd year-B"};
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttday);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        listView = (ListView) findViewById(R.id.days);

        listView.setAdapter(new ArrayAdapter<String>(officeb.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        switch (z)
        {
            case 1:
                new automobile().execute();
                break;
            case 2:
                new biotech().execute();
                break;
            case 3:
                new chemical().execute();
                break;
            case 4:
                new civil().execute();
                break;
            case 5:
                new eee().execute();
                break;
            case 6:
                new it().execute();
                break;
            case 7:
                new ece().execute();
                break;
            case 8:
                new comp().execute();
                break;
            case 9:
                new mech().execute();
                break;
            case 10:
                new marine().execute();
                break;
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public class marine extends AsyncTask<Void ,String,String>
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

            for(String value:marine)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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
    public class automobile extends AsyncTask<Void ,String,String>
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

            for(String value:auto)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class biotech extends AsyncTask<Void ,String,String>
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

            for(String value:bio)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class chemical extends AsyncTask<Void ,String,String>
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

            for(String value:chem)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class comp extends AsyncTask<Void ,String,String>
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

            for(String value:cse)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class civil extends AsyncTask<Void ,String,String>
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

            for(String value:civil)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class eee extends AsyncTask<Void ,String,String>
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

            for(String value:eee)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class ece extends AsyncTask<Void ,String,String>
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

            for(String value:ece)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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

    public class it extends AsyncTask<Void ,String,String>
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

            for(String value:it)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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
    public class mech extends AsyncTask<Void ,String,String>
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

            for(String value:mech)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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
