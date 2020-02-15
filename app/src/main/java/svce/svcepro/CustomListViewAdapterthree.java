package svce.svcepro;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by harishananth on 11/10/16.
 */

public class CustomListViewAdapterthree extends ArrayAdapter<ourlist> {

    Context context;

    public CustomListViewAdapterthree(Context context, int resourceId,
                                    List<ourlist> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView name;
        TextView subone;
        TextView subtwo;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        ourlist ourlist = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.ourlist, null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.titlemc);
            holder.subone=(TextView)convertView.findViewById(R.id.subone);
            holder.subtwo=(TextView)convertView.findViewById(R.id.subtwo);
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.name.setText(ourlist.getname());
        holder.subone.setText(ourlist.getsubone());
        holder.subtwo.setText(ourlist.getsubtwo());

        holder.imageView.setImageResource(ourlist.getImageId());

        return convertView;
    }
}
