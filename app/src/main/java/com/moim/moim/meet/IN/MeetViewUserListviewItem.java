package com.moim.moim.meet.IN;

/**
 * Created by ltcare on 2017-07-18.
 */

public class MeetViewUserListviewItem {
    String names;
    String intros;
    int resId;      // 사진
    int resId1;     // 번개주 아이콘1
    int resId2;     // 번개주 아이콘2

    public MeetViewUserListviewItem(String names, String intros, int resId, int resId1, int resId2){
        this.names = names;
        this.intros = intros;
        this.resId = resId;
        this.resId1 = resId1;
        this.resId2 = resId2;
    }

}