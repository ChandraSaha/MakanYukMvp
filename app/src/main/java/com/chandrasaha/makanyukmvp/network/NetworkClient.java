package com.chandrasaha.makanyukmvp.network;

import com.chandrasaha.makanyukmvp.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Chandra Saha on 8/1/2017.
 */

public class NetworkClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit(){
        if (retrofit == null){
//            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
  //          interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    //        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            OkHttpClient okHttpClient = builder.build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
