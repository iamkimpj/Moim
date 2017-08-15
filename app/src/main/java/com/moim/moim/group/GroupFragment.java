package com.moim.moim.group;

import android.content.Intent;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.moim.moim.R;
import com.moim.moim.group.Create.CreateGroup;
import com.moim.moim.group.Detail.GroupView;
import com.moim.moim.group.List.GroupListViewAdapter;
import com.moim.moim.group.List.GroupListViewItem;
import com.moim.moim.meet.CreateMeet;
import com.moim.moim.meet.IN.MeetView;
import com.moim.moim.meet.MeetListviewItem;


public class GroupFragment extends Fragment {

    ListView listView;
    GroupListViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_group, container, false);

        listView = (ListView) view.findViewById(R.id.grouplistview);

        adapter = new GroupListViewAdapter();


        adapter.addItem(new GroupListViewItem(1, 1,119,"부천시 중동","부천IT 스터디 안드로이드 개발","2017 / 7 / 25 오후 5시 0분","신중동 썬팁스"));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                GroupListViewItem item = (GroupListViewItem) parent.getItemAtPosition(position) ;
                Intent intent = new Intent( getActivity(), GroupView.class);

                intent.putExtra("gId", item.gId() + "");


                startActivity(intent);


                // TODO : use strText
            }
        }) ;

        listView.setAdapter(adapter);

        FloatingActionButton btnCreateMeeting = (FloatingActionButton) view.findViewById( R.id.btn_create_group );
        btnCreateMeeting.setOnClickListener( new Button.OnClickListener() {
            @Override public void onClick(View view) {
                Log.d("test","clk create group btn");
                Intent intent = new Intent( getActivity(), CreateGroup.class);
                startActivity(intent);
//                finish();
            }
        } );

        return view;


    }


}
