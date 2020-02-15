package svce.svcepro;

/**
 * Created by harishananth on 21/07/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;


public class svceimgrecyadapter extends RecyclerView.Adapter<svceimgView_Holder> {

    List<svceimgdata> list = Collections.emptyList();
    Context context;

    public svceimgrecyadapter(List<svceimgdata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public svceimgView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.svceimgcard, parent, false);
        svceimgView_Holder holder = new svceimgView_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(final svceimgView_Holder holder, final int position) {

        final svceimgdata item=list.get(position);

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).imgtitle);
        //holder.description.setText(list.get(p
        Glide.with(context).load(list.get(position).url).into(holder.imageView);


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
    public void insert(int position, svceimgdata svceimgdata) {
        list.add(position, svceimgdata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(svceimgdata svceimgdata) {
        int position = list.indexOf(svceimgdata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
