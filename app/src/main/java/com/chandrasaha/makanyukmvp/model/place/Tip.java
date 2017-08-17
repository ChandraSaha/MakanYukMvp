
package com.chandrasaha.makanyukmvp.model.place;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Tip {

    @SerializedName("agreeCount")
    private Long mAgreeCount;
    @SerializedName("canonicalUrl")
    private String mCanonicalUrl;
    @SerializedName("createdAt")
    private Long mCreatedAt;
    @SerializedName("disagreeCount")
    private Long mDisagreeCount;
    @SerializedName("id")
    private String mId;
    @SerializedName("likes")
    private Likes mLikes;
    @SerializedName("logView")
    private Boolean mLogView;
    @SerializedName("photo")
    private Photo mPhoto;
    @SerializedName("photourl")
    private String mPhotourl;
    @SerializedName("text")
    private String mText;
    @SerializedName("todo")
    private Todo mTodo;
    @SerializedName("type")
    private String mType;
    @SerializedName("user")
    private User mUser;

    public Long getAgreeCount() {
        return mAgreeCount;
    }

    public void setAgreeCount(Long agreeCount) {
        mAgreeCount = agreeCount;
    }

    public String getCanonicalUrl() {
        return mCanonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        mCanonicalUrl = canonicalUrl;
    }

    public Long getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(Long createdAt) {
        mCreatedAt = createdAt;
    }

    public Long getDisagreeCount() {
        return mDisagreeCount;
    }

    public void setDisagreeCount(Long disagreeCount) {
        mDisagreeCount = disagreeCount;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Likes getLikes() {
        return mLikes;
    }

    public void setLikes(Likes likes) {
        mLikes = likes;
    }

    public Boolean getLogView() {
        return mLogView;
    }

    public void setLogView(Boolean logView) {
        mLogView = logView;
    }

    public Photo getPhoto() {
        return mPhoto;
    }

    public void setPhoto(Photo photo) {
        mPhoto = photo;
    }

    public String getPhotourl() {
        return mPhotourl;
    }

    public void setPhotourl(String photourl) {
        mPhotourl = photourl;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Todo getTodo() {
        return mTodo;
    }

    public void setTodo(Todo todo) {
        mTodo = todo;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

}
