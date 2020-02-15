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

public class plView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title, name;
    RatingBar rb;
    ImageView plimg;

    plView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.plcard);
        title = (TextView) itemView.findViewById(R.id.titlepl);
        name = (TextView) itemView.findViewById(R.id.namepl);
        plimg = (ImageView) itemView.findViewById(R.id.plimg);
    }

    // cafe coffe day

}