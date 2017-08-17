
package com.chandrasaha.makanyukmvp.model.place;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Item {

    @SerializedName("createdAt")
    private Long mCreatedAt;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("id")
    private String mId;
    @SerializedName("prefix")
    private String mPrefix;
    @SerializedName("reasonName")
    private String mReasonName;
    @SerializedName("reasons")
    private Reasons mReasons;
    @SerializedName("referralId")
    private String mReferralId;
    @SerializedName("suffix")
    private String mSuffix;
    @SerializedName("summary")
    private String mSummary;
    @SerializedName("tips")
    private List<Tip> mTips;
    @SerializedName("type")
    private String mType;
    @SerializedName("user")
    private User mUser;
    @SerializedName("venue")
    private Venue mVenue;
    @SerializedName("visibility")
    private String mVisibility;
    @SerializedName("width")
    private Long mWidth;

    public Long getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(Long createdAt) {
        mCreatedAt = createdAt;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getPrefix() {
        return mPrefix;
    }

    public void setPrefix(String prefix) {
        mPrefix = prefix;
    }

    public String getReasonName() {
        return mReasonName;
    }

    public void setReasonName(String reasonName) {
        mReasonName = reasonName;
    }

    public Reasons getReasons() {
        return mReasons;
    }

    public void setReasons(Reasons reasons) {
        mReasons = reasons;
    }

    public String getReferralId() {
        return mReferralId;
    }

    public void setReferralId(String referralId) {
        mReferralId = referralId;
    }

    public String getSuffix() {
        return mSuffix;
    }

    public void setSuffix(String suffix) {
        mSuffix = suffix;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public List<Tip> getTips() {
        return mTips;
    }

    public void setTips(List<Tip> tips) {
        mTips = tips;
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

    public Venue getVenue() {
        return mVenue;
    }

    public void setVenue(Venue venue) {
        mVenue = venue;
    }

    public String getVisibility() {
        return mVisibility;
    }

    public void setVisibility(String visibility) {
        mVisibility = visibility;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
