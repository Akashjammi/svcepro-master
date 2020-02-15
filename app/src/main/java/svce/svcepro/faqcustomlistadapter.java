package svce.svcepro;

/**
 * Created by harishananth on 09/10/16.
 */
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class faqcustomlistadapter extends ArrayAdapter<faqrowitem> {

    Context context;

    public faqcustomlistadapter(Context context, int resourceId,
                                 List<faqrowitem> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        TextView Question;
        TextView Answer;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        faqrowitem faqrowitem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.faqlist, null);
            holder = new ViewHolder();
            holder.Question= (TextView) convertView.findViewById(R.id.question);
            holder.Answer= (TextView) convertView.findViewById(R.id.answer);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.Question.setText(faqrowitem.getQuestion());
        holder.Answer.setText(faqrowitem.getAnswer());

        return convertView;
    }
}
