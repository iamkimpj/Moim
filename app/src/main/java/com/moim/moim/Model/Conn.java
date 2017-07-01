package com.moim.moim.Model;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;
import java.util.List;
//import java.util.List;

/**
 * Created by developer on 2017. 7. 1..
 */



public class Conn {
    public static class Contributor {
                public final String login;
        public final int contributions;

//        public final

        public Contributor(String login, int contributions) {
            this.login = login;
            this.contributions = contributions;
        }
    }

    public interface testService {
        //    @GET("users/{user}/repos")
        @GET("/api/test/path")

        Call<List<Contributor>> test();
    }

    public void test () throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jumoim-171709.appspot.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        testService service = retrofit.create(testService.class);
//        Log.d("test", "1");

        Call<List<Contributor>> call = service.test();

        call.enqueue(new Callback<List<Contributor>>() {
             @Override
             public void onResponse(Call<List<Contributor>> call,
                                    Response<List<Contributor>> response) {
                 Log.d("test","22");
//                 TextView textView = (TextView) findViewById(R.id.textView);
//                 textView.setText(response.body().toString());
             }

             @Override
             public void onFailure(Call<List<Contributor>> call, Throwable t) {
                Log.d("test", "33 ");
             }
         });


//
//        List<Contributor> contributors = call.execute().body();
//
        Log.d("test", "2");
//        Log.d("test", String.valueOf(call.execute()));
//        List<Contributor> contributors = call.execute().body();
//        List<Contributor> contributors = call.execute().body();
//        Log.d("test", "3");
//        for (Contributor contributor : contributors) {
//            System.out.println(contributor.login + " (" + contributor.contributions + ")");
////            Log.d( "test", contributor.contributors );
//        }



//        for (Contributor contributor : contributors) {
//            System.out.println(contributor.login + " (" + contributor.contributions + ")");
//            Log.d("")
//        }
    }
}
//
//import java.io.IOException;
//        import java.util.List;
//        import retrofit2.Call;
//        import retrofit2.converter.gson.GsonConverterFactory;
//        import retrofit2.Retrofit;
//        import retrofit2.http.GET;
//        import retrofit2.http.Path;
//
//public final class Conn {
//    public static final String API_URL = "http://jumoim-171709.appspot.com/";
//
//    public static class Contributor {
//        public final String login;
//        public final int contributions;
//
//        public Contributor(String login, int contributions) {
//            this.login = login;
//            this.contributions = contributions;
//        }
//    }
//
//    public interface GitHub {
//        @GET("/repos/{owner}/{repo}/contributors")
//        Call<List<Contributor>> contributors(
//                @Path("owner") String owner,
//                @Path("repo") String repo
//        );
//    }
//
//    public static void main(String... args) throws IOException {
//        // Create a very simple REST adapter which points the GitHub API.
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(API_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        // Create an instance of our GitHub API interface.
//        GitHub github = retrofit.create(GitHub.class);
//
//        // Create a call instance for looking up Retrofit contributors.
//        Call<List<Contributor>> call = github.contributors("square", "retrofit");
//
//        // Fetch and print a list of the contributors to the library.
////        List<Contributor> contributors = call.execute().body();
////        for (Contributor contributor : contributors) {
////            System.out.println(contributor.login + " (" + contributor.contributions + ")");
////        }
//    }
//}
