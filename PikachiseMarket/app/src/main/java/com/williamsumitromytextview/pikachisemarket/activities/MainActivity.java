package com.williamsumitromytextview.pikachisemarket.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
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

import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.williamsumitromytextview.pikachisemarket.Fragments.About_UsFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.BookmarkFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.Franchise_AlertsFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.HomeFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.How_It_WorksFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.PrivacyFragment;
import com.williamsumitromytextview.pikachisemarket.Fragments.Rate_Our_AppFragment;
import com.williamsumitromytextview.pikachisemarket.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentPage(0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {FragmentPage(0);}
        else if (id == R.id.nav_bookmark) {FragmentPage(1);}
        else if (id == R.id.nav_franchise_alerts) {FragmentPage(2);}
        else if (id == R.id.nav_about_us) {FragmentPage(3);}
        else if (id == R.id.nav_rate_our_app) {FragmentPage(4);}
        else if (id == R.id.nav_privacy) {FragmentPage(5);}
        else if (id == R.id.nav_how_it_works) {FragmentPage(6);}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void FragmentPage(int i){
        Fragment x = new Fragment();
        if(i == 0){x = new HomeFragment();}
        else if(i==1){x = new BookmarkFragment();}
        else if(i==2){x = new Franchise_AlertsFragment();}
        else if(i==3){x = new About_UsFragment();}
        else if(i==4){x = new Rate_Our_AppFragment();}
        else if(i==5){x = new PrivacyFragment();}
        else if(i==6){x = new How_It_WorksFragment();}
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, x);
        fragmentTransaction.commit();
    }
}
