package com.moim.moim.Model.Http;

import com.moim.moim.Model.Http.Schema.AuthSchema;
import com.moim.moim.Model.Http.Schema.MeetSchema;
import com.moim.moim.Model.Http.Schema.TestSchema;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by developer on 2017. 7. 2..
 */

public interface API {
    @GET("/api/test/path")
    Call<TestSchema> connTest();

//    @POST("/auth/ato")
//    Call<AuthSchema> auth();

    @POST("/api/auth/tt")
    Call<AuthSchema> authTest();

    @POST("/api/user/me")
    Call<AuthSchema> tokenTest11();

    @POST("/api/fastmeet/regist")
    Call<MeetSchema> createMeet(
            @Query("title") String title,
            @Query("date") String date,
            @Query("time") String time,
            @Query("place") String place,
            @Query("people") String people,
            @Query("amount") String amount,
            @Query("text") String text

    );

//    String date     = dateView.getText().toString();
//    String time     = timeView.getText().toString();
//    String place    = placeView.getText().toString();
//    String people   = peopleView.getText().toString();
//    String amount   = amountView.getText().toString();
//    String text     = textView.getText().toString();

//    @GET("/test")
//    Call<TestSchema> connTest();
}
