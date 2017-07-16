package com.moim.moim.meet;


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;


/**
 * Created by ltcare on 2017-07-01.
 */

public class MeetListViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<MeetListviewItem> items = new ArrayList<MeetListviewItem>() ;

    // ListViewAdapter의 생성자
    //public ListViewAdapter() {
    //}

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return items.size() ;
    }

    public void addItem(MeetListviewItem item){

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
        MeetListviewItemView view = new MeetListviewItemView( viewGroup.getContext() );
        MeetListviewItem item = items.get(position);
        view.setDayofweek(item.dayofweek);
        return view;


    }




}

