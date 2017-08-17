package com.chandrasaha.makanyukmvp.feature.home;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.chandrasaha.makanyukmvp.base.ui.BasePresenter;
import com.chandrasaha.makanyukmvp.feature.detail.DetailActivity;
import com.chandrasaha.makanyukmvp.model.place.Item;
import com.chandrasaha.makanyukmvp.model.place.Place;
import com.chandrasaha.makanyukmvp.network.NetworkCallback;
import com.chandrasaha.makanyukmvp.util.LocationService;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Chandra Saha on 8/7/2017.
 */

public class MainPresenter extends BasePresenter<MainView> {
    private String clientId = "E5KI0OVUNGJ4VEUC2IOMADRSSZ5RPN4UEJPG32CVNFBPE3X3";
    private String clinetSecret = "XZ12EESN54I4ZH1PPU0AHAZM4XWMJPYI5SLBVYWPJS1EDYFX";
    private String v = "20141011";
    private String venuePhotos = "1";
    private String section = "food";
    private String radius = "10000";
    private LocationService locationService;
    private static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 17;

    MainPresenter(MainView view){
        super.attachView(view);
    }

    void loadData(String ll){
        view.showLoading();
        addSubscribe(apiStores.getVenues(clientId,clinetSecret,v,venuePhotos,section,radius,ll), new NetworkCallback<Place>() {
            @Override
            public void onSuccess(Place model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
    });
    }

    void searchLocation(String ll, String query){
        view.showLoading();
        addSubscribe(apiStores.searchVenues(clientId, clinetSecret, v, venuePhotos, query, radius, ll), new NetworkCallback<Place>() {
            @Override
            public void onSuccess(Place model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }

    void getItem(Item item, Activity activity){
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra("id",item.getVenue().getId());
        view.moveToDetail(intent);
    }

    LatLng getLoacation(Activity activity){
        LatLng position = new LatLng(0.0,0.0);
        locationService = new LocationService(activity.getApplicationContext());
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
        else {
            if (locationService.canGetLocation()) {
                position = new LatLng(locationService.getLatitude(), locationService.getLongitude());
            } else {
                displayPromptForEnablingGPS(activity);
            }
        }
        return position;
    }

   private void displayPromptForEnablingGPS(final Activity activity) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        final String action = Settings.ACTION_LOCATION_SOURCE_SETTINGS;
        final String message = "GPS belum dinyalakan."
                + " Tekan OK untuk menuju setting untuk menyalakan GPS.";

        builder.setMessage(message)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface d, int id) {
                                activity.startActivity(new Intent(action));
                                d.dismiss();
                            }
                        })
                .setNegativeButton("Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface d, int id) {
                                d.cancel();
                            }
                        });
        builder.create().show();
    }
}
