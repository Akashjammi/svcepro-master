package svce.svcepro;

/**
 * Created by harishananth on 16/07/17.
 */

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class newsView_Holder extends RecyclerView.ViewHolder  {

    CardView cv;
    TextView title,desc,clicktxt;
    Context context;
    ImageView newimg,downimg;

    newsView_Holder(final View itemView) {
        super(itemView);
        context=itemView.getContext();
        cv = (CardView) itemView.findViewById(R.id.cardViewnews);
        title = (TextView) itemView.findViewById(R.id.newstitle);
        desc=(TextView)itemView.findViewById(R.id.newssubtitle);
        newimg=(ImageView)itemView.findViewById(R.id.newsimg);
        clicktxt=(TextView)itemView.findViewById(R.id.clicktxt);
        downimg=(ImageView)itemView.findViewById(R.id.downloadimg);



itemView.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        Intent browserintent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.svce.ac.in/"));
        context.startActivity(browserintent);
        return false;
    }
});

    }


}