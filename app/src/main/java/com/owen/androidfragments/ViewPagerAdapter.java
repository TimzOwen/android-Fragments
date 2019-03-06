package com.owen.androidfragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter
   {

       private final ArrayList<Fragment> listFragment = new ArrayList<>();
       private final ArrayList<String> listTitles = new ArrayList<>();

       public ViewPagerAdapter(FragmentManager fm)
       {
           super(fm);
       }

       @Override
       public Fragment getItem(int position)
       {
           return listFragment.get(position);
       }

       @Override
       public int getCount()
       {
           return listTitles.size();
       }

       @Nullable
       @Override
       public CharSequence getPageTitle(int position)
       {
           return listTitles.get(position);
       }

       public void AddFragments(Fragment fragment, String titles)
       {
           listFragment.add(fragment);
           listTitles.add(titles);
       }

   }
