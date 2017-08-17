
package com.chandrasaha.makanyukmvp.model.detail;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Sample {

    @SerializedName("entities")
    private List<Entity> mEntities;
    @SerializedName("text")
    private String mText;

    public List<Entity> getEntities() {
        return mEntities;
    }

    public void setEntities(List<Entity> entities) {
        mEntities = entities;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

}
