package com.moim.moim.Model.Http.Schema;

import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by developer on 2017. 7. 2..
 */

public class TestSchema extends BaseSchema {
//    @SerializedName("body")
//    @Expose
    private _Body body;

    private class _Body {
        public String key;
        public String value;
    }



    public TestSchema () {
        Log.d("test","Test Schema start!");

    }

    public void test() {

        Log.d("test", this.body.value );
        Log.d("test", this.head.status );



    }
}
