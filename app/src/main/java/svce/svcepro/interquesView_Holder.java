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

public class interquesView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView data,count;
    RatingBar rb;
    ImageView imageView;

    interquesView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.intercard);
        data = (TextView) itemView.findViewById(R.id.datatxt);
        count = (TextView) itemView.findViewById(R.id.count);



    }
}
