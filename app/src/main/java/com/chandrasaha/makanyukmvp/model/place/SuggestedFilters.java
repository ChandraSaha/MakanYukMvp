
package com.chandrasaha.makanyukmvp.model.place;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SuggestedFilters {

    @SerializedName("filters")
    private List<Filter> mFilters;
    @SerializedName("header")
    private String mHeader;

    public List<Filter> getFilters() {
        return mFilters;
    }

    public void setFilters(List<Filter> filters) {
        mFilters = filters;
    }

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(String header) {
        mHeader = header;
    }

}
