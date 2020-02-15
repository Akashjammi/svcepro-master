package svce.svcepro;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by harishananth on 12/01/18.
 */

public class interquesexp extends AppCompatActivity {
    int x;
    TextView ques,answer;
    String question,answers;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interquesexp);
        Bundle extras=getIntent().getExtras();
        x = extras.getInt("position");
        setTitle("Interview Q & A");
        ques=(TextView)findViewById(R.id.ques);
        answer=(TextView)findViewById(R.id.answer);
        //Toast.makeText(this,"position is "+x,Toast.LENGTH_SHORT).show();
        new LongOperation().execute();
    }
    private class LongOperation extends AsyncTask<String[], Void, String[]> {
        String[] res=new String[2];
        @Override
        protected String[] doInBackground(String[]... params) {
            switch (x) {
                case 0: {
                    question = getResources().getString(R.string.interques1);
                    answers = getResources().getString(R.string.interans1);
                    break;
                }

                case 1: {
                    question = getResources().getString(R.string.interques2);
                    answers = getResources().getString(R.string.interans2);
                    break;
                }

                case 2: {
                    question = getResources().getString(R.string.interques3);
                    answers = getResources().getString(R.string.interans3);
                    break;
                }

                case 3: {
                    question = getResources().getString(R.string.interques4);
                    answers = getResources().getString(R.string.interans4);
                    break;
                }

                case 4: {
                    question = getResources().getString(R.string.interques5);
                    answers = getResources().getString(R.string.interans5);
                    break;
                }

                case 5: {
                    question = getResources().getString(R.string.interques6);
                    answers = getResources().getString(R.string.interans6);
                    break;
                }

                case 6: {
                    question = getResources().getString(R.string.interques7);
                    answers = getResources().getString(R.string.interans7);
                    break;
                }

                case 7: {
                    question = getResources().getString(R.string.interques8);
                    answers = getResources().getString(R.string.interans8);
                    break;
                }

                case 8: {
                    question = getResources().getString(R.string.interques9);
                    answers = getResources().getString(R.string.interans9);
                    break;
                }

                case 9: {
                    question = getResources().getString(R.string.interques10);
                    answers = getResources().getString(R.string.interans10);
                    break;
                }

                case 10: {
                    question = getResources().getString(R.string.interques11);
                    answers = getResources().getString(R.string.interans11);
                    break;
                }

                case 11: {
                    question = getResources().getString(R.string.interques12);
                    answers = getResources().getString(R.string.interans12);
                    break;
                }

                case 12: {
                    question = getResources().getString(R.string.interques13);
                    answers = getResources().getString(R.string.interans13);
                    break;
                }

                case 13: {
                    question = getResources().getString(R.string.interques14);
                    answers = getResources().getString(R.string.interans14);
                    break;
                }

                case 14: {
                    question = getResources().getString(R.string.interques15);
                    answers = getResources().getString(R.string.interans15);
                    break;
                }

                case 15: {
                    question = getResources().getString(R.string.interques16);
                    answers = getResources().getString(R.string.interans16);
                    break;
                }

                case 16: {
                    question = getResources().getString(R.string.interques17);
                    answers = getResources().getString(R.string.interans17);
                    break;
                }

                case 17: {
                    question = getResources().getString(R.string.interques18);
                    answers = getResources().getString(R.string.interans18);
                    break;
                }

                case 18: {
                    question = getResources().getString(R.string.interques19);
                    answers = getResources().getString(R.string.interans19);
                    break;
                }

                case 19: {
                    question = getResources().getString(R.string.interques20);
                    answers = getResources().getString(R.string.interans20);
                    break;
                }

                case 20: {
                    question = getResources().getString(R.string.interques21);
                    answers = getResources().getString(R.string.interans21);
                    break;
                }

                case 21: {
                    question = getResources().getString(R.string.interques22);
                    answers = getResources().getString(R.string.interans22);
                    break;
                }

                case 22: {
                    question = getResources().getString(R.string.interques23);
                    answers = getResources().getString(R.string.interans23);
                    break;
                }

                case 23: {
                    question = getResources().getString(R.string.interques24);
                    answers = getResources().getString(R.string.interans24);
                    break;
                }

                case 24: {
                    question = getResources().getString(R.string.interques25);
                    answers = getResources().getString(R.string.interans25);
                    break;
                }

                case 25: {
                    question = getResources().getString(R.string.interques26);
                    answers = getResources().getString(R.string.interans26);
                    break;
                }

                case 26: {
                    question = getResources().getString(R.string.interques27);
                    answers = getResources().getString(R.string.interans27);
                    break;
                }

                case 27: {
                    question = getResources().getString(R.string.interques28);
                    answers = getResources().getString(R.string.interans28);
                    break;
                }

                case 28: {
                    question = getResources().getString(R.string.interques29);
                    answers = getResources().getString(R.string.interans29);
                    break;
                }

                case 29: {
                    question = getResources().getString(R.string.interques30);
                    answers = getResources().getString(R.string.interans30);
                    break;
                }
                case 30:{
                    question=getResources().getString(R.string.interques31);
                    answers=getResources().getString(R.string.interans31);
                    break;
                }
                case 31: {
                    question = getResources().getString(R.string.interques32);
                    answers = getResources().getString(R.string.interans32);
                    break;
                }
                case 32: {
                    question = getResources().getString(R.string.interques33);
                    answers = getResources().getString(R.string.interans33);
                    break;
                }
                case 33: {
                    question = getResources().getString(R.string.interques34);
                    answers = getResources().getString(R.string.interans34);
                    break;
                }
                case 34: {
                    question = getResources().getString(R.string.interques35);
                    answers = getResources().getString(R.string.interans35);
                    break;
                }
                case 35: {
                    question = getResources().getString(R.string.interques36);
                    answers = getResources().getString(R.string.interans36);
                    break;
                }
                case 36: {
                    question = getResources().getString(R.string.interques37);
                    answers = getResources().getString(R.string.interans37);
                    break;
                }
                case 37: {
                    question = getResources().getString(R.string.interques38);
                    answers = getResources().getString(R.string.interans38);
                    break;
                }
                case 38: {
                    question = getResources().getString(R.string.interques39);
                    answers = getResources().getString(R.string.interans39);
                    break;
                }
                case 39: {
                    question = getResources().getString(R.string.interques40);
                    answers = getResources().getString(R.string.interans40);
                    break;
                }
                case 40: {
                    question = getResources().getString(R.string.interques41);
                    answers = getResources().getString(R.string.interans41);
                    break;
                }
                case 41: {
                    question = getResources().getString(R.string.interques42);
                    answers = getResources().getString(R.string.interans42);
                    break;
                }
                case 42: {
                    question = getResources().getString(R.string.interques43);
                    answers = getResources().getString(R.string.interans43);
                    break;
                }
                case 43: {
                    question = getResources().getString(R.string.interques44);
                    answers = getResources().getString(R.string.interans44);
                    break;
                }
                case 44: {
                    question = getResources().getString(R.string.interques45);
                    answers = getResources().getString(R.string.interans45);
                    break;
                }
                case 45: {
                    question = getResources().getString(R.string.interques46);
                    answers = getResources().getString(R.string.interans46);
                    break;
                }
                case 46: {
                    question = getResources().getString(R.string.interques47);
                    answers = getResources().getString(R.string.interans47);
                    break;
                }
                case 47: {
                    question = getResources().getString(R.string.interques48);
                    answers = getResources().getString(R.string.interans48);
                    break;
                }
                case 48: {
                    question = getResources().getString(R.string.interques49);
                    answers = getResources().getString(R.string.interans49);
                    break;
                }
                case 49: {
                    question = getResources().getString(R.string.interques50);
                    answers = getResources().getString(R.string.interans50);
                    break;
                }
                case 50: {
                    question = getResources().getString(R.string.interques51);
                    answers = getResources().getString(R.string.interans51);
                    break;
                }
                case 51: {
                    question = getResources().getString(R.string.interques52);
                    answers = getResources().getString(R.string.interans52);
                    break;
                }
                case 52: {
                    question = getResources().getString(R.string.interques53);
                    answers = getResources().getString(R.string.interans53);
                    break;
                }
                case 53: {
                    question = getResources().getString(R.string.interques54);
                    answers = getResources().getString(R.string.interans54);
                    break;
                }
                case 54: {
                    question = getResources().getString(R.string.interques55);
                    answers = getResources().getString(R.string.interans55);
                    break;
                }
                case 55: {
                    question = getResources().getString(R.string.interques56);
                    answers = getResources().getString(R.string.interans56);
                    break;
                }
                case 56: {
                    question = getResources().getString(R.string.interques57);
                    answers = getResources().getString(R.string.interans57);
                    break;
                }
                case 57: {
                    question = getResources().getString(R.string.interques58);
                    answers = getResources().getString(R.string.interans58);
                    break;
                }
                case 58: {
                    question = getResources().getString(R.string.interques59);
                    answers = getResources().getString(R.string.interans59);
                    break;
                }
                case 59: {
                    question = getResources().getString(R.string.interques60);
                    answers = getResources().getString(R.string.interans60);
                    break;
                }
                case 60: {
                    question = getResources().getString(R.string.interques61);
                    answers = getResources().getString(R.string.interans61);
                    break;
                }
                case 61: {
                    question = getResources().getString(R.string.interques62);
                    answers = getResources().getString(R.string.interans62);
                    break;
                }
                case 62: {
                    question = getResources().getString(R.string.interques63);
                    answers = getResources().getString(R.string.interans63);
                    break;
                }
                case 63: {
                    question = getResources().getString(R.string.interques64);
                    answers = getResources().getString(R.string.interans64);
                    break;
                }
            }
            res[0]=question;
            res[1]=answers;

            return res;
        }

        @Override
        protected void onPostExecute(String[] result) {
            ques.setText(result[0]);
            answer.setText(result[1]);

        }


        @Override
        protected void onPreExecute() {
        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }
    }
}
