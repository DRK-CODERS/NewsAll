package com.example.newsall;

import android.content.Context;
import android.telecom.Call;

import com.example.newsall.Models.NewsApiResponse;




public class RequestManager {
    Context context;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();



    public RequestManager(Context context) { this.context = context; }

    public interface CallNewsApi {
        @GET("top-headlines")
        Call<NewsApiResponse> callHeadlines(
                @Query("country") String country,
                @Query("category") String category,
                @Query("q") String query,
                @Query("apiKey") String api_key

        )
    }

}
