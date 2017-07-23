package com.moim.moim.meet.IN;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.moim.moim.meet.MeetListviewItem;
import com.moim.moim.meet.MeetListviewItemView;
import java.util.ArrayList;

/**
 * Created by ltcare on 2017-07-18.
 */

public class MeetViewUserListviewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<MeetViewUserListviewItem> items = new ArrayList<MeetViewUserListviewItem>() ;

    // ListViewAdapter의 생성자
    //public ListViewAdapter() {
    //}

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return items.size() ;
    }

    public void addItem(MeetViewUserListviewItem item){

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
        MeetViewUserListviewItemView view = new MeetViewUserListviewItemView( viewGroup.getContext() );
        MeetViewUserListviewItem item = items.get(position);
        view.setNames(item.names);
        //view.setIntros(item.intros);
        //view.setImg_face(item.resId);
        //view.setImg_icon1(item.resId1);
        //view.setImg_icon2(item.resId2);
        return view;
    }




}

