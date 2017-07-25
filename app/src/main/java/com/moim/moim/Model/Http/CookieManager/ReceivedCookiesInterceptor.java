package com.moim.moim.Model.Http.CookieManager;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;

import com.moim.moim.GlobalApplication;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by developer on 2017. 7. 16..
 */

public class ReceivedCookiesInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

//        Log.d("test", "recive cookie In");

//        if( !originalResponse.header("X-AUTH-TOKEN").isEmpty() ){
        if( originalResponse.header("X-AUTH-TOKEN") != null ){
            SharedPreferences token_pref = GlobalApplication.getGlobalApplicationContext().getSharedPreferences("_token", Activity.MODE_PRIVATE);
            SharedPreferences.Editor token_editor = token_pref.edit();

            token_editor.putString("_token", originalResponse.header("X-AUTH-TOKEN"));
            token_editor.commit();


//            Log.d("test 3434", originalResponse.header("X-AUTH-TOKEN"));
        }

//        Log.d("test 3434rr", (originalResponse.header("X-AUTH-TOKEN") == null) + "" );

//        Log.d("test", "3434111");
//        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
//            HashSet<String> cookies = new HashSet<>();
//
//            SharedPreferences cookie_pref = GlobalApplication.getGlobalApplicationContext().getSharedPreferences("_cookie", Activity.MODE_PRIVATE);
//            SharedPreferences.Editor cookie_editor = cookie_pref.edit();
//
//            for (String header : originalResponse.headers("Set-Cookie")) {
//                cookies.add(header);
//            }
//
//            cookie_editor.putStringSet("_cookie", cookies);
//            cookie_editor.commit();
//
//
//        }

        return originalResponse;
    }
}
