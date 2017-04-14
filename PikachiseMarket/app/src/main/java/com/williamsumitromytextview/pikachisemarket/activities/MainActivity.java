package com.williamsumitromytextview.pikachisemarket.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.text.Layout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.williamsumitromytextview.pikachisemarket.Fragments.About_UsFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.BookmarkFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.Franchise_AlertsFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.HomeFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.How_It_WorksFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.PrivacyFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.Rate_Our_AppFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.Tab;
import com.williamsumitromytextview.pikachisemarket.R;

import com.williamsumitromytextview.pikachisemarket.Session.SessionManagement;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    Toolbar toolbar;
    SessionManagement session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        session = new SessionManagement(getApplicationContext());
        session.checkLogin();
        HashMap<String, String> user = session.getUserDetails();
        String email = user.get(SessionManagement.KEY_EMAIL);

        View header = mNavigationView.getHeaderView(0);
        TextView TvEmail = (TextView) header.findViewById(R.id.UserEmail);
        TvEmail.setText(email);

        //membuat fragment tab menjadi fragment pertama
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerview, new Tab()).commit();

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.nav_item_home) {
                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerview, new Tab()).commit();
                }
                if (menuItem.getItemId() == R.id.nav_item_bookmark) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerview, new BookmarkFragment()).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_franchisealerts) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerview, new Franchise_AlertsFragment()).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_about_us) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerview, new About_UsFragment()).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_rate_our_ap) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerview, new Rate_Our_AppFragment()).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_terms_of_use) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerview, new PrivacyFragment()).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_how_it_works) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerview, new How_It_WorksFragment()).commit();

                }

                if ((menuItem.getItemId() == R.id.nav_logout)) {
                    session.logoutUser();
                    finish();
                }

                return false;
            }

        });

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();
    }

    private void initViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigationview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
