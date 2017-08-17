package com.chandrasaha.makanyukmvp.network;

import com.chandrasaha.makanyukmvp.model.detail.Detail;
import com.chandrasaha.makanyukmvp.model.place.Place;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by Chandra Saha on 8/7/2017.
 */

public interface NetworkStores {

    @GET("explore")
    Observable<Place> getVenues(@Query("client_id") String clientId,
                                @Query("client_secret") String clinetSecret,
                                @Query("v") String v,
                                @Query("venuePhotos") String venuePhotos,
                                @Query("section") String section,
                                @Query("radius") String radius,
                                @Query("ll") String ll);
    @GET("{id}")
    Observable<Detail> getDetail(@Path("id") String id,
                                 @Query("client_id") String clientId,
                                 @Query("client_secret") String clientSecret,
                                 @Query("v") String v);

    @GET("explore")
    Observable<Place> searchVenues(@Query("client_id") String clientId,
                                @Query("client_secret") String clinetSecret,
                                @Query("v") String v,
                                @Query("venuePhotos") String venuePhotos,
                                @Query("query") String query,
                                @Query("radius") String radius,
                                @Query("ll") String ll);
}
