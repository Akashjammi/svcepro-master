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

public class mctrecyadapter extends RecyclerView.Adapter<mctView_Holder> {

    List<ctdata> list = Collections.emptyList();
    Context context;

    public mctrecyadapter(List<ctdata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public mctView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mccard, parent, false);
        mctView_Holder holder = new mctView_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(mctView_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        //holder.description.setText(list.get(position).description)
        holder.timing.setText(list.get(position).timing);
        holder.rb.setRating(list.get(position).rval);
        holder.desc.setText(list.get(position).desc);
        holder.imageView.setImageResource(list.get(position).imageId);

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
    public void insert(int position, ctdata ctdata) {
        list.add(position, ctdata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(cdata cdata) {
        int position = list.indexOf(cdata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
