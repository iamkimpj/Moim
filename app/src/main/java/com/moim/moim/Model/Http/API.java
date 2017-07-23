package com.moim.moim.Model.Http;

import com.moim.moim.Model.Http.Schema.AuthSchema;
import com.moim.moim.Model.Http.Schema.TestSchema;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by developer on 2017. 7. 2..
 */

public interface API {
    @GET("/api/test/path")
    Call<TestSchema> connTest();

//    @POST("/auth/ato")
//    Call<AuthSchema> auth();

    @POST("/api/auth/ato")
    Call<AuthSchema> authTest();

    @POST("/api/user/me")
    Call<AuthSchema> tokenTest11();


//    @GET("/test")
//    Call<TestSchema> connTest();
}
