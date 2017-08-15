package com.moim.moim.group.Create;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.moim.moim.R;


public class CreateGroup extends AppCompatActivity   {
    RadioGroup rg;

//    private RadioGroup.OnCheckedChangeListener mOnRadioListener = new RadioGroup.OnCheckedChangeListener() {
//
//        public void onCheckedChanged(RadioGroup view, int id)
//        {
//            Log.d("chk", "id" + id);
//
//            if (id == R.id.gPublic_check) {
//                Log.d("chk", "id1111" + id);
//            } else if (id == R.id.gSecret_check) {
//                //some code
//                Log.d("chk", "id22222" + id);
//            }
//
//
//        }
//    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("test","set create view");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_create);



//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        rg = (RadioGroup) findViewById(R.id.group);
        rg.check(R.id.gPublic_check);

//        rg.OnCheckedChangeListener();
    }
    public void gCreat_btnclick(View v)
   {


       EditText dateView = (EditText) findViewById(R.id.gLocal_input);
       EditText timeView = (EditText) findViewById(R.id.gTitle_input);
       EditText placeView = (EditText) findViewById(R.id.gIntro_input);

       int id = rg.getCheckedRadioButtonId();

       Log.d("test", id +"");



//       radio = (RadioGroup) findViewById(R.id.group);


   }

}
