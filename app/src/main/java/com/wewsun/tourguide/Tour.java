package com.wewsun.tourguide;

public class Tour {

    private int mCity;
    private int mLocation;
    private int mImageResourceId;


    public Tour(int city, int location, int imageResouceId){
        mCity=city;
        mLocation=location;
        mImageResourceId=imageResouceId;
    }
    public int getCity(){
        return mCity;
    }
    public int getLocation(){
        return mLocation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
