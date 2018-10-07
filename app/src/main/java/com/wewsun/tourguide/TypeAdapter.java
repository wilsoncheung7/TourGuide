package com.wewsun.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TypeAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public TypeAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0) {
            return new HotelFragment();
        }
        else if (position==1){
            return new RestaurantFragment();
        }
        else if (position==2){
            return new EventFragment();
        }
        else {
            return new LandmarkFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Hotel";
        }
        else if (position==1){
            return "Restaurant";
        }
        else if (position==2){
            return "Event";
        }
        else {
            return "Landmark";
        }
    }
}
