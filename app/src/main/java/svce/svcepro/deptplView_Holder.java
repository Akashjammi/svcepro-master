package svce.svcepro;

/**
 * Created by harishananth on 06/01/18.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class deptplView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title;
    TextView description;

    deptplView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.pldcard);
        title = (TextView) itemView.findViewById(R.id.titlepld);
        description = (TextView) itemView.findViewById(R.id.descpld);
    }
}
