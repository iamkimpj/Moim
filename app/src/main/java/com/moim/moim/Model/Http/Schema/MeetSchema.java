package com.moim.moim.Model.Http.Schema;

import android.util.Log;

import java.util.HashMap;

/**
 * Created by developer on 2017. 7. 23..
 */

public class MeetSchema extends BaseSchema {
//    private _Body body;
    private HashMap body;

    private class _Body {

        public String title;
        public String date;
        public String time;
        public String place;
        public String people;
        public String amount;
        public String text;
    }



    public MeetSchema () {
        Log.d("test","Test Schema start!");

    }

    public void test() {

        Log.d("test", this.body + "" );
        Log.d("test", this.head.status );



    }
}
