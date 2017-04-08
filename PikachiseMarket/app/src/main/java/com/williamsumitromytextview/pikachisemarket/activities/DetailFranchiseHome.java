package com.williamsumitromytextview.pikachisemarket.activities;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.williamsumitromytextview.pikachisemarket.Fragments.Tab;
import com.williamsumitromytextview.pikachisemarket.Fragments.TabDetailFranchiseHome;
import com.williamsumitromytextview.pikachisemarket.R;

public class DetailFranchiseHome extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_franchise_home);
        initViews();
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.detailhomecontainerview, new TabDetailFranchiseHome()).commit();

    }

    private void initViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbardetailfranchisehome);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayoutdetailfranchisehome);
    }
}
