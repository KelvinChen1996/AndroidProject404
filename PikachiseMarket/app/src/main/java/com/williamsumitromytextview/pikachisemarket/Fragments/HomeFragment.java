package com.williamsumitromytextview.pikachisemarket.Fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.adapters.SnapAdapter;
import com.williamsumitromytextview.pikachisemarket.model.App;
import com.williamsumitromytextview.pikachisemarket.model.Snap;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);

        List<App> apps = getApps();
        SnapAdapter snapAdapter = new SnapAdapter();

        snapAdapter.addSnap(new Snap(Gravity.CENTER_HORIZONTAL, "Best Rating", apps));
        snapAdapter.addSnap(new Snap(Gravity.CENTER_HORIZONTAL, "Newst Rating", apps));


        recyclerView.setAdapter(snapAdapter);
        return view;
    }

    private List<App> getApps() {
        List<App> apps = new ArrayList<>();
        apps.add(new App("KFC", R.drawable.logo1, 4.6f));
        apps.add(new App("Pizza Hut", R.drawable.logo2, 4.8f));
        apps.add(new App("BMW", R.drawable.logo3, 4.5f));
        apps.add(new App("Burger King", R.drawable.logo4, 4.2f));
        apps.add(new App("Coca cola", R.drawable.logo5, 4.6f));
        apps.add(new App("Pepsi", R.drawable.logo6, 3.9f));
        apps.add(new App("Starbucks", R.drawable.logo7, 4.6f));
        return apps;
    }
}
