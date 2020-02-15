package svce.svcepro;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by harishananth on 03/10/17.
 */

public class customalert extends Dialog implements android.view.View.OnClickListener{
    public Activity c;
    public Dialog d;
  public Switch aSwitch;
    public TextView txt,dismiss;
    public customalert(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        d=this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.customalert);
        txt=(TextView)findViewById(R.id.textveri);
        dismiss=(TextView)findViewById(R.id.dismisstxt);
        aSwitch = (Switch) findViewById(R.id.notifyswitch);
        aSwitch.setOnClickListener(this);
        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.dismiss();
            }
        });

    }


    @Override
    public void onClick(View v) {
        if(aSwitch.isChecked()) {
            txt.setText("Notifications are enabled for Svce Pro");
            txt.setTextColor(Color.GREEN);
        }
        else
        {
            txt.setText("Notifications have been disabled for Svce Pro");
            txt.setTextColor(Color.RED);
        }
    }
}
