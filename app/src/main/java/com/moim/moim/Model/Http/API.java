package com.moim.moim.Model.Http;

import com.moim.moim.Model.Http.Schema.TestSchema;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by developer on 2017. 7. 2..
 */

public interface API {
//    @GET("/api/test/path")
//    Call<TestSchema> connTest();

    @GET("/test")
    Call<TestSchema> connTest();
}
