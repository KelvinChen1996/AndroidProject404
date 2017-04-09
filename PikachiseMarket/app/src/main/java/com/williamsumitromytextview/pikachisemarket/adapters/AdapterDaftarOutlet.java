package com.williamsumitromytextview.pikachisemarket.adapters;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.model.ListDetailFranchiseDaftarOutlet;
import com.williamsumitromytextview.pikachisemarket.model.ListEvent;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by william on 08/04/2017.
 */

public class AdapterDaftarOutlet extends RecyclerView.Adapter<AdapterDaftarOutlet.EventHolder> {
    private List<ListDetailFranchiseDaftarOutlet> listdaftaroutlet;
    private LayoutInflater inflater;

    public AdapterDaftarOutlet(List<ListDetailFranchiseDaftarOutlet> listdaftaroutlet, Context c) {
        this.inflater = LayoutInflater.from(c);
        this.listdaftaroutlet = listdaftaroutlet;
    }

    @Override
    public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_home_detail_daftar_outlet, parent, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(EventHolder holder, int position) {
        ListDetailFranchiseDaftarOutlet daftarOutlet = listdaftaroutlet.get(position);
        holder.namaFranchisee.setText(daftarOutlet.getNamaPTFranchisee());
        holder.alamatFranchisee.setText(daftarOutlet.getAlamatFranchisee());
        holder.contactFranchisee.setText(daftarOutlet.getContactFranchisee());
        holder.ownerFranchisee.setText(daftarOutlet.getBossFranchisee());
        holder.tahunberdiriFranchisee.setText(daftarOutlet.getTanggalberdiriFranchisee());
    }

    @Override
    public int getItemCount() {
        return listdaftaroutlet.size();
    }

    public class EventHolder extends RecyclerView.ViewHolder {
        private TextView namaFranchisee, alamatFranchisee, contactFranchisee, ownerFranchisee, tahunberdiriFranchisee;
        private View Container;

        public EventHolder(View view) {
            super(view);
            namaFranchisee = (TextView) view.findViewById(R.id.homedetailfranchisedaftaroutletNamaFranchisee);
            alamatFranchisee = (TextView) view.findViewById(R.id.homedetailfranchisedaftaroutletAlamatFranchisee);
            contactFranchisee = (TextView) view.findViewById(R.id.homedetailfranchisedaftaroutletContactFranchisee);
            ownerFranchisee = (TextView) view.findViewById(R.id.homedetailfranchisedaftaroutletOwner);
            tahunberdiriFranchisee = (TextView) view.findViewById(R.id.homedetailfranchisedaftaroutletTahunBerdiri);
            Container = view.findViewById(R.id.homedetailfranchisedaftaroutletlayout);
        }
    }
}
