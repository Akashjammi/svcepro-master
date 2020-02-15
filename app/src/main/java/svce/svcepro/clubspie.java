package svce.svcepro;

/**
 * Created by harishananth on 12/01/17.
 */
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Highlight;
import com.github.mikephil.charting.utils.PercentFormatter;

import java.util.ArrayList;

import static android.R.attr.duration;
import static android.R.attr.switchMinWidth;

public class clubspie extends AppCompatActivity {

    private RelativeLayout activity_main;
    private PieChart mChart;
    //display pie chart
    private float[] yData={20,10,15,30,15,10};
    private String[] xData={"NCC","NSS","Redcross","Care","Leo","Music"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubspie);
        Bundle extras=getIntent().getExtras();

setTitle("Select a Club");




        //Toast.makeText(this,"total is "+total,Toast.LENGTH_LONG).show();
        // Toast.makeText(this,"cc is "+cc+dc+mc+kc+bc,Toast.LENGTH_SHORT).show();





        //adding values to array list


       activity_main=(RelativeLayout)findViewById(R.id.mylayout);
        mChart = new PieChart(this);
        //add pie chart to main acivity
        activity_main.addView(mChart);
        activity_main.setBackgroundColor(Color.rgb(64,64,64));
        //activity_main.setBackgroundColor(Color.BLACK);

        //configure pie chart
        mChart.setUsePercentValues(true);
        mChart.setDescription("Clubs in SVCE");

        //enable hole and configure

        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColorTransparent(true);
        mChart.setHoleRadius(24);
        mChart.setTransparentCircleRadius(30);


        //enable rotation of chart by touch

        mChart.setRotationAngle(0);
        mChart.setRotationEnabled(true);

        //set chart value selected listenr
        mChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
                //display msg when value selected
                if (e== null)
                    return;
                switch (e.getXIndex())
                {
                    case 0: {//ncc
                        Toast.makeText(clubspie.this,"Registrations for NCC are not yet open",Toast.LENGTH_SHORT).show();
                /*Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 3);
                startActivity(newint); */
                        break;
                    }
                    case 1: { //nss
                        Toast.makeText(clubspie.this,"Registrations for NSS are not yet open",Toast.LENGTH_SHORT).show();
               /* Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 4);
                startActivity(newint);*/
                        break;
                    }
                    case 2: { //redcross
                        Intent newint = new Intent(clubspie.this, webloader.class);
                        newint.putExtra("firsel", 1);
                        startActivity(newint);
                        break;
                    }
                    case 3: { //care
                        Intent newint = new Intent(clubspie.this, webloader.class);
                        newint.putExtra("firsel", 2);
                        startActivity(newint);
                        break;
                    }
                    case 4: { //leo
                        Intent newint = new Intent(clubspie.this, webloader.class);
                        newint.putExtra("firsel", 3);
                        startActivity(newint);
                        break;
                    }
                    case 5:  //music
                    {
                        Intent newint = new Intent(clubspie.this, webloader.class);
                        newint.putExtra("firsel", 4);
                        startActivity(newint);
                        break;

                    }
                }
                Toast.makeText(clubspie.this,xData[e.getXIndex()] +"=" + e.getVal() +"%" ,Toast.LENGTH_SHORT).show();




            }

            @Override
            public void onNothingSelected() {

            }
        });




        //add data
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                addData();

            }

        }, 300);

        // addData();

        //customize legends

        Legend l = mChart.getLegend();
        l.setTextColor(Color.WHITE);
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        l.setXEntrySpace(7);
        l.setYEntrySpace(5);

    }


    private void addData(){
        ArrayList<Entry> yVals1=new ArrayList<Entry>();

        for(int i=0; i< yData.length;i++)
            yVals1.add(new Entry(yData[i], i));

        ArrayList<String> xVals=new ArrayList<String>();

        for(int i=0; i< xData.length;i++)
            xVals.add(xData[i]);

        //create pie data set
        PieDataSet dataSet=new PieDataSet(yVals1,"Legend");
        dataSet.setSliceSpace(3);
        dataSet.setSelectionShift(5);

        //add many colors

        ArrayList<Integer> colors=new ArrayList<Integer>();

        for(int c: ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);

        for(int c:ColorTemplate.JOYFUL_COLORS)
            colors.add(c);

        for(int c: ColorTemplate.LIBERTY_COLORS)
            colors.add(c);

        for(int c: ColorTemplate.PASTEL_COLORS)
            colors.add(c);

        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);

        //initiate pie data objects now
        PieData data=new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.BLACK);

        mChart.setData(data);
        //undo all highlights
        mChart.highlightValues(null);

        //update pie chart
        mChart.invalidate();





    }


}
