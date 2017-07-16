package com.moim.moim.Meet;

/**
 * Created by ltcare on 2017-07-04.
 */

public class MeetListviewItem {
    String dayofweek;
    String today;
    String totime;
    String todaytime;
    String place;
    String price;
    String pricetext;
    String title;
    int resId;
    int resId1;

    public MeetListviewItem(String dayofweek, String today, String totime, String todaytime, String place, String  price, String pricetext, String title, int resId, int resId1){
        this.dayofweek = dayofweek;
        this.today = today;
        this.totime = totime;
        this.todaytime = todaytime;
        this.place = place;
        this.price = price;
        this.pricetext = pricetext;
        this.title = title;
        this.resId = resId;
        this.resId1 = resId1;
    }


}
