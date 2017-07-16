package com.moim.moim.meet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;


import com.moim.moim.MainActivity;
import com.moim.moim.R;




import com.moim.moim.R;
import com.moim.moim.meet.IN.MeetView;

import java.util.ArrayList;
import java.util.Objects;


public class MeetFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    private OnFragmentInteractionListener mListener;
//
//    public MeetFragment() {
//        // Required empty public constructor
//    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeetFragment.
     */
    // TODO: Rename and change types and number of parameters
//    public static MeetFragment newInstance(String param1, String param2) {
//        MeetFragment fragment = new MeetFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
////            mParam1 = getArguments().getString(ARG_PARAM1);
////            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }



    ListView listView;
    MeetListViewAdapter adapter;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return inflater.inflate(R.layout.fragment_meet,container,false);


        View view = inflater.inflate(R.layout.fragment_meet, container,false);
//        listView = (ListView) getActivity().findViewById(R.id.meetlistview);

        listView = (ListView) view.findViewById(R.id.meetlistview);



       // setContentView(R.layout.fragment_meet);

        //listView = (ListView) findViewById(R.id.listview);

        adapter = new MeetListViewAdapter();

//        adapter = new ListViewAdapter(getActivity(), movieList);
//
        adapter.addItem(new MeetListviewItem("수요일","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("2ww","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("we일","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));
        adapter.addItem(new MeetListviewItem("wer요일","9","오후 05:00","2017 / 7 / 9 오후 5시 0분","부천역 더치앤빈","각자커피값","￦","부천IT 스터디 안드로이드 개발",android.R.drawable.ic_lock_idle_alarm,android.R.drawable.ic_menu_mapmode));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                // get TextView's Text.
                MeetListviewItem item = (MeetListviewItem) parent.getItemAtPosition(position) ;
//                Log.d("test", item.place );

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

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
    //
//        void onFragmentInteraction(Uri uri);
//    }
}
