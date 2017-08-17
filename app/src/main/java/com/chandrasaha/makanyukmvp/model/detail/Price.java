
package com.chandrasaha.makanyukmvp.model.detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Price {

    @SerializedName("currency")
    private String mCurrency;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("tier")
    private Long mTier;

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Long getTier() {
        return mTier;
    }

    public void setTier(Long tier) {
        mTier = tier;
    }

}
