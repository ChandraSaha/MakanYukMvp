package com.chandrasaha.makanyukmvp.feature.detail;

import android.content.Intent;
import android.net.Uri;
import android.renderscript.Double2;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.chandrasaha.makanyukmvp.R;
import com.chandrasaha.makanyukmvp.base.mvp.MvpActivity;
import com.chandrasaha.makanyukmvp.feature.review.ReviewActivity;
import com.chandrasaha.makanyukmvp.model.detail.Detail;
import com.chandrasaha.makanyukmvp.model.detail.Item;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.chandrasaha.makanyukmvp.R.id.tvSeeAllReview;


public class DetailActivity extends MvpActivity<DetailPresenter> implements DetailView, View.OnClickListener, OnMapReadyCallback {

    private String id;
    private GoogleMap map;

    @BindView(R.id.iv_Detail)
    ImageView ivDetail;

    @BindView(R.id.tv_detail_address)
    TextView tvAdress;

    @BindView(R.id.tv_detail_review)
    TextView tvReview;

    @BindView(R.id.progress)
    ProgressBar progressBar;

    @BindView(R.id.scrollView)
    ScrollView scrollView;

    @BindView(R.id.bNav)
    Button bNav;

    @BindView(R.id.tvSeeAllReview)
    TextView tvSeeAlreview;

    @BindView(R.id.tv_detail_name)
    TextView tvDetailName;

    private Double lat;
    private Double lng;
    private List<String> users = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    @Override
    protected DetailPresenter createPresenter() {
        return new DetailPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        id = getIntent().getStringExtra("id");
        presenter.loadDetail(id);
        setupMapIfNeeded();
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
        scrollView.setVisibility(View.GONE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
        scrollView.setVisibility(View.VISIBLE);
    }

    @Override
    public void getDataSuccess(Detail model) {
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setTitle(model.getResponse().getVenue().getName());
        }
        tvAdress.setText(model.getResponse().getVenue().getLocation().getAddress());
        tvReview.setText(model.getResponse().getVenue().getTips().getGroups().get(0).getItems().get(0).getText());
        tvDetailName.setText(model.getResponse().getVenue().getTips().getGroups().get(0).getItems().get(0).getUser().getFirstName()+
                " "+
                model.getResponse().getVenue().getTips().getGroups().get(0).getItems().get(0).getUser().getLastName());
        Glide.with(getApplicationContext()).load(model.getResponse().getVenue().getPhotos().getGroups().get(0).getItems().get(0).getPrefix()+
                model.getResponse().getVenue().getPhotos().getGroups().get(0).getItems().get(0).getWidth()+
                "x"+
                model.getResponse().getVenue().getPhotos().getGroups().get(0).getItems().get(0).getHeight()+
                model.getResponse().getVenue().getPhotos().getGroups().get(0).getItems().get(0).getSuffix()).into(ivDetail);
        lat = model.getResponse().getVenue().getLocation().getLat();
        lng = model.getResponse().getVenue().getLocation().getLng();
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lng), 14));
        map.addMarker(new MarkerOptions().position(new LatLng(lat, lng)).icon(BitmapDescriptorFactory.fromResource(R.drawable.food)));
        int tipsSize = model.getResponse().getVenue().getTips().getGroups().get(0).getItems().size();
        for (int tip=0;tip<tipsSize;tip++){
            reviews.add(model.getResponse().getVenue().getTips().getGroups().get(0).getItems().get(tip).getText());
            users.add(model.getResponse().getVenue().getTips().getGroups().get(0).getItems().get(tip).getUser().getFirstName()+
                    " "+
                    model.getResponse().getVenue().getTips().getGroups().get(0).getItems().get(tip).getUser().getLastName());
        }
        bNav.setOnClickListener(this);
        tvSeeAlreview.setOnClickListener(this);
    }

    private void setupMapIfNeeded() {
        if (map == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            SupportMapFragment supportMapFragment = (SupportMapFragment) fragmentManager
                    .findFragmentById(R.id.maps);
            supportMapFragment.getMapAsync(this);
        }
    }
    @Override
    public void getDataFail(String message) {
        Toast.makeText(this, "Please load again",Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bNav) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + lat + "," + lng));
            startActivity(intent);
        }
        if(v.getId()== tvSeeAllReview){
            Intent intent = new Intent(DetailActivity.this, ReviewActivity.class);
            intent.putStringArrayListExtra("users",(ArrayList<String>) users);
            intent.putStringArrayListExtra("reviews",(ArrayList<String>) reviews);
            startActivity(intent);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
    }
}
