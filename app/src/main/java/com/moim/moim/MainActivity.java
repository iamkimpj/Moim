package com.moim.moim;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.moim.moim.group.GroupFragment;
import com.moim.moim.meet.MeetFragment;



public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_meet:


                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, new MeetFragment())
                            .commit();

                    return true;
                case R.id.navigation_group:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, new GroupFragment())
                            .commit();


                    return true;
                case R.id.navigation_setting:
//                    mTextMessage.setText(R.strig.title_setting);

                    //
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content, new MeetFragment())
                .commit();




    }

}
