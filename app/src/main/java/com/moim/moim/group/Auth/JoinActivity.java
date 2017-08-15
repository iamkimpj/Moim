package com.moim.moim.group.Auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.moim.moim.R;

/**
 * Created by developer on 2017. 8. 15..
 */

public class JoinActivity extends AppCompatActivity {
    int gId;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navi_ok:

//                    GroupListViewItem item = (GroupListViewItem) parent.getItemAtPosition(position) ;
//                    Intent intent = new Intent( getActivity(), GroupView.class);
//
//                    intent.putExtra("gId", this.gId + "");
//
//
//                    startActivity(intent);
                    Log.d("test", "clk ok");

                    return true;
                case R.id.navi_cancle:
                    Log.d("test", "clk cancle");

//                    GroupListViewItem item = (GroupListViewItem) parent.getItemAtPosition(position) ;
//                    Intent intent = new Intent( getActivity(), GroupView.class);
//
//                    intent.putExtra("gId", this.gId + "");
//
//
//                    startActivity(intent);
                    //

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_auth_join);
//        Log.d("test", "3333333");
//        Intent intent = getIntent();

//        this.gId = intent.getIntExtra("gId");
// asdas asjdkjsldj
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.auth_join_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
}
