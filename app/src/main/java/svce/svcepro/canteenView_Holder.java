package svce.svcepro;

/**
 * Created by harishananth on 25/12/16.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by harishananth on 20/12/16.
 */

public class canteenView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title, desc;
    RatingBar rb;
    ImageView imageView;

    canteenView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView2);
        title = (TextView) itemView.findViewById(R.id.titlemc);
        rb = (RatingBar) itemView.findViewById(R.id.ratingBarmc);
        desc = (TextView) itemView.findViewById(R.id.decpt);
        imageView = (ImageView) itemView.findViewById(R.id.finalimg);
    }

    // cafe coffe day

}