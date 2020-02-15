package svce.svcepro;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class aboutcollege extends AppCompatActivity implements AdapterView.OnItemClickListener{

    public static final String[] titles = new String[]{"In November 1985 the college was granted permission to conduct engineering courses in the disciplines of Mechanical Engineering, Electronics and Communication Engineering and Computer Science Engineering, awarded by the University of Madras.  The college complex at Nazarathpet (near Poonamallee) was inaugurated on April 8, 1985 by , former Governor of Tamil Nadu. In 1991, the college shifted into its new campus at Pennalur, near the town of Sriperumbudur. SVCE received approval from the All India Council for Technical Education the same year. Courses in Electrical & Electronics Engineering and Chemical Engineering Courses were started in 1994. The college celebrated its decennial in March 1995 in the presence of former Minister of State for Commerce and present home minister of the Government of India Shri . In 1996 the college began a course in Information Technology and was the first college in the country to do so.The college obtained an ISO 9001:2000 certification in 2002.The college subscribes to most major technical journals including those by the IEEE, ACM and ASME. Over 59,000 volumes and 200 CDs are available and around 400 print and online journals are subscribed.The 15 acres (653,400.0 sq ft) facility has a swimming pool, synthetic and clay tennis courts, turf cricket ground, basketball, football grounds,badminton, volleyball courts and a 400-meter track for athletics"};

    public static final Integer[] images = {R.drawable.svce};
    Integer y, x;


    ListView listView;
    List<rowitem> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutcollege);
        rowItems = new ArrayList<rowitem>();
        for (int i = 0; i < titles.length; i++) {
            rowitem item = new rowitem(images[i], titles[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.abtlist);
        CustomListViewAdaptertwo adapter = new CustomListViewAdaptertwo(this,
                R.layout.abtlistitem, rowItems);
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
