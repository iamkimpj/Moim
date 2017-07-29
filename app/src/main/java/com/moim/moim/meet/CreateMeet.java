package com.moim.moim.meet;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.moim.moim.Model.Http.Conn;
import com.moim.moim.Model.Http.Schema.AuthSchema;
import com.moim.moim.Model.Http.Schema.MeetSchema;
import com.moim.moim.R;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class CreateMeet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_create);
        createMeetToServer();
//        Log.d("test", "111111");
    }
    public void create_btnclick(View v)
    {
        EditText dateView = (EditText) findViewById(R.id.date_input);
        EditText timeView = (EditText) findViewById(R.id.time_input);
        EditText placeView = (EditText) findViewById(R.id.place_input);
        EditText peopleView = (EditText) findViewById(R.id.people_input);
        EditText amountView = (EditText) findViewById(R.id.amount_input);
        EditText textView = (EditText) findViewById(R.id.text_input);






//       // int len = id.length();
//        if (date.length() == 0)
//        {
//            Toast.makeText(getApplicationContext(),"날짜를 입력하세요.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Log.d("test",date);
//        }
//        if (time.length() == 0)
//        {
//            Toast.makeText(getApplicationContext(),"시간을 입력하세요.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Log.d("test",time);
//        }
//        if (place.length() == 0)
//        {
//            Toast.makeText(getApplicationContext(),"장소를 입력하세요.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Log.d("test",place);
//        }
//        if (people.length() == 0)
//        {
//            Toast.makeText(getApplicationContext(),"인원을 입력하세요.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Log.d("test",people);
//        }
//        if (amount.length() == 0)
//        {
//            Toast.makeText(getApplicationContext(),"금액을 입력하세요.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Log.d("test",amount);
//        }
//        if (text.length() == 0)
//        {
//            Toast.makeText(getApplicationContext(),"내용을 입력하세요.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else
//        {
//            Log.d("test",text);
//        }



//        Log.d("test", "222");
    }

    private void createMeetToServer(  ){

        String title     = "test test";
        String date     = "2017-03-12";
        String time     = "11:00";
        String place    = "인청";
        String people   = "34";
        String amount   = "30000";
        String text     = "그렇습니다";

        (new AsyncTask<String, Void, String>() {

            @Override
            protected String doInBackground(String... params) {

                Call<MeetSchema> call = Conn.ready().api().createMeet(
                        params[0], params[1], params[2], params[3],
                        params[4], params[5], params[6]
                );


                try {

                    Response<MeetSchema> response = call.execute();

                    if (response.isSuccessful()) {
//                        Log.d("test","sucesss to get respose");
                        MeetSchema test = response.body();

                        test.test();
                    } else {
                        Log.d("test","failed to get respose");
                    }


                    Log.d( "test", response+"" );
                    Log.d( "test", response.body()+"" );
                    return "erer";
//                    return call.execute().body().toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                Log.d("test", "tototo");
                Log.d("test", s);
//                TextView textView = (TextView) findViewById(R.id.textView);
//                textView.setText(s);
            }
        }).execute( title, date, time, place, people, amount, text );

    }
}
