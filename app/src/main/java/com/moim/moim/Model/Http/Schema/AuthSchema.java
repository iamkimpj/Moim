package com.moim.moim.Model.Http.Schema;

import android.util.Log;

/**
 * Created by developer on 2017. 7. 16..
 */

public class AuthSchema extends BaseSchema {
//    private _Body body;
    private Boolean body;

    private class _Body {
        public String key;
        public String value;
    }



    public AuthSchema () {
        Log.d("test","Test Schema start!");

    }

    public void test() {

//        Log.d("test", this.body.value );
//        Log.d("test", this.head.status );



    }
}
