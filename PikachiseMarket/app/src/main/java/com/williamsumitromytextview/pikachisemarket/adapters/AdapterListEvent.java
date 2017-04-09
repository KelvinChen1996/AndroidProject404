package com.williamsumitromytextview.pikachisemarket.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.model.ListEvent;

import java.util.List;

/**
 * Created by william on 07/04/2017.
 */

public class AdapterListEvent extends RecyclerView.Adapter<AdapterListEvent.EventHolder> {
    private List<ListEvent> listevent;
    private LayoutInflater inflater;

    private itemClickCallBack itemclickcallback;

    public AdapterListEvent(List<ListEvent> listevent, Context c) {
        this.inflater = LayoutInflater.from(c);
        this.listevent = listevent;
    }

    public void setitemclickcallback(final itemClickCallBack itemclickcallback) {
        this.itemclickcallback = itemclickcallback;
    }

    @Override
    public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_event, parent, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(EventHolder holder, int position) {
        ListEvent event = listevent.get(position);
        holder.judulevent.setText(event.getJUDULEVENT());
        holder.gambarevent.setImageResource(event.getGAMBAREVENT());
        holder.alamatevent.setText(event.getALAMATEVENT());
        holder.tanggalevent.setText(event.getWAKTUEVENT());
    }

    @Override
    public int getItemCount() {
        return listevent.size();
    }

    public interface itemClickCallBack {
        void onItemClick(int p);
    }

    class EventHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView judulevent, alamatevent, tanggalevent;
        private ImageView gambarevent;
        private View container;

        public EventHolder(View itemView) {
            super(itemView);

            judulevent = (TextView) itemView.findViewById(R.id.Event_Judul);
            alamatevent = (TextView) itemView.findViewById(R.id.Event_Alamat);
            tanggalevent = (TextView) itemView.findViewById(R.id.Event_Jadwal);
            gambarevent = (ImageView) itemView.findViewById(R.id.Event_Gambar);
            container = itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.cont_item_root) {
                itemclickcallback.onItemClick(getAdapterPosition());
            } else {

            }
        }
    }
}