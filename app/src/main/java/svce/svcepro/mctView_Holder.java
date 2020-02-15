package svce.svcepro;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by harishananth on 20/12/16.
 */

public class mctView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title,desc,timing;
    RatingBar rb;
    ImageView imageView;

    mctView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView3);
        title = (TextView) itemView.findViewById(R.id.titlemc);
        timing = (TextView) itemView.findViewById(R.id.timings);
        rb=(RatingBar)itemView.findViewById(R.id.ratingBarmc);
        desc=(TextView)itemView.findViewById(R.id.cost);
        imageView = (ImageView) itemView.findViewById(R.id.finalimg);
    }
}
