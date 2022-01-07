package com.example.SevenWonders;

public class WonderItem {
    private final int mWonderImage;
    private final String mWonderName;
    private final String mWonderDescription;
    public String mWonderLocation;



    public WonderItem(int wonderImage, String wonderName, String wonderDescription, String wonderLocation){
        mWonderImage = wonderImage;
        mWonderName = wonderName;
        mWonderDescription = wonderDescription;
        mWonderLocation = wonderLocation;
    }

    public int getImageResource(){
        return mWonderImage;
    }

    public String getText1(){
        return mWonderName;
    }

    public String getText2(){
        return mWonderDescription;
    }

    public String getLocation(){return mWonderLocation;}

}
