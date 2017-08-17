
package com.chandrasaha.makanyukmvp.model.place;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Response {

    @SerializedName("groups")
    private List<Group> mGroups;
    @SerializedName("headerFullLocation")
    private String mHeaderFullLocation;
    @SerializedName("headerLocation")
    private String mHeaderLocation;
    @SerializedName("headerLocationGranularity")
    private String mHeaderLocationGranularity;
    @SerializedName("query")
    private String mQuery;
    @SerializedName("suggestedBounds")
    private SuggestedBounds mSuggestedBounds;
    @SerializedName("suggestedFilters")
    private SuggestedFilters mSuggestedFilters;
    @SerializedName("totalResults")
    private Long mTotalResults;

    public List<Group> getGroups() {
        return mGroups;
    }

    public void setGroups(List<Group> groups) {
        mGroups = groups;
    }

    public String getHeaderFullLocation() {
        return mHeaderFullLocation;
    }

    public void setHeaderFullLocation(String headerFullLocation) {
        mHeaderFullLocation = headerFullLocation;
    }

    public String getHeaderLocation() {
        return mHeaderLocation;
    }

    public void setHeaderLocation(String headerLocation) {
        mHeaderLocation = headerLocation;
    }

    public String getHeaderLocationGranularity() {
        return mHeaderLocationGranularity;
    }

    public void setHeaderLocationGranularity(String headerLocationGranularity) {
        mHeaderLocationGranularity = headerLocationGranularity;
    }

    public String getQuery() {
        return mQuery;
    }

    public void setQuery(String query) {
        mQuery = query;
    }

    public SuggestedBounds getSuggestedBounds() {
        return mSuggestedBounds;
    }

    public void setSuggestedBounds(SuggestedBounds suggestedBounds) {
        mSuggestedBounds = suggestedBounds;
    }

    public SuggestedFilters getSuggestedFilters() {
        return mSuggestedFilters;
    }

    public void setSuggestedFilters(SuggestedFilters suggestedFilters) {
        mSuggestedFilters = suggestedFilters;
    }

    public Long getTotalResults() {
        return mTotalResults;
    }

    public void setTotalResults(Long totalResults) {
        mTotalResults = totalResults;
    }

}
