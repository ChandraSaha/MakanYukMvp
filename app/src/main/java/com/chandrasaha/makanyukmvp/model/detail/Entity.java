
package com.chandrasaha.makanyukmvp.model.detail;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Entity {

    @SerializedName("indices")
    private List<Long> mIndices;
    @SerializedName("type")
    private String mType;

    public List<Long> getIndices() {
        return mIndices;
    }

    public void setIndices(List<Long> indices) {
        mIndices = indices;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
