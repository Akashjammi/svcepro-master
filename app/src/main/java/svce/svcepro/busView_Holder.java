package svce.svcepro;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

/**
 * Created by harishananth on 28/09/17.
 */

public class busView_Holder extends RecyclerView.ViewHolder {
    CardView cv;
    TextView date,day,info;
    busView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.buscard);
        date = (TextView) itemView.findViewById(R.id.busdatetxt);
        day = (TextView) itemView.findViewById(R.id.busdaytxt);
        info = (TextView) itemView.findViewById(R.id.busnumtxt);




    }
}
