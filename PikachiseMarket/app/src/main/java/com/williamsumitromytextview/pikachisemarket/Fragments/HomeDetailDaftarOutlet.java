package com.williamsumitromytextview.pikachisemarket.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.adapters.AdapterDaftarOutlet;
import com.williamsumitromytextview.pikachisemarket.adapters.AdapterListEvent;
import com.williamsumitromytextview.pikachisemarket.model.DataListDetailFranchiseDaftarOutlet;
import com.williamsumitromytextview.pikachisemarket.model.DataListEvent;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeDetailDaftarOutlet extends Fragment {

    private RecyclerView recView;
    private AdapterDaftarOutlet adapterDaftarOutlet;
    private ArrayList listdata;

    public HomeDetailDaftarOutlet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_detail_daftar_outlet, container, false);

        listdata = (ArrayList) DataListDetailFranchiseDaftarOutlet.getlistdetailfranchisedaftaroutlet();
        recView = (RecyclerView) view.findViewById(R.id.recyclerviewDaftarOutlet);

        recView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapterDaftarOutlet = new AdapterDaftarOutlet(DataListDetailFranchiseDaftarOutlet.getlistdetailfranchisedaftaroutlet(), getActivity());
        recView.setAdapter(adapterDaftarOutlet);
//        adapterListEvent.setitemclickcallback(this);
        return view;
    }

}
