package svce.svcepro;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by harishananth on 20/12/16.
 */

public class finalView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title;
    TextView description;
    ImageView imageView;

    finalView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.finalcard);
        title = (TextView) itemView.findViewById(R.id.svceimgtitle);
        description = (TextView) itemView.findViewById(R.id.desc);
        imageView = (ImageView) itemView.findViewById(R.id.finalimg);
    }
}
