package com.williamsumitromytextview.pikachisemarket.Fragments;


import android.os.Bundle;
import android.support.annotation.ArrayRes;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.adapters.AdapterHomeFranchiseList;
import com.williamsumitromytextview.pikachisemarket.adapters.SnapAdapter;
import com.williamsumitromytextview.pikachisemarket.model.App;
import com.williamsumitromytextview.pikachisemarket.model.DataListFranchiseHome;
import com.williamsumitromytextview.pikachisemarket.model.ListFranchiseHome;
import com.williamsumitromytextview.pikachisemarket.model.Snap;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements AdapterHomeFranchiseList.itemClickCallBack {

    private View view;
    private RecyclerView rvFranchiseBest, rvHomeFranchiseList;
    private ArrayList listdata;
    private AdapterHomeFranchiseList adapterHomeFranchiseList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        rvFranchiseBest = (RecyclerView) view.findViewById(R.id.recyclerviewFranchiseBest);
        rvFranchiseBest.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFranchiseBest.setHasFixedSize(true);


//        listdata = (ArrayList) DataListFranchiseHome.getlistfranchisehome();
//        rvHomeFranchiseList = (RecyclerView) view.findViewById(R.id.recyclerviewFranchiseList);
//        rvHomeFranchiseList.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//
//        adapterHomeFranchiseList = new AdapterHomeFranchiseList(DataListFranchiseHome.getlistfranchisehome(), getActivity());
//        rvHomeFranchiseList.setAdapter(adapterHomeFranchiseList);
//        adapterHomeFranchiseList.setitemclickcallback(this);

        List<App> bestRating = getBestRating();
        SnapAdapter snapAdapter = new SnapAdapter();

        snapAdapter.addSnap(new Snap(Gravity.CENTER_HORIZONTAL, "Best Rating", bestRating));
        snapAdapter.addSnap(new Snap(Gravity.CENTER_HORIZONTAL, "Newst Franchise", bestRating));

        rvFranchiseBest.setAdapter(snapAdapter);
        return view;
    }

    private List<App> getBestRating() {
        List<App> apps = new ArrayList<>();
        apps.add(new App("McDonald's", R.drawable.logo_mcdonalds, 3.93f));
        apps.add(new App("SUBWAY®", R.drawable.logo_subway, 3.84f));
        apps.add(new App("KFC", R.drawable.logo_kfc, 3.82f));
        apps.add(new App("Burger King", R.drawable.logo_burgerking, 3.75f));
        apps.add(new App("Pizza Hut", R.drawable.logo_pizza, 3.7f));
        apps.add(new App("7 Eleven", R.drawable.logo_7eleven, 3.68f));
        apps.add(new App("Wyndham Hotels and Resorts", R.drawable.logo_wyndhamhotelsandresorts, 3.65f));
        apps.add(new App("InterContinental Hotels and Resorts", R.drawable.logo_inter, 3.62f));
        apps.add(new App("Hilton Hotels & Resorts", R.drawable.logo_hiltonhotelsresorts, 3.6f));
        apps.add(new App("Marriott International", R.drawable.logo_marriottinternational, 3.58f));
        return apps;
    }

    @Override
    public void onItemClick(int p) {

    }
}
