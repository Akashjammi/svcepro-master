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

public class interquesrecyadapter extends RecyclerView.Adapter<interquesView_Holder> {

    List<interquesdata> list = Collections.emptyList();
    Context context;
    int count=0;

    public interquesrecyadapter(List<interquesdata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public interquesView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.interquescard, parent, false);
        interquesView_Holder holder = new interquesView_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(interquesView_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.count.setText(String.valueOf(position+1));
        holder.data.setText(list.get(position).data);
        //holder.description.setText(list.get(position).description)

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
    public void insert(int position, interquesdata interquesdata) {
        list.add(position, interquesdata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(interquesdata interquesdata) {
        int position = list.indexOf(interquesdata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
