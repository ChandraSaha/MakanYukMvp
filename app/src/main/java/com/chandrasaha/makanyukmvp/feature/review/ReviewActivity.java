package com.chandrasaha.makanyukmvp.feature.review;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.chandrasaha.makanyukmvp.R;
import com.chandrasaha.makanyukmvp.adapter.ReviewAdapter;
import com.chandrasaha.makanyukmvp.base.mvp.MvpActivity;
import com.chandrasaha.makanyukmvp.model.detail.Item;
import com.chandrasaha.makanyukmvp.model.review.Review;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ReviewActivity extends MvpActivity<ReviewPresenter> implements ReviewView {

    private List<String> reviews;
    private List<String> users;
    private List<Review> reviewList = new ArrayList<>();
    private Intent intent;

    @BindView(R.id.recycleViewReview)
    RecyclerView recyclerView;

    @Override
    protected ReviewPresenter createPresenter() {
        return new ReviewPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        setupActionBar();
        intent = getIntent();
        reviews = intent.getStringArrayListExtra("reviews");
        users = intent.getStringArrayListExtra("users");
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        loadData();
    }

    private void setupActionBar() {
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Review");
        }
    }

    private void loadData() {
        for (int i=0;i<reviews.size();i++){
            Review review = new Review();
            review.setReview(reviews.get(i));
            review.setUser(users.get(i));
            reviewList.add(review);
        }
        recyclerView.setAdapter(new ReviewAdapter(reviewList,R.layout.item_review,getApplicationContext()));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
