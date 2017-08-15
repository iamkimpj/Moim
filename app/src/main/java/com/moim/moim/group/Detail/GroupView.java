package com.moim.moim.group.Detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.moim.moim.R;
import com.moim.moim.group.Auth.JoinActivity;
import com.moim.moim.group.List.GroupListViewItem;
import com.moim.moim.meet.IN.MeetViewUserListviewAdapter;
import com.moim.moim.meet.IN.MeetViewUserListviewItem;

/**
 * Created by developer on 2017. 8. 13..
 */

public class GroupView extends AppCompatActivity {
    int gId;
//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.g_joinus:
                    Intent intent = new Intent( GroupView.this, JoinActivity.class);
//                    intent.putExtra("gId", this.gId + "");


                    startActivity(intent);

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_detail);
//        Log.d("test", "3333333");
        Intent intent = getIntent();

        String meet_id = intent.getStringExtra("gId");


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.group_detail_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);





    }

////    @Override
//    protected void onCreateView(Bundle savedInstanceState) {
//
//    }



//    private void drawUserList( ){
//
////        View view = layout;
////        listView = (ListView) getActivity().findViewById(R.id.meetlistview);
//
//        ListView listView = (ListView) findViewById(R.id.userlistview);
//
//
//
//        // setContentView(R.layout.fragment_meet);
//
//        //listView = (ListView) findViewById(R.id.listview);
//
//        MeetViewUserListviewAdapter adapter = new MeetViewUserListviewAdapter();
//
////        adapter = new ListViewAdapter(getActivity(), movieList);
////
//        adapter.addItem(new MeetViewUserListviewItem("이예지","난 이런여자다",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode, android.R.drawable.ic_menu_mapmode));
//        adapter.addItem(new MeetViewUserListviewItem("김윤수","미남",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode, android.R.drawable.ic_menu_mapmode));
//        adapter.addItem(new MeetViewUserListviewItem("김병철","뼈모으기가 취미임",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode, android.R.drawable.ic_menu_mapmode));
//        adapter.addItem(new MeetViewUserListviewItem("김평진","애니멀을 사랑으로",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode, android.R.drawable.ic_menu_mapmode));
////        adapter.addItem(new MeetViewUserListviewItem("2ww","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
////        adapter.addItem(new MeetViewUserListviewItem("we일","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
////        adapter.addItem(new MeetViewUserListviewItem("wer요일","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
//
////        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            @Override
////            public void onItemClick(AdapterView parent, View v, int position, long id) {
////
////                // get TextView's Text.
////                MeetListviewItem item = (MeetListviewItem) parent.getItemAtPosition(position) ;
//////                Log.d("test", item.place );
////
////                Intent intent = new Intent( get, MeetView.class);
////
////                intent.putExtra("item", item.resId + "");
////
////
////                startActivity(intent);
////
////
////
////
////
////
////
////
////
////
////                // TODO : use strText
////            }
////        }) ;
//
//
////
//        listView.setAdapter(adapter);
//
//        setListViewHeightBasedOnChildren( listView );
//
//
//
//
//
////        return view;view
//    }
//
//    public static void setListViewHeightBasedOnChildren(ListView listView) {
//        ListAdapter listAdapter = listView.getAdapter();
//        if (listAdapter == null) {
//            // pre-condition
//            return;
//        }
//
//        int totalHeight = 0;
//        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.AT_MOST);
//
//        for (int i = 0; i < listAdapter.getCount(); i++) {
//            View listItem = listAdapter.getView(i, null, listView);
//            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
//            totalHeight += listItem.getMeasuredHeight();
//        }
//
//        ViewGroup.LayoutParams params = listView.getLayoutParams();
//        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
//        listView.setLayoutParams(params);
//        listView.requestLayout();
//    }



}
