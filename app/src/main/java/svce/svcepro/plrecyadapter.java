package svce.svcepro;

/**
 * Created by harishananth on 25/12/16.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by harishananth on 20/12/16.
 */

public class plrecyadapter extends RecyclerView.Adapter<plView_Holder> {

    List<pldata> list = Collections.emptyList();
    Context context;

    public plrecyadapter(List<pldata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public plView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plcard, parent, false);
        plView_Holder holder = new plView_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(plView_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        //holder.description.setText(list.get(position).description)
        holder.name.setText(list.get(position).name);
        holder.plimg.setImageResource(list.get(position).imageId);

        //animate(holder);

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, pldata pldata) {
        list.add(position, pldata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(pldata pldata) {
        int position = list.indexOf(pldata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
