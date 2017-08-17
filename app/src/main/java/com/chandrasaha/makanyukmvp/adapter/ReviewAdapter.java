package com.chandrasaha.makanyukmvp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chandrasaha.makanyukmvp.R;
import com.chandrasaha.makanyukmvp.model.detail.Item;
import com.chandrasaha.makanyukmvp.model.review.Review;

import java.util.List;

/**
 * Created by Chandra Saha on 8/13/2017.
 */

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.PlaceViewHolder> {

    private List<Review> reviews;
    private int rowLayer;
    private Context context;

    static class PlaceViewHolder extends RecyclerView.ViewHolder {
        TextView tvUser;
        TextView tvReview;
        CardView cardViewReview;
        PlaceViewHolder(View v){
            super(v);
            tvUser = (TextView) v.findViewById(R.id.tvUser);
            tvReview = (TextView) v.findViewById(R.id.tvReview);
            cardViewReview = (CardView) v.findViewById(R.id.cardViewReview);
        }
    }

    public ReviewAdapter(List<Review> reviews, int rowLayer, Context context) {
        this.reviews = reviews;
        this.rowLayer = rowLayer;
        this.context = context;
    }

    @Override
    public ReviewAdapter.PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(rowLayer,parent,false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewAdapter.PlaceViewHolder holder, int position) {
        holder.tvUser.setText(reviews.get(position).getUser());
        holder.tvReview.setText(reviews.get(position).getReview());
        holder.cardViewReview.setCardBackgroundColor(Color.WHITE);
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

}
