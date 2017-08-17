
package com.chandrasaha.makanyukmvp.model.detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class BeenHere {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("lastCheckinExpiredAt")
    private Long mLastCheckinExpiredAt;
    @SerializedName("marked")
    private Boolean mMarked;
    @SerializedName("unconfirmedCount")
    private Long mUnconfirmedCount;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public Long getLastCheckinExpiredAt() {
        return mLastCheckinExpiredAt;
    }

    public void setLastCheckinExpiredAt(Long lastCheckinExpiredAt) {
        mLastCheckinExpiredAt = lastCheckinExpiredAt;
    }

    public Boolean getMarked() {
        return mMarked;
    }

    public void setMarked(Boolean marked) {
        mMarked = marked;
    }

    public Long getUnconfirmedCount() {
        return mUnconfirmedCount;
    }

    public void setUnconfirmedCount(Long unconfirmedCount) {
        mUnconfirmedCount = unconfirmedCount;
    }

}
