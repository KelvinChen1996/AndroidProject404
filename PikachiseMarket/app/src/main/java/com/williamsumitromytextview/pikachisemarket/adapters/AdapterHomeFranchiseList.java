package com.williamsumitromytextview.pikachisemarket.adapters;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.model.ListFranchiseHome;

import java.util.List;

/**
 * Created by william on 07/04/2017.
 */

public class AdapterHomeFranchiseList extends RecyclerView.Adapter<AdapterHomeFranchiseList.EventHolder> {
    private List<ListFranchiseHome> listfranchisehome;
    private LayoutInflater inflater;

    private itemClickCallBack itemclickcallback;

    public AdapterHomeFranchiseList(List<ListFranchiseHome> listfranchisehome, Context c) {
        this.inflater = LayoutInflater.from(c);
        this.listfranchisehome = listfranchisehome;
    }

    public void setitemclickcallback(final itemClickCallBack itemclickcallback) {
        this.itemclickcallback = itemclickcallback;
    }

    @Override
    public AdapterHomeFranchiseList.EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_home_franchise_list, parent, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterHomeFranchiseList.EventHolder holder, int position) {
        ListFranchiseHome franchiseelist = listfranchisehome.get(position);
        holder.namafranchise.setText(franchiseelist.getNamaFranchise());
        holder.namaptfranchise.setText(franchiseelist.getNamaPTFranchise());
        holder.nfranchisee.setText(franchiseelist.getJumlahFranchisee());
        holder.gambarbanner.setImageResource(franchiseelist.getBannerFranchise());
    }

    @Override
    public int getItemCount() {
        return listfranchisehome.size();
    }

    public interface itemClickCallBack {
        void onItemClick(int p);
    }

    public class EventHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView namafranchise, namaptfranchise, nfranchisee;
        private ImageView gambarbanner;
        private View container;

        public EventHolder(View itemView) {
            super(itemView);
            namafranchise = (TextView) itemView.findViewById(R.id.homefranchiselistNamaFranchise);
            namaptfranchise = (TextView) itemView.findViewById(R.id.homefranchiselistNamaPerusahaanFranchise);
            nfranchisee = (TextView) itemView.findViewById(R.id.homefranchiselistjumlahFranchisee);
            gambarbanner = (ImageView) itemView.findViewById(R.id.homefranchiselistGambar);
            container = itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.cont_item_root) {
                itemclickcallback.onItemClick(getAdapterPosition());
            } else {
                //nnati yang icon share, dll
            }
        }
    }
}
