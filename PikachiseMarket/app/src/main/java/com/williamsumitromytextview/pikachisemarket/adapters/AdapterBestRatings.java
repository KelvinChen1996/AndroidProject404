package com.williamsumitromytextview.pikachisemarket.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.model.App;

import java.util.List;

/**
 * Created by william on 04/04/2017.
 */

public class AdapterBestRatings extends RecyclerView.Adapter<AdapterBestRatings.ViewHolder> {

    private List<App> appList;

    public AdapterBestRatings(List<App> mApps) {
        appList = mApps;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(AdapterBestRatings.ViewHolder holder, int position) {
        App app = appList.get(position);
        holder.imageView.setImageResource(app.getDrawable());
        holder.nameTextView.setText(app.getName());
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView nameTextView;
        public TextView ratingTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
        }

        @Override
        public void onClick(View view) {
            Log.d("App", appList.get(getAdapterPosition()).getName());
        }
    }
}