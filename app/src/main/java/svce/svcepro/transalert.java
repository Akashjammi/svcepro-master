package svce.svcepro;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by harishananth on 31/12/17.
 */

public class transalert extends Dialog{
    public Activity c;
    public Dialog d;
    public Switch aSwitch;
    public TextView exit,call;
    public transalert(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        d=this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.transportconv);
        exit=(TextView)findViewById(R.id.exittxt);
        call=(TextView)findViewById(R.id.calltxt);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.dismiss();
           }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "9841084517";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                c.startActivity(intent);

            }
        });


    }

}
