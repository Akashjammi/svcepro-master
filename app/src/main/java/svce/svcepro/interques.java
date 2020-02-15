package svce.svcepro;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 12/01/18.
 */

public class interques extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interqueslay);
        setTitle("Interview Questions");
        List<interquesdata> interquesdata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyques);
        interquesrecyadapter adapter = new interquesrecyadapter(interquesdata,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            default:
                            {
                                Intent intent=new Intent(interques.this,interquesexp.class);
                                intent.putExtra("position",position);
                                startActivity(intent);
                            }

                        }
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {

                        }
                    }
                })
        );
    }
    public List<interquesdata> fill_with_data() {

        List<interquesdata> data = new ArrayList<>();

        data.add(new interquesdata("Tell me about yourself"));
        data.add(new interquesdata("What are your greatest strengths?"));
        data.add(new interquesdata("What are your greatest weaknesses?"));
        data.add(new interquesdata("Tell me about something you did – or failed to do – that you now feel a little ashamed of."));
        data.add(new interquesdata("Why are you leaving (or did you leave) this position?"));
        data.add(new interquesdata(" The \"Silent Treatment\""));
        data.add(new interquesdata("Why should I hire you?"));
        data.add(new interquesdata("Aren't you overqualified for this position?"));
        data.add(new interquesdata("Where do you see yourself five years from now?"));
        data.add(new interquesdata("Describe your ideal company, location and job"));
        data.add(new interquesdata("Why do you want to work at our company?"));
        data.add(new interquesdata("What are your career options right now?"));
        data.add(new interquesdata("Why have you been out of work so long?"));
        data.add(new interquesdata("Tell me honestly about the strong points and weak points of your boss (company, management team, etc.)"));
        data.add(new interquesdata("What good books have you read lately?"));
        data.add(new interquesdata("Tell me about a situation when your work was criticized"));
        data.add(new interquesdata("What are your outside interest?"));
        data.add(new interquesdata("The \"Fatal Flaw\" question"));
        data.add(new interquesdata("How do you feel about reporting to a younger person (minority, woman, etc)?"));
        data.add(new interquesdata("On confidential matters"));
        data.add(new interquesdata("Would you lie for the company?"));
        data.add(new interquesdata("Looking back, what would you do differently in your life?"));
        data.add(new interquesdata("Could you have done better in your last job?"));
        data.add(new interquesdata("Can you work under pressure?"));
        data.add(new interquesdata("What makes you angry?"));
        data.add(new interquesdata("Why aren't you earning more money at this stage of your career?"));
        data.add(new interquesdata("Who has inspired you in your life and why?"));
        data.add(new interquesdata("What was the toughest decision you ever had to make?"));
        data.add(new interquesdata("Tell me about the most boring job you've ever had"));
        data.add(new interquesdata("Have you been absent from work more than a few days in any previous position?"));
        data.add(new interquesdata("What changes would you make if you came on board?"));
        data.add(new interquesdata("I'm concerned that you don't have as much experience as we'd like in"));
        data.add(new interquesdata("How do you feel about working nights and weekends?"));
        data.add(new interquesdata("Are you willing to relocate or travel?"));
        data.add(new interquesdata("Do you have the stomach to fire people?  Have you had experience firing many people? "));
        data.add(new interquesdata("Why have you had so many jobs?"));
        data.add(new interquesdata("What do you see as the proper role/mission of… …a good (job title you're seeking); …a good manager; …an executive in serving the community; …a leading company in our industry; etc."));
        data.add(new interquesdata("What would you say to your boss if he's crazy about an idea, but you think it stinks?"));
        data.add(new interquesdata("How could you have improved your career progress?"));
        data.add(new interquesdata("What would you do if a fellow executive on your own corporate level wasn't pulling his/her weight…and this was hurting your department?"));
        data.add(new interquesdata("You've been with your firm a long time.  Won't it be hard switching to a new company?"));
        data.add(new interquesdata("May I contact your present employer for a reference?"));
        data.add(new interquesdata("Give me an example of your creativity (analytical skill…managing ability, etc.) "));
        data.add(new interquesdata("Where could you use some improvement?"));
        data.add(new interquesdata("What do you worry about?"));
        data.add(new interquesdata("How many hours a week do you normally work?"));
        data.add(new interquesdata("What's the most difficult part of being a (job title)?"));
        data.add(new interquesdata("The \"Hypothetical Problem\""));
        data.add(new interquesdata("What was the toughest challenge you've ever faced?"));
        data.add(new interquesdata("Have you consider starting your own business?"));
        data.add(new interquesdata("What are your goals?"));
        data.add(new interquesdata("What do you for when you hire people?"));
        data.add(new interquesdata("Sell me this stapler…(this pencil…this clock…or some other object on interviewer's desk)."));
        data.add(new interquesdata("\"The Salary Question\" – How much money do you want?"));
        data.add(new interquesdata("The Illegal Question"));
        data.add(new interquesdata("The \"Secret\" Illegal Question"));
        data.add(new interquesdata("What was the toughest part of your last job?"));
        data.add(new interquesdata("How do you define success…and how do you measure up to your own definition?"));
        data.add(new interquesdata("\"The Opinion Question\" – What do you think about …Abortion…The President…The Death Penalty…(or any other controversial subject)?"));
        data.add(new interquesdata("If you won $10 million lottery, would you still work?"));
        data.add(new interquesdata("Looking back on your last position, have you done your best work?"));
        data.add(new interquesdata("Why should I hire you from the outside when I could promote someone from within?"));
        data.add(new interquesdata("Tell me something negative you've heard about our company"));
        data.add(new interquesdata("On a scale of one to ten, rate me as an interviewer"));

        return data;
    }
}
