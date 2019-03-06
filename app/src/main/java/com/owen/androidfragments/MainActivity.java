package com.owen.androidfragments;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.vp_viewager);
        android.support.design.widget.TabLayout   tableLayout = (android.support.design.widget.TabLayout)findViewById(R.id.tl_tableLayout);

        ViewPagerAdapter adpter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment

        adpter.AddFragments(new FragmentCall(), "");
        adpter.AddFragments(new FragmentContact(), "");
        adpter.AddFragments(new FragmentFav(), "");

        viewPager.setAdapter(adpter);

        tableLayout.setupWithViewPager(viewPager);

        tableLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tableLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tableLayout.getTabAt(2).setIcon(R.drawable.ic_favourite);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }

}
