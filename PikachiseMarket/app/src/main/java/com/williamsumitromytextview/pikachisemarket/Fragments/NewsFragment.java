package com.williamsumitromytextview.pikachisemarket.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.adapters.AdapterListNews;
import com.williamsumitromytextview.pikachisemarket.model.DataListNews;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private RecyclerView recView;
    private AdapterListNews adapterListNews;
    private ArrayList listdata;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        listdata = (ArrayList) DataListNews.getListNews();
        recView = (RecyclerView) view.findViewById(R.id.recyclerviewNews);
        recView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterListNews = new AdapterListNews(DataListNews.getListNews(), getActivity());
        recView.setAdapter(adapterListNews);
        return view;
    }

}
