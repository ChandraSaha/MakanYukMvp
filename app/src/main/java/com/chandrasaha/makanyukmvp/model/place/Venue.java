
package com.chandrasaha.makanyukmvp.model.place;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Venue {

    @SerializedName("allowMenuUrlEdit")
    private Boolean mAllowMenuUrlEdit;
    @SerializedName("beenHere")
    private BeenHere mBeenHere;
    @SerializedName("categories")
    private List<Category> mCategories;
    @SerializedName("contact")
    private Contact mContact;
    @SerializedName("featuredPhotos")
    private FeaturedPhotos mFeaturedPhotos;
    @SerializedName("hereNow")
    private HereNow mHereNow;
    @SerializedName("hours")
    private Hours mHours;
    @SerializedName("id")
    private String mId;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("name")
    private String mName;
    @SerializedName("photos")
    private Photos mPhotos;
    @SerializedName("price")
    private Price mPrice;
    @SerializedName("rating")
    private Double mRating;
    @SerializedName("ratingColor")
    private String mRatingColor;
    @SerializedName("ratingSignals")
    private Long mRatingSignals;
    @SerializedName("stats")
    private Stats mStats;
    @SerializedName("storeId")
    private String mStoreId;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("verified")
    private Boolean mVerified;

    public Boolean getAllowMenuUrlEdit() {
        return mAllowMenuUrlEdit;
    }

    public void setAllowMenuUrlEdit(Boolean allowMenuUrlEdit) {
        mAllowMenuUrlEdit = allowMenuUrlEdit;
    }

    public BeenHere getBeenHere() {
        return mBeenHere;
    }

    public void setBeenHere(BeenHere beenHere) {
        mBeenHere = beenHere;
    }

    public List<Category> getCategories() {
        return mCategories;
    }

    public void setCategories(List<Category> categories) {
        mCategories = categories;
    }

    public Contact getContact() {
        return mContact;
    }

    public void setContact(Contact contact) {
        mContact = contact;
    }

    public FeaturedPhotos getFeaturedPhotos() {
        return mFeaturedPhotos;
    }

    public void setFeaturedPhotos(FeaturedPhotos featuredPhotos) {
        mFeaturedPhotos = featuredPhotos;
    }

    public HereNow getHereNow() {
        return mHereNow;
    }

    public void setHereNow(HereNow hereNow) {
        mHereNow = hereNow;
    }

    public Hours getHours() {
        return mHours;
    }

    public void setHours(Hours hours) {
        mHours = hours;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Photos getPhotos() {
        return mPhotos;
    }

    public void setPhotos(Photos photos) {
        mPhotos = photos;
    }

    public Price getPrice() {
        return mPrice;
    }

    public void setPrice(Price price) {
        mPrice = price;
    }

    public Double getRating() {
        return mRating;
    }

    public void setRating(Double rating) {
        mRating = rating;
    }

    public String getRatingColor() {
        return mRatingColor;
    }

    public void setRatingColor(String ratingColor) {
        mRatingColor = ratingColor;
    }

    public Long getRatingSignals() {
        return mRatingSignals;
    }

    public void setRatingSignals(Long ratingSignals) {
        mRatingSignals = ratingSignals;
    }

    public Stats getStats() {
        return mStats;
    }

    public void setStats(Stats stats) {
        mStats = stats;
    }

    public String getStoreId() {
        return mStoreId;
    }

    public void setStoreId(String storeId) {
        mStoreId = storeId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Boolean getVerified() {
        return mVerified;
    }

    public void setVerified(Boolean verified) {
        mVerified = verified;
    }

}
