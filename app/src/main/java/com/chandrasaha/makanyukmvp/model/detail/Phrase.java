
package com.chandrasaha.makanyukmvp.model.detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Phrase {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("phrase")
    private String mPhrase;
    @SerializedName("sample")
    private Sample mSample;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public String getPhrase() {
        return mPhrase;
    }

    public void setPhrase(String phrase) {
        mPhrase = phrase;
    }

    public Sample getSample() {
        return mSample;
    }

    public void setSample(Sample sample) {
        mSample = sample;
    }

}
