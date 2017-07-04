package com.moim.moim.meet;

import android.content.Context;
//import android.graphics.drawable.Drawable;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.moim.moim.R;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by ltcare on 2017-07-01.
 */

public class ListViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<MeetListviewItem> MeetListview = new ArrayList<MeetListviewItem>() ;

    // ListViewAdapter의 생성자
    //public ListViewAdapter() {
    //}

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return MeetListview.size() ;
    }

    public void addItem(MeetListviewItem item){
        MeetListview.add(item);
    }

    @Override
    public Objects getItem(int position){
        return MeetListview.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        MeetListviewItemView view = new MeetListviewItemView(this.getApplicationContext());
        MeetListviewItem item = MeetListview.get(position);
        return view;


    }
}
