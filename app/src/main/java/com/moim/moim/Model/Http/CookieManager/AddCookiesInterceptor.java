package com.moim.moim.Model.Http.CookieManager;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;

import com.moim.moim.GlobalApplication;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by developer on 2017. 7. 16..
 */

public class AddCookiesInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
//        Log.d("test", "add cookie In");
        Request.Builder builder = chain.request().newBuilder();

        // Preference에서 cookies를 가져오는 작업을 수행
        SharedPreferences token_pref = GlobalApplication.getGlobalApplicationContext().getSharedPreferences("_token", Activity.MODE_PRIVATE);


        builder.addHeader("X-AUTH-TOKEN", token_pref.getString("_token", "0") );

        // Web,Android,iOS 구분을 위해 User-Agent세팅
        builder.removeHeader("User-Agent").addHeader("User-Agent", "Android");
//        builder.addQueryParameter("device","3");
//        Log.d("test add token", token_pref.getString("_token", "0"));
        return chain.proceed(builder.build());
    }
}
