
package com.sandeep.practice.generated.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coordinates",
    "favorited",
    "truncated",
    "created_at",
    "id_str",
    "entities",
    "in_reply_to_user_id_str",
    "contributors",
    "text",
    "retweet_count",
    "in_reply_to_status_id_str",
    "id",
    "geo",
    "retweeted",
    "possibly_sensitive",
    "in_reply_to_user_id",
    "place",
    "user",
    "in_reply_to_screen_name",
    "source",
    "in_reply_to_status_id"
})
public class StatusResponse {

    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("contributors")
    private List<Integer> contributors = new ArrayList<Integer>();
    @JsonProperty("text")
    private String text;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("possibly_sensitive")
    private Boolean possiblySensitive;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("user")
    private User user;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("source")
    private String source;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    @JsonProperty("contributors")
    public List<Integer> getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(List<Integer> contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("retweet_count")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("possibly_sensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    @JsonProperty("possibly_sensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatusResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coordinates");
        sb.append('=');
        sb.append(((this.coordinates == null)?"<null>":this.coordinates));
        sb.append(',');
        sb.append("favorited");
        sb.append('=');
        sb.append(((this.favorited == null)?"<null>":this.favorited));
        sb.append(',');
        sb.append("truncated");
        sb.append('=');
        sb.append(((this.truncated == null)?"<null>":this.truncated));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null)?"<null>":this.idStr));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
        sb.append(',');
        sb.append("inReplyToUserIdStr");
        sb.append('=');
        sb.append(((this.inReplyToUserIdStr == null)?"<null>":this.inReplyToUserIdStr));
        sb.append(',');
        sb.append("contributors");
        sb.append('=');
        sb.append(((this.contributors == null)?"<null>":this.contributors));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("retweetCount");
        sb.append('=');
        sb.append(((this.retweetCount == null)?"<null>":this.retweetCount));
        sb.append(',');
        sb.append("inReplyToStatusIdStr");
        sb.append('=');
        sb.append(((this.inReplyToStatusIdStr == null)?"<null>":this.inReplyToStatusIdStr));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("geo");
        sb.append('=');
        sb.append(((this.geo == null)?"<null>":this.geo));
        sb.append(',');
        sb.append("retweeted");
        sb.append('=');
        sb.append(((this.retweeted == null)?"<null>":this.retweeted));
        sb.append(',');
        sb.append("possiblySensitive");
        sb.append('=');
        sb.append(((this.possiblySensitive == null)?"<null>":this.possiblySensitive));
        sb.append(',');
        sb.append("inReplyToUserId");
        sb.append('=');
        sb.append(((this.inReplyToUserId == null)?"<null>":this.inReplyToUserId));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("inReplyToScreenName");
        sb.append('=');
        sb.append(((this.inReplyToScreenName == null)?"<null>":this.inReplyToScreenName));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("inReplyToStatusId");
        sb.append('=');
        sb.append(((this.inReplyToStatusId == null)?"<null>":this.inReplyToStatusId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.idStr == null)? 0 :this.idStr.hashCode()));
        result = ((result* 31)+((this.inReplyToUserId == null)? 0 :this.inReplyToUserId.hashCode()));
        result = ((result* 31)+((this.coordinates == null)? 0 :this.coordinates.hashCode()));
        result = ((result* 31)+((this.truncated == null)? 0 :this.truncated.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.retweeted == null)? 0 :this.retweeted.hashCode()));
        result = ((result* 31)+((this.geo == null)? 0 :this.geo.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.inReplyToScreenName == null)? 0 :this.inReplyToScreenName.hashCode()));
        result = ((result* 31)+((this.possiblySensitive == null)? 0 :this.possiblySensitive.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.inReplyToStatusId == null)? 0 :this.inReplyToStatusId.hashCode()));
        result = ((result* 31)+((this.inReplyToStatusIdStr == null)? 0 :this.inReplyToStatusIdStr.hashCode()));
        result = ((result* 31)+((this.contributors == null)? 0 :this.contributors.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.inReplyToUserIdStr == null)? 0 :this.inReplyToUserIdStr.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.retweetCount == null)? 0 :this.retweetCount.hashCode()));
        result = ((result* 31)+((this.favorited == null)? 0 :this.favorited.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusResponse) == false) {
            return false;
        }
        StatusResponse rhs = ((StatusResponse) other);
        return (((((((((((((((((((((((this.idStr == rhs.idStr)||((this.idStr!= null)&&this.idStr.equals(rhs.idStr)))&&((this.inReplyToUserId == rhs.inReplyToUserId)||((this.inReplyToUserId!= null)&&this.inReplyToUserId.equals(rhs.inReplyToUserId))))&&((this.coordinates == rhs.coordinates)||((this.coordinates!= null)&&this.coordinates.equals(rhs.coordinates))))&&((this.truncated == rhs.truncated)||((this.truncated!= null)&&this.truncated.equals(rhs.truncated))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.retweeted == rhs.retweeted)||((this.retweeted!= null)&&this.retweeted.equals(rhs.retweeted))))&&((this.geo == rhs.geo)||((this.geo!= null)&&this.geo.equals(rhs.geo))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.inReplyToScreenName == rhs.inReplyToScreenName)||((this.inReplyToScreenName!= null)&&this.inReplyToScreenName.equals(rhs.inReplyToScreenName))))&&((this.possiblySensitive == rhs.possiblySensitive)||((this.possiblySensitive!= null)&&this.possiblySensitive.equals(rhs.possiblySensitive))))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.inReplyToStatusId == rhs.inReplyToStatusId)||((this.inReplyToStatusId!= null)&&this.inReplyToStatusId.equals(rhs.inReplyToStatusId))))&&((this.inReplyToStatusIdStr == rhs.inReplyToStatusIdStr)||((this.inReplyToStatusIdStr!= null)&&this.inReplyToStatusIdStr.equals(rhs.inReplyToStatusIdStr))))&&((this.contributors == rhs.contributors)||((this.contributors!= null)&&this.contributors.equals(rhs.contributors))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inReplyToUserIdStr == rhs.inReplyToUserIdStr)||((this.inReplyToUserIdStr!= null)&&this.inReplyToUserIdStr.equals(rhs.inReplyToUserIdStr))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.retweetCount == rhs.retweetCount)||((this.retweetCount!= null)&&this.retweetCount.equals(rhs.retweetCount))))&&((this.favorited == rhs.favorited)||((this.favorited!= null)&&this.favorited.equals(rhs.favorited))));
    }

}
