
package com.chandrasaha.makanyukmvp.model.place;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Photo {

    @SerializedName("createdAt")
    private Long mCreatedAt;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("id")
    private String mId;
    @SerializedName("prefix")
    private String mPrefix;
    @SerializedName("source")
    private Source mSource;
    @SerializedName("suffix")
    private String mSuffix;
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

    public Source getSource() {
        return mSource;
    }

    public void setSource(Source source) {
        mSource = source;
    }

    public String getSuffix() {
        return mSuffix;
    }

    public void setSuffix(String suffix) {
        mSuffix = suffix;
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
