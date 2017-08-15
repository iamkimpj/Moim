package com.moim.moim.group.List;

/**
 * Created by developer on 2017. 8. 13..
 */

public class GroupListViewItem {
    int gOrder_num;
    int gUser_num;
    String gLocal;
    String gTitle;

    /** 최근정모 Meet 관련 정모 한줄 불러오기 **/
    String gmTodaytime;
    String gmPlace;
    int gId;



    public GroupListViewItem(int gid, int gOrder_num,int gUser_num, String gLocal, String gTitle, String gmTodaytime, String gmPlace ){
        this.gOrder_num = gOrder_num;
        this.gUser_num = gUser_num;
        this.gLocal = gLocal;
        this.gTitle = gTitle;
        this.gmTodaytime = gmTodaytime;
        this.gmPlace = gmPlace;
        this.gId = gid;

    }

    public int gId(){
        return this.gId;
    }
}
