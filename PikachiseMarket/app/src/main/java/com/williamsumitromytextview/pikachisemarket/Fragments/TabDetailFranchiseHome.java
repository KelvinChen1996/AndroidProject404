package com.williamsumitromytextview.pikachisemarket.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamsumitromytextview.pikachisemarket.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabDetailFranchiseHome extends Fragment {
    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 3;


    public TabDetailFranchiseHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_detail_franchise_home, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tabsdetailfranchisehome);
        viewPager = (ViewPager) view.findViewById(R.id.viewpagerdetailfranchisehome);

        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return view;

    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new HomeDetailProfile();
                case 1:
                    return new HomeDetailDaftarOutlet();
                case 2:
                    return new HomeDetailReviewandrating();
            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Profile";
                case 1:
                    return "Daftar Outlet";
                case 2:
                    return "Review & Rating";
            }
            return null;
        }
    }

}
