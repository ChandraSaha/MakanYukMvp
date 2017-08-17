
package com.chandrasaha.makanyukmvp.model.place;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Hours {

    @SerializedName("isLocalHoliday")
    private Boolean mIsLocalHoliday;
    @SerializedName("isOpen")
    private Boolean mIsOpen;
    @SerializedName("status")
    private String mStatus;

    public Boolean getIsLocalHoliday() {
        return mIsLocalHoliday;
    }

    public void setIsLocalHoliday(Boolean isLocalHoliday) {
        mIsLocalHoliday = isLocalHoliday;
    }

    public Boolean getIsOpen() {
        return mIsOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        mIsOpen = isOpen;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
