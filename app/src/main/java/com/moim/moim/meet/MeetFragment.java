package com.moim.moim.meet;

import android.content.Intent;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


import com.moim.moim.R;


import com.moim.moim.meet.IN.MeetView;


public class MeetFragment extends Fragment {





    ListView listView;
    MeetListViewAdapter adapter;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_meet, container,false);

        listView = (ListView) view.findViewById(R.id.meetlistview);



        adapter = new MeetListViewAdapter();


//
        adapter.addItem(new MeetListviewItem("화요일","25","오후 05:00","2017 / 7 / 25 오후 5시 0분","신중동 썬팁스","각자커피값","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("토요일","29","오후 05:00","2017 / 7 / 29 오후 2시 0분","신중동 썬팁스","각자커피값","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("일요일","30","오후 05:00","2017 / 7 / 30 오후 2시 0분","부천역 더치앤빈","각자커피값","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("화요일","1","오후 05:00","2017 / 8 / 1 오후 5시 0분","부천역 더치앤빈","각자커피값","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("토요일","5","오전 10:00","2017 / 8 / 5 오전 10시 0분","대천해수욕장 및 전주투어~","N빵","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("토요일","5","오전 10:00","2017 / 8 / 5 오전 10시 0분","대천해수욕장 및 전주투어~","N빵","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("토요일","5","오전 10:00","2017 / 8 / 5 오전 10시 0분","대천해수욕장 및 전주투어~","N빵","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("토요일","5","오전 10:00","2017 / 8 / 5 오전 10시 0분","대천해수욕장 및 전주투어~","N빵","부천IT 스터디 안드로이드 개발","￦",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                MeetListviewItem item = (MeetListviewItem) parent.getItemAtPosition(position) ;
                Intent intent = new Intent( getActivity(), MeetView.class);

                intent.putExtra("item", item.resId + "");


                startActivity(intent);










                // TODO : use strText
            }
        }) ;


//
        listView.setAdapter(adapter);


        FloatingActionButton btnCreateMeeting = (FloatingActionButton) view.findViewById( R.id.btn_create_meeting );
        btnCreateMeeting.setOnClickListener( new Button.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent( getActivity(), CreateMeet.class);
                startActivity(intent);
//                finish();
            }
        } );

        return view;

    }

}
