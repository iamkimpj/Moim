package com.moim.moim.group.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by developer on 2017. 8. 13..
 */

public class GroupListViewAdapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<GroupListViewItem> items = new ArrayList<GroupListViewItem>() ;

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return items.size() ;
    }

    public void addItem(GroupListViewItem item){
        items.add(item);
    }
    @Override
    public Object getItem(int position){
//        Log.d("test", position + "" );
        return items.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        //MeetListviewItemView view = new MeetListviewItemView(  );

        GroupListViewItemView view = new GroupListViewItemView( viewGroup.getContext() );

        GroupListViewItem item = items.get(position);
        view.setgOrder_num(item.gOrder_num);
        view.setgUser_num(item.gUser_num);
        view.setgLocal(item.gLocal);
        view.setgTitle(item.gTitle);
        view.setgmTodaytime(item.gmTodaytime);
        view.setgmPlace(item.gmPlace);

        return view;


    }
}
