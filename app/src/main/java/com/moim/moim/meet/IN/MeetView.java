package com.moim.moim.Meet.IN;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.moim.moim.R;

public class MeetView extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_join:
                    mTextMessage.setText("참여하기");
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_view);
        Log.d("test", "3333333");
        Intent intent = (Intent) getIntent();

        String meet_id = intent.getStringExtra("item");

        mTextMessage = (TextView) findViewById(R.id.message);
        mTextMessage.setText( meet_id );

        BottomNavigationView meet_navigation = (BottomNavigationView) findViewById(R.id.meet_navigation);
        meet_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
