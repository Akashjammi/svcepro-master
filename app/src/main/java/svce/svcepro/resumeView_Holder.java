package svce.svcepro;

/**
 * Created by harishananth on 21/07/17.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 */

public class resumeView_Holder extends RecyclerView.ViewHolder {


    RelativeLayout cv;
    ImageView imageView;

    resumeView_Holder(View itemView) {
        super(itemView);
        cv = (RelativeLayout) itemView.findViewById(R.id.resumecard);
        imageView = (ImageView) itemView.findViewById(R.id.resumeimg);

    }
}