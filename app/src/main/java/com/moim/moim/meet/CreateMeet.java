package com.moim.moim.meet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.moim.moim.R;

public class CreateMeet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_create);

        Log.d("test", "111111");
    }
    public void create_btnclick(View v)
    {
        EditText dateView = (EditText) findViewById(R.id.date_input);
        EditText timeView = (EditText) findViewById(R.id.time_input);
        EditText placeView = (EditText) findViewById(R.id.place_input);
        EditText peopleView = (EditText) findViewById(R.id.people_input);
        EditText amountView = (EditText) findViewById(R.id.amount_input);
        EditText textView = (EditText) findViewById(R.id.text_input);

        String date     = dateView.getText().toString();
        String time     = timeView.getText().toString();
        String place    = placeView.getText().toString();
        String people   = peopleView.getText().toString();
        String amount   = amountView.getText().toString();
        String text     = textView.getText().toString();


       // int len = id.length();
        if (date.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"날짜를 입력하세요.", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Log.d("test",date);
        }
        if (time.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"시간을 입력하세요.", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Log.d("test",time);
        }
        if (place.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"장소를 입력하세요.", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Log.d("test",place);
        }
        if (people.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"인원을 입력하세요.", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Log.d("test",people);
        }
        if (amount.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"금액을 입력하세요.", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Log.d("test",amount);
        }
        if (text.length() == 0)
        {
            Toast.makeText(getApplicationContext(),"내용을 입력하세요.", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Log.d("test",text);
        }



        Log.d("test", "222");
    }
}
