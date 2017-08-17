package com.chandrasaha.makanyukmvp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chandrasaha.makanyukmvp.R;
import com.chandrasaha.makanyukmvp.model.place.Item;
import com.chandrasaha.makanyukmvp.model.place.Place;

import java.util.List;

/**
 * Created by Chandra Saha on 8/7/2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {
    private List<Item> places;
    private int rowLayer;
    private Context context;

    static class PlaceViewHolder extends RecyclerView.ViewHolder{
        TextView tvNama;
        ImageView imageView;
        CardView cardViewPlace;
        PlaceViewHolder(View v){
            super(v);
            tvNama = (TextView) v.findViewById(R.id.tvNama);
            imageView = (ImageView) v.findViewById(R.id.imgview);
            cardViewPlace = (CardView) v.findViewById(R.id.cardViewPlace);
        }
    }

    public PlaceAdapter(List<Item> places, int rowLayer, Context context) {
        this.places = places;
        this.rowLayer = rowLayer;
        this.context = context;
    }

    @Override
    public PlaceAdapter.PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(rowLayer,parent,false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaceAdapter.PlaceViewHolder holder, int position) {
        holder.cardViewPlace.setCardBackgroundColor(Color.WHITE);
        holder.tvNama.setText(places.get(position).getVenue().getName());
        Glide.with(context).load(
                places.get(position).getVenue().getPhotos().getGroups().get(0).getItems().get(0).getPrefix()+
                places.get(position).getVenue().getPhotos().getGroups().get(0).getItems().get(0).getWidth()+ "x" +
                        places.get(position).getVenue().getPhotos().getGroups().get(0).getItems().get(0).getHeight()+
                        places.get(position).getVenue().getPhotos().getGroups().get(0).getItems().get(0).getSuffix()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return places.size();
    }



}
