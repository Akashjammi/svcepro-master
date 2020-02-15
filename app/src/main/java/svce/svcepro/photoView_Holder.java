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

public class photoView_Holder extends RecyclerView.ViewHolder  {

    CardView cv;
    TextView caption,author,date;
    Context context;
    ImageView photo,downimg;

    photoView_Holder(final View itemView) {
        super(itemView);
        context=itemView.getContext();
        cv = (CardView) itemView.findViewById(R.id.photocardview);
        caption = (TextView) itemView.findViewById(R.id.caption);
        author=(TextView)itemView.findViewById(R.id.author);
        date=(TextView)itemView.findViewById(R.id.date);
        photo=(ImageView)itemView.findViewById(R.id.photo);



    }


}