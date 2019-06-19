package com.example.yechanviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new com.example.yechanviewpager.Fragment1();
            case 1: return new com.example.yechanviewpager.Fragment2();
            case 2: return new com.example.yechanviewpager.Fragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}