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
import android.widget.Button;

import com.moim.moim.R;
import com.moim.moim.group.Create.CreateGroup;
import com.moim.moim.meet.CreateMeet;


public class GroupFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_group, container, false);

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
