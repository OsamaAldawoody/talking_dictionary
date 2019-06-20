package com.example.android.miwok;

import android.content.Context;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    Context context;
    public SimpleFragmentPagerAdapter(FragmentManager fm ,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumberFragment();
        } else if (position == 1){
            return new ColorFragment();
        } else if (position == 2){
            return new FamilyFragment();
        }
        else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.category_numbers);
            case 1:
                return context.getString(R.string.category_colors);
            case 2:
                return context.getString(R.string.category_family);
            case 3:
                return context.getString(R.string.category_phrases);
        }
        return null;
    }
}
