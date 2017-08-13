package com.moim.moim.Model.Http.Schema;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by developer on 2017. 7. 16..
 */

public class AuthSchema extends BaseSchema {
    //    @SerializedName("body")
//    @Expose
//    private HashMap< String, String > body;
//    private HashMap body;
//    private HashMap< ? ,? > body;
    private _Body body;


    private class _Body {
        public String key;
        public String value;
    }



    public AuthSchema () {
        Log.d("test","Test Schema start!");

    }

    public void test() {

//        for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
//            String key = (String) iterator.next();
//            System.out.println(jsonObject.get(key));
//        }

        Log.d("test_response_obj", this.body.toString()   );
//        Log.d("test_response_obj", this.body.toString()   );
//        Log.d("test_response_obj", this.body.get("phone") + "" );
//        Log.d("test_response_obj", this.body.get("id") + ""   );
//        Log.d("test_response_obj", (this.body.get("created") == null) + ""   );
//        Log.d("test_response_obj", (this.body.get("birthDate") != null)? this.body.get("birthDate") + "" : "null"   );
//        Gson gson = new Gson();
//        HashMap point = new Gson().fromJson( this.body.get("point").toString(), HashMap.class );
//
//        Log.d("test_response_obj",  point.get("point") + "" );
//        Log.d("test_response_obj",  ( this.body.get("point") instanceof JsonObject) + "" );
//        Log.d("test", this.head.this.body.get("point") );



    }
}
