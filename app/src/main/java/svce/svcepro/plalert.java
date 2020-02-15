package svce.svcepro;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by harishananth on 01/01/18.
 */

public class plalert extends Dialog {
    public Activity c;
    public Dialog d;
    public Switch aSwitch;
    public TextView mail,call,dismiss;
    public plalert(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        d=this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.plalert);
        mail=(TextView)findViewById(R.id.mailpl);
        call=(TextView)findViewById(R.id.callpl);
mail.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND,Uri.fromParts(
                "mailto","svceplacement@gmail.com",null));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "svceplacement@gmail.com" });
        c.startActivity(Intent.createChooser(emailIntent, "Send Email"));
    }
});
call.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String phone = "875 27152000";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        c.startActivity(intent);
    }
});


    }



}
