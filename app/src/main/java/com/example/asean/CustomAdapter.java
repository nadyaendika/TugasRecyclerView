package com.example.asean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private Context mContext;
    private Integer[] mImage;
    private String[] mTitle;
    private String[] msubTitle;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView subtitle;
        ImageView imgView;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.title = (TextView) itemView.findViewById(R.id.title);
            this.subtitle = (TextView) itemView.findViewById(R.id.subtitle);
            this.imgView = (ImageView) itemView.findViewById(R.id.imgcar);
        }
    }

    public CustomAdapter(Context mContext, Integer[] image,String[] title,String[] subTitle) {
        this.mContext = mContext;
        this.mImage = image;
        this.mTitle = title;
        this.msubTitle = subTitle;
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent,
                                           final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int i) {
        holder.title.setText(mTitle[i]);
        holder.subtitle.setText(msubTitle[i]);
        Picasso.with(mContext).load(mImage[i]).into(holder.imgView);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Position : "+i,Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mTitle.length;
    }
}
