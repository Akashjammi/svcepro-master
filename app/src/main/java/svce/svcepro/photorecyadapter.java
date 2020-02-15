package svce.svcepro;

/**
 * Created by harishananth on 16/07/17.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static svce.svcepro.Constants.TAG;

/**
 * Created by harishananth on 20/12/16.
 */

public class photorecyadapter extends RecyclerView.Adapter<photoView_Holder> {


    List<photodata> list = Collections.emptyList();
    Context context;

    public photorecyadapter(List<photodata> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @Override
    public photoView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.photocard, parent, false);
        photoView_Holder holder = new photoView_Holder(v);


        return holder;

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onBindViewHolder(final photoView_Holder holder, final int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.caption.setText(list.get(position).caption);
        //holder.description.setText(list.get(position).description)
        holder.author.setText(list.get(position).author);
        holder.date.setText(list.get(position).date);

        Glide.with(context).load(list.get(position).url).placeholder(R.drawable.svcelog)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .dontAnimate()
                .override(400,200).into(holder.photo);

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
    public void insert(int position, photodata cdata) {
        list.add(position, cdata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(photodata cdata) {
        int position = list.indexOf(cdata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
