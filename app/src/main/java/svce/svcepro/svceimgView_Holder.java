package svce.svcepro;

/**
 * Created by harishananth on 21/07/17.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 */

public class svceimgView_Holder extends RecyclerView.ViewHolder {


    CardView cv;
    TextView title;
    ImageView imageView;

    svceimgView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.svceimgcard);
        title = (TextView) itemView.findViewById(R.id.svceimgtitle);
        imageView = (ImageView) itemView.findViewById(R.id.svceimg);

    }
}