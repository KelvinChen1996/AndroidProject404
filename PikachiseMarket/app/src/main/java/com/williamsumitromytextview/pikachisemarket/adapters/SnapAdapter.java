package com.williamsumitromytextview.pikachisemarket.adapters;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.model.Snap;

import java.util.ArrayList;

/**
 * Created by william on 04/04/2017.
 */

public class SnapAdapter extends RecyclerView.Adapter<SnapAdapter.ViewHolder> {


    private ArrayList<Snap> mSnaps;
    // Disable touch detection for parent recyclerView if we use vertical nested recyclerViews
    private View.OnTouchListener mTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            v.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    };

    public SnapAdapter() {
        mSnaps = new ArrayList<>();
    }

    public void addSnap(Snap snap) {
        mSnaps.add(snap);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_snap, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Snap snap = mSnaps.get(position);
        holder.snapTextView.setText(snap.getText());

        holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder.recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setOnFlingListener(null);
        new LinearSnapHelper().attachToRecyclerView(holder.recyclerView);


        holder.recyclerView.setAdapter(new AdapterBestRatings(snap.getApps()));
    }

    @Override
    public int getItemCount() {
        return mSnaps.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView snapTextView;
        public RecyclerView recyclerView;

        public ViewHolder(View itemView) {
            super(itemView);
            snapTextView = (TextView) itemView.findViewById(R.id.snapTextView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView);
        }

    }
}