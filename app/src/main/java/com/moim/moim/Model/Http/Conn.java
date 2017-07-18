package com.moim.moim.Model.Http;

import com.moim.moim.Model.Http.CookieManager.AddCookiesInterceptor;
import com.moim.moim.Model.Http.CookieManager.ReceivedCookiesInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by developer on 2017. 7. 2..
 */

public class Conn {

//    private static final String host = "http://52.79.231.212";
//    private static final String host = "https://jumoim-171709.appspot.com";
    private static final String host = "http://192.168.0.60:8080";
    private static  OkHttpClient.Builder OKHTTP_CLIENT;
    static {
        OKHTTP_CLIENT = new OkHttpClient.Builder();
    }

    private Conn() {}

    private static class Singleton {
        private static final Conn instance = new Conn();
    }

    public static Conn ready() {

        return Singleton.instance;
    }

    public API api( )
    {
        String host = this.host;

        OkHttpClient okhttp_client = new OkHttpClient();
// 쿠키를 Prefreence에 저장하고 가져옴
        OKHTTP_CLIENT.interceptors().add(new AddCookiesInterceptor());
        OKHTTP_CLIENT.interceptors().add(new ReceivedCookiesInterceptor());



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(host)
                .addConverterFactory(GsonConverterFactory.create())
                .client( OKHTTP_CLIENT.build() )
                .build();

        return retrofit.create(API.class);
    }
}
