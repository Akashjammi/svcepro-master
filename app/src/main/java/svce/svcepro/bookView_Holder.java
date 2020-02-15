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
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class bookView_Holder extends RecyclerView.ViewHolder  {

    CardView cv;
    TextView title,author;
    Context context;
    ImageView bookimg;
    RatingBar rating;

    bookView_Holder(final View itemView) {
        super(itemView);
        context=itemView.getContext();
        cv = (CardView) itemView.findViewById(R.id.bookcardv);
        title = (TextView) itemView.findViewById(R.id.booktitle);
        author=(TextView)itemView.findViewById(R.id.bookauthor);
        rating=(RatingBar)itemView.findViewById(R.id.bookrating);
        bookimg=(ImageView)itemView.findViewById(R.id.bookimg);



    }


}