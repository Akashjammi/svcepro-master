package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class clgmap extends AppCompatActivity{

    public static final String[] titles = new String[]{"COLLEGE CAMPUS\n" +
            "\n" +
            "1 TEMPLE AND MANDAPAM\n" +
            "\n" +
            "50, PLAYGROUND\n" +
            "\n" +
            "2. MCA & IMS.\n" +
            "\n" +
            "ELECTRICAL & ELECTRONICS ENGINEERING\n" +
            "\n" +
            "52. 53, COURT\n" +
            "\n" +
            "4, MECHANICAL ENGINEERING\n" +
            "\n" +
            "COMPUTER SCIENCE & ENGINEERING\n" +
            "\n" +
            "54, BASKETBALL COURT\n" +
            "55 \n" +
            "6, INFORMATION TECHNOLOGY\n" +
            "\n" +
            "7, CHEMICAL ENGINEERING\n" +
            "\n" +
            "56, VOLLEYBALL COURT\n" +
            "57, CHEMICAL ENGINEERING LAB\n" +
            "\n" +
            "BIOTECHNOLOGY\n" +
            "\n" +
            "58. BUS BAY-2\n" +
            "\n" +
            "10. MARINE ENGINEERING\n" +
            "\n" +
            "59. F00D COURT\n" +
            "\n" +
            "11, MARINE ENGINEERING LAB & WORKSH0P\n" +
            "\n" +
            "60. LIBRARY BLOCK\n" +
            "\n" +
            "2. FLUID MECHINERY LAB\n" +
            "\n" +
            "61. PARKING\n" +
            "\n" +
            "13, THERMALENGINEERING LAB & AUTOMOBILE ENGINEERING LAB \n" +
            "14, MACHINE SHOP\n" +
            "\n" +
            "63, RAIN WATER HARVESINSP\n" +
            "\n" +
            "15, WORKSHOP\n" +
            "\n" +
            "64. HANDBALL COURT\n" +
            "\n" +
            "16, LIBRARY & ADMINISTRATION\n" +
            "\n" +
            "17, DRAFTING HALL\n" +
            "\n" +
            "18, CLASS ROOM BLOCK 1\n" +
            "\n" +
            "19, CLASS ROOM BLOCK 2\n" +
            "\n" +
            "20, CLASS R00M BLOCK 3\n" +
            "\n" +
            "21, CANTEEN\n" +
            "\n" +
            "22. MENS HOSTEL 1\n" +
            "\n" +
            "MEN'S HOSTEL 2\n" +
            "\n" +
            "24, MENS HOSTEL 3\n" +
            "\n" +
            "25, MEN'S HOSTEL 4\n" +
            "\n" +
            "26, MENS HOSTEL 5\n" +
            "\n" +
            "27, MENS HOTEL DINING HALL\n" +
            "\n" +
            "28, LADIES HOSTEL\n" +
            "\n" +
            "29. LADIES HOSTEL 1 DINING HALL\n" +
            "\n" +
            "30, STAFF QUARTERS\n" +
            "\n" +
            "31. FACULTY QUARTERS\n" +
            "\n" +
            "32, SUB STATION\n" +
            "\n" +
            "33. UNDER GROUND SUMP\n" +
            "\n" +
            "34. OVERHEAD TANK & PUMP HOUSE\n" +
            "\n" +
            "35, OPEN AIR AUDITORIUM\n" +
            "\n" +
            "36. SECURITY OFFICE\n" +
            "\n" +
            "37. EFFLUENT TREATMENT PLANT\n" +
            "\n" +
            "38, SWIMMING POOL\n" +
            "\n" +
            "39. RO PLANT\n" +
            "\n" +
            "40 MEDICAL CENTRE\n" +
            "\n" +
            "41. TECHNOLOGY INNOVATION CENTRE, CHEMISTRY & PHYSICS\n" +
            "\n" +
            "42. LADIES HOSTEL 2\n" +
            "\n" +
            "43, MENS HOSTEL 6\n" +
            "\n" +
            "44. CLASS ROOM BLOCK 4\n" +
            "\n" +
            "45, ECE & CIVIL\n" +
            "\n" +
            "46. LADIES HOSTEL 3\n" +
            "\n" +
            "47. SRI JAYENDRA SARASWATHI PLATINUM JUBILEE COMPLEX\n" +
            "\n" +
            "48, MENS HOSTEL 7\n" +
            "\n" +
            "49. CLASS ROOM BLOCK 5\n"};

    ImageView map;

    boolean isImageFitToScreen=false;
    ListView listView;



        @SuppressLint("NewApi")
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.map);
            map=(ImageView)findViewById(R.id.map);
            map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isImageFitToScreen) {
                        isImageFitToScreen=false;
                        map.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                        map.setAdjustViewBounds(true);
                    }else{
                        isImageFitToScreen=true;
                        map.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
                        map.setScaleType(ImageView.ScaleType.FIT_XY);
                    }
                }
            });


            listView = (ListView) findViewById(R.id.days);

            listView.setAdapter(new ArrayAdapter<String>(clgmap.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
            new automobile().execute();


        }


        public class automobile extends AsyncTask<Void ,String,String>
        {

            ArrayAdapter<String> arrayAdapter;
            int count;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();

                count=0;

            }

            @Override
            protected String doInBackground(Void... voids) {

                for(String value:titles)
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

            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);


            }
        }



    }



