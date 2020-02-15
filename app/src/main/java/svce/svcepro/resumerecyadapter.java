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


public class resumerecyadapter extends RecyclerView.Adapter<resumeView_Holder> {

    List<resumedata> list = Collections.emptyList();
    Context context;

    public resumerecyadapter(List<resumedata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public resumeView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.resumecard, parent, false);
        resumeView_Holder holder = new resumeView_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(final resumeView_Holder holder, final int position) {

        final resumedata item=list.get(position);

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
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
    public void insert(int position, resumedata resumedata) {
        list.add(position, resumedata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(resumedata resumedata) {
        int position = list.indexOf(resumedata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
