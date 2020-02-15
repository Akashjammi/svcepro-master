package svce.svcepro;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 06/01/17.
 */

public class testfeceb extends Fragment{
    int x,y,z,t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        x=getArguments().getInt("year");
        y=getArguments().getInt("sem");
        z=getArguments().getInt("sel");
        t=getArguments().getInt("sec");
        View view= inflater.inflate(R.layout.nfinallay,null);
        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewfinal);
        finalRecycler_View_Adapter adapter = new finalRecycler_View_Adapter(data,getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (y) {
                    case 1: {
                   //     Toast.makeText(getActivity(),"first",Toast.LENGTH_SHORT).show();
                        switch (position) {
                            case 0: {
                                //Toast.makeText(getActivity(), "Class Timetable first", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/bn31lj"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/bn31lj"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 2: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/4I6ap8"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/4I6ap8"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 3: {
                     //   Toast.makeText(getActivity(),"third",Toast.LENGTH_SHORT).show();
                        switch (position) {
                            case 0: {
                               // Toast.makeText(getActivity(), "Class Timetable Not Available", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/bmLdgQ"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/bmLdgQ"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);

                                break;
                            }


                        }
                        break;
                    }
                    case 4: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/QCvN4R"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/QCvN4R"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 5: {
                        switch (position) {
                            case 0: {
                              //  Toast.makeText(getActivity(), "Class Timetable Not Available", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/7OsXj2"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/7OsXj2"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);

                                break;
                            }


                        }
                        break;
                    }
                    case 6: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(),bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/RX48dk"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/RX48dk"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 7: {
                        switch (position) {
                            case 0: {
                              //  Toast.makeText(getActivity(), "Class Timetable Not Available", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/Xl2F2D"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/Xl2F2D"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;

                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);

                                break;
                            }


                        }
                        break;
                    }
                    case 8: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), bustab.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/BR1LCH"));
                                startActivity(browserintent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/BR1LCH"));
                                startActivity(browserintent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), Newsactivity.class);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }

                }

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
        return view;
    }

    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("Timetable", "Casuals or Khaki today? You literally make my day <3 ", R.drawable.ntt));
        data.add(new data("Bus Schedule", "Make sure you keep a track of this unless you wanna travel by MTC", R.drawable.nbus));
        data.add(new data("Faculty Advisors", "These people want us to do well in the semesters more than we do", R.drawable.nteachers));
        data.add(new data("Notes", "Your one stop destination for all your last minute semester preparation (PS Sourced entirely from nerds)", R.drawable.nnotes));
        data.add(new data("Question Papers", "There is a certain happiness in seeing the question paper that your seniors had to go through ", R.drawable.nqp));
        data.add(new data("Notifications","Due to incessant rains the college will not be working today,Just kidding get up and go to college", R.drawable.nnotif));
        data.add(new data("Teachers", "From making you understand complex theroies to answering all your quirky questions :P These people can do it all! ", R.drawable.nteachers));
        data.add(new data("Office Bearers", "The lavishness of the symposiums is directly proportional to the effort exerted by these people", R.drawable.nofficeb));
        data.add(new data("College Map", "Helps when you get lost trying to escape from friends to whom you owe a treat ", R.drawable.nmap));


        return data;
    }
}