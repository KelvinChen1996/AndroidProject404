package com.williamsumitromytextview.pikachisemarket.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.activities.DetailEventActivity;
import com.williamsumitromytextview.pikachisemarket.adapters.AdapterHomeFranchiseList;
import com.williamsumitromytextview.pikachisemarket.adapters.AdapterListEvent;
import com.williamsumitromytextview.pikachisemarket.model.DataListEvent;
import com.williamsumitromytextview.pikachisemarket.model.ListEvent;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment implements AdapterListEvent.itemClickCallBack {
    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_JUDUL = "EXTRA_JUDUL";
    private static final String EXTRA_ISI = "EXTRA_ISI";
    private static final String EXTRA_JADWAL = "EXTRA_JADWAL";
    private static final String EXTRA_ALAMAT = "EXTRA_ALAMAT";

    private RecyclerView recView;
    private AdapterListEvent adapterListEvent;
    private ArrayList listdata;

    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        listdata = (ArrayList) DataListEvent.getListEvent();
        recView = (RecyclerView) view.findViewById(R.id.rec_list_Event);

        recView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapterListEvent = new AdapterListEvent(DataListEvent.getListEvent(), getActivity());
        recView.setAdapter(adapterListEvent);
        adapterListEvent.setitemclickcallback(this);
        return view;
    }

    @Override
    public void onItemClick(int p) {
        ListEvent event = (ListEvent) listdata.get(p);
        Intent intent = new Intent(getActivity(), DetailEventActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_JUDUL, event.getJUDULEVENT());
        extras.putString(EXTRA_ISI, event.getISIEVENT());
        extras.putString(EXTRA_JADWAL, event.getWAKTUEVENT());
        extras.putString(EXTRA_ALAMAT, event.getALAMATEVENT());
        intent.putExtra(BUNDLE_EXTRAS, extras);
        startActivity(intent);
    }
}
