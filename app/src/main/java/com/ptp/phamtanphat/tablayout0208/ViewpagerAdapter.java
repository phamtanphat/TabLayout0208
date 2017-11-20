package com.ptp.phamtanphat.tablayout0208;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 15/11/2017.
 */

public class ViewpagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mangfragment = new ArrayList<>();
    private ArrayList<String> mangtieude = new ArrayList<>();
    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mangfragment.get(position);
    }

    @Override
    public int getCount() {
        return mangfragment.size();
    }
    public void AddFragmentTitle(Fragment fragment, String title){
        mangfragment.add(fragment);
        mangtieude.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mangtieude.get(position);
    }
}
