
package com.sandeep.practice.generated.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "profile_sidebar_fill_color",
    "profile_sidebar_border_color",
    "profile_background_tile",
    "name",
    "profile_image_url",
    "created_at",
    "location",
    "follow_request_sent",
    "profile_link_color",
    "is_translator",
    "id_str",
    "entities",
    "default_profile",
    "contributors_enabled",
    "favourites_count",
    "url",
    "profile_image_url_https",
    "utc_offset",
    "id",
    "profile_use_background_image",
    "listed_count",
    "profile_text_color",
    "lang",
    "followers_count",
    "protected",
    "notifications",
    "profile_background_image_url_https",
    "profile_background_color",
    "verified",
    "geo_enabled",
    "time_zone",
    "description",
    "default_profile_image",
    "profile_background_image_url",
    "statuses_count",
    "friends_count",
    "following",
    "show_all_inline_media",
    "screen_name"
})
public class User {

    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("profile_background_tile")
    private Boolean profileBackgroundTile;
    @JsonProperty("name")
    private String name;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("location")
    private String location;
    @JsonProperty("follow_request_sent")
    private Boolean followRequestSent;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("is_translator")
    private Boolean isTranslator;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("entities")
    private Entities__1 entities;
    @JsonProperty("default_profile")
    private Boolean defaultProfile;
    @JsonProperty("contributors_enabled")
    private Boolean contributorsEnabled;
    @JsonProperty("favourites_count")
    private Integer favouritesCount;
    @JsonProperty("url")
    private String url;
    @JsonProperty("profile_image_url_https")
    private String profileImageUrlHttps;
    @JsonProperty("utc_offset")
    private Integer utcOffset;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("profile_use_background_image")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("listed_count")
    private Integer listedCount;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonProperty("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("geo_enabled")
    private Boolean geoEnabled;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("description")
    private String description;
    @JsonProperty("default_profile_image")
    private Boolean defaultProfileImage;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("statuses_count")
    private Integer statusesCount;
    @JsonProperty("friends_count")
    private Integer friendsCount;
    @JsonProperty("following")
    private Boolean following;
    @JsonProperty("show_all_inline_media")
    private Boolean showAllInlineMedia;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    @JsonProperty("profile_background_tile")
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("follow_request_sent")
    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    @JsonProperty("is_translator")
    public Boolean getIsTranslator() {
        return isTranslator;
    }

    @JsonProperty("is_translator")
    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
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
    public Entities__1 getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities__1 entities) {
        this.entities = entities;
    }

    @JsonProperty("default_profile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    @JsonProperty("default_profile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    @JsonProperty("contributors_enabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    @JsonProperty("favourites_count")
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favourites_count")
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("profile_image_url_https")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    @JsonProperty("profile_image_url_https")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    @JsonProperty("utc_offset")
    public Integer getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("profile_use_background_image")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    @JsonProperty("listed_count")
    public Integer getListedCount() {
        return listedCount;
    }

    @JsonProperty("listed_count")
    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("geo_enabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("default_profile_image")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    @JsonProperty("statuses_count")
    public Integer getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statuses_count")
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    @JsonProperty("friends_count")
    public Integer getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friends_count")
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    @JsonProperty("following")
    public Boolean getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    @JsonProperty("show_all_inline_media")
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    @JsonProperty("show_all_inline_media")
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
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
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profileSidebarFillColor");
        sb.append('=');
        sb.append(((this.profileSidebarFillColor == null)?"<null>":this.profileSidebarFillColor));
        sb.append(',');
        sb.append("profileSidebarBorderColor");
        sb.append('=');
        sb.append(((this.profileSidebarBorderColor == null)?"<null>":this.profileSidebarBorderColor));
        sb.append(',');
        sb.append("profileBackgroundTile");
        sb.append('=');
        sb.append(((this.profileBackgroundTile == null)?"<null>":this.profileBackgroundTile));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("profileImageUrl");
        sb.append('=');
        sb.append(((this.profileImageUrl == null)?"<null>":this.profileImageUrl));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("followRequestSent");
        sb.append('=');
        sb.append(((this.followRequestSent == null)?"<null>":this.followRequestSent));
        sb.append(',');
        sb.append("profileLinkColor");
        sb.append('=');
        sb.append(((this.profileLinkColor == null)?"<null>":this.profileLinkColor));
        sb.append(',');
        sb.append("isTranslator");
        sb.append('=');
        sb.append(((this.isTranslator == null)?"<null>":this.isTranslator));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null)?"<null>":this.idStr));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
        sb.append(',');
        sb.append("defaultProfile");
        sb.append('=');
        sb.append(((this.defaultProfile == null)?"<null>":this.defaultProfile));
        sb.append(',');
        sb.append("contributorsEnabled");
        sb.append('=');
        sb.append(((this.contributorsEnabled == null)?"<null>":this.contributorsEnabled));
        sb.append(',');
        sb.append("favouritesCount");
        sb.append('=');
        sb.append(((this.favouritesCount == null)?"<null>":this.favouritesCount));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("profileImageUrlHttps");
        sb.append('=');
        sb.append(((this.profileImageUrlHttps == null)?"<null>":this.profileImageUrlHttps));
        sb.append(',');
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null)?"<null>":this.utcOffset));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("profileUseBackgroundImage");
        sb.append('=');
        sb.append(((this.profileUseBackgroundImage == null)?"<null>":this.profileUseBackgroundImage));
        sb.append(',');
        sb.append("listedCount");
        sb.append('=');
        sb.append(((this.listedCount == null)?"<null>":this.listedCount));
        sb.append(',');
        sb.append("profileTextColor");
        sb.append('=');
        sb.append(((this.profileTextColor == null)?"<null>":this.profileTextColor));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("followersCount");
        sb.append('=');
        sb.append(((this.followersCount == null)?"<null>":this.followersCount));
        sb.append(',');
        sb.append("_protected");
        sb.append('=');
        sb.append(((this._protected == null)?"<null>":this._protected));
        sb.append(',');
        sb.append("notifications");
        sb.append('=');
        sb.append(((this.notifications == null)?"<null>":this.notifications));
        sb.append(',');
        sb.append("profileBackgroundImageUrlHttps");
        sb.append('=');
        sb.append(((this.profileBackgroundImageUrlHttps == null)?"<null>":this.profileBackgroundImageUrlHttps));
        sb.append(',');
        sb.append("profileBackgroundColor");
        sb.append('=');
        sb.append(((this.profileBackgroundColor == null)?"<null>":this.profileBackgroundColor));
        sb.append(',');
        sb.append("verified");
        sb.append('=');
        sb.append(((this.verified == null)?"<null>":this.verified));
        sb.append(',');
        sb.append("geoEnabled");
        sb.append('=');
        sb.append(((this.geoEnabled == null)?"<null>":this.geoEnabled));
        sb.append(',');
        sb.append("timeZone");
        sb.append('=');
        sb.append(((this.timeZone == null)?"<null>":this.timeZone));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("defaultProfileImage");
        sb.append('=');
        sb.append(((this.defaultProfileImage == null)?"<null>":this.defaultProfileImage));
        sb.append(',');
        sb.append("profileBackgroundImageUrl");
        sb.append('=');
        sb.append(((this.profileBackgroundImageUrl == null)?"<null>":this.profileBackgroundImageUrl));
        sb.append(',');
        sb.append("statusesCount");
        sb.append('=');
        sb.append(((this.statusesCount == null)?"<null>":this.statusesCount));
        sb.append(',');
        sb.append("friendsCount");
        sb.append('=');
        sb.append(((this.friendsCount == null)?"<null>":this.friendsCount));
        sb.append(',');
        sb.append("following");
        sb.append('=');
        sb.append(((this.following == null)?"<null>":this.following));
        sb.append(',');
        sb.append("showAllInlineMedia");
        sb.append('=');
        sb.append(((this.showAllInlineMedia == null)?"<null>":this.showAllInlineMedia));
        sb.append(',');
        sb.append("screenName");
        sb.append('=');
        sb.append(((this.screenName == null)?"<null>":this.screenName));
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
        result = ((result* 31)+((this.showAllInlineMedia == null)? 0 :this.showAllInlineMedia.hashCode()));
        result = ((result* 31)+((this.geoEnabled == null)? 0 :this.geoEnabled.hashCode()));
        result = ((result* 31)+((this.profileTextColor == null)? 0 :this.profileTextColor.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.contributorsEnabled == null)? 0 :this.contributorsEnabled.hashCode()));
        result = ((result* 31)+((this.screenName == null)? 0 :this.screenName.hashCode()));
        result = ((result* 31)+((this.profileUseBackgroundImage == null)? 0 :this.profileUseBackgroundImage.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.profileBackgroundImageUrl == null)? 0 :this.profileBackgroundImageUrl.hashCode()));
        result = ((result* 31)+((this._protected == null)? 0 :this._protected.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.profileImageUrl == null)? 0 :this.profileImageUrl.hashCode()));
        result = ((result* 31)+((this.defaultProfileImage == null)? 0 :this.defaultProfileImage.hashCode()));
        result = ((result* 31)+((this.profileSidebarBorderColor == null)? 0 :this.profileSidebarBorderColor.hashCode()));
        result = ((result* 31)+((this.idStr == null)? 0 :this.idStr.hashCode()));
        result = ((result* 31)+((this.statusesCount == null)? 0 :this.statusesCount.hashCode()));
        result = ((result* 31)+((this.utcOffset == null)? 0 :this.utcOffset.hashCode()));
        result = ((result* 31)+((this.profileBackgroundTile == null)? 0 :this.profileBackgroundTile.hashCode()));
        result = ((result* 31)+((this.profileBackgroundImageUrlHttps == null)? 0 :this.profileBackgroundImageUrlHttps.hashCode()));
        result = ((result* 31)+((this.profileBackgroundColor == null)? 0 :this.profileBackgroundColor.hashCode()));
        result = ((result* 31)+((this.verified == null)? 0 :this.verified.hashCode()));
        result = ((result* 31)+((this.favouritesCount == null)? 0 :this.favouritesCount.hashCode()));
        result = ((result* 31)+((this.timeZone == null)? 0 :this.timeZone.hashCode()));
        result = ((result* 31)+((this.defaultProfile == null)? 0 :this.defaultProfile.hashCode()));
        result = ((result* 31)+((this.friendsCount == null)? 0 :this.friendsCount.hashCode()));
        result = ((result* 31)+((this.profileLinkColor == null)? 0 :this.profileLinkColor.hashCode()));
        result = ((result* 31)+((this.isTranslator == null)? 0 :this.isTranslator.hashCode()));
        result = ((result* 31)+((this.listedCount == null)? 0 :this.listedCount.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.profileSidebarFillColor == null)? 0 :this.profileSidebarFillColor.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.profileImageUrlHttps == null)? 0 :this.profileImageUrlHttps.hashCode()));
        result = ((result* 31)+((this.following == null)? 0 :this.following.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.followersCount == null)? 0 :this.followersCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.notifications == null)? 0 :this.notifications.hashCode()));
        result = ((result* 31)+((this.followRequestSent == null)? 0 :this.followRequestSent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return (((((((((((((((((((((((((((((((((((((((((this.showAllInlineMedia == rhs.showAllInlineMedia)||((this.showAllInlineMedia!= null)&&this.showAllInlineMedia.equals(rhs.showAllInlineMedia)))&&((this.geoEnabled == rhs.geoEnabled)||((this.geoEnabled!= null)&&this.geoEnabled.equals(rhs.geoEnabled))))&&((this.profileTextColor == rhs.profileTextColor)||((this.profileTextColor!= null)&&this.profileTextColor.equals(rhs.profileTextColor))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.contributorsEnabled == rhs.contributorsEnabled)||((this.contributorsEnabled!= null)&&this.contributorsEnabled.equals(rhs.contributorsEnabled))))&&((this.screenName == rhs.screenName)||((this.screenName!= null)&&this.screenName.equals(rhs.screenName))))&&((this.profileUseBackgroundImage == rhs.profileUseBackgroundImage)||((this.profileUseBackgroundImage!= null)&&this.profileUseBackgroundImage.equals(rhs.profileUseBackgroundImage))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.profileBackgroundImageUrl == rhs.profileBackgroundImageUrl)||((this.profileBackgroundImageUrl!= null)&&this.profileBackgroundImageUrl.equals(rhs.profileBackgroundImageUrl))))&&((this._protected == rhs._protected)||((this._protected!= null)&&this._protected.equals(rhs._protected))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.profileImageUrl == rhs.profileImageUrl)||((this.profileImageUrl!= null)&&this.profileImageUrl.equals(rhs.profileImageUrl))))&&((this.defaultProfileImage == rhs.defaultProfileImage)||((this.defaultProfileImage!= null)&&this.defaultProfileImage.equals(rhs.defaultProfileImage))))&&((this.profileSidebarBorderColor == rhs.profileSidebarBorderColor)||((this.profileSidebarBorderColor!= null)&&this.profileSidebarBorderColor.equals(rhs.profileSidebarBorderColor))))&&((this.idStr == rhs.idStr)||((this.idStr!= null)&&this.idStr.equals(rhs.idStr))))&&((this.statusesCount == rhs.statusesCount)||((this.statusesCount!= null)&&this.statusesCount.equals(rhs.statusesCount))))&&((this.utcOffset == rhs.utcOffset)||((this.utcOffset!= null)&&this.utcOffset.equals(rhs.utcOffset))))&&((this.profileBackgroundTile == rhs.profileBackgroundTile)||((this.profileBackgroundTile!= null)&&this.profileBackgroundTile.equals(rhs.profileBackgroundTile))))&&((this.profileBackgroundImageUrlHttps == rhs.profileBackgroundImageUrlHttps)||((this.profileBackgroundImageUrlHttps!= null)&&this.profileBackgroundImageUrlHttps.equals(rhs.profileBackgroundImageUrlHttps))))&&((this.profileBackgroundColor == rhs.profileBackgroundColor)||((this.profileBackgroundColor!= null)&&this.profileBackgroundColor.equals(rhs.profileBackgroundColor))))&&((this.verified == rhs.verified)||((this.verified!= null)&&this.verified.equals(rhs.verified))))&&((this.favouritesCount == rhs.favouritesCount)||((this.favouritesCount!= null)&&this.favouritesCount.equals(rhs.favouritesCount))))&&((this.timeZone == rhs.timeZone)||((this.timeZone!= null)&&this.timeZone.equals(rhs.timeZone))))&&((this.defaultProfile == rhs.defaultProfile)||((this.defaultProfile!= null)&&this.defaultProfile.equals(rhs.defaultProfile))))&&((this.friendsCount == rhs.friendsCount)||((this.friendsCount!= null)&&this.friendsCount.equals(rhs.friendsCount))))&&((this.profileLinkColor == rhs.profileLinkColor)||((this.profileLinkColor!= null)&&this.profileLinkColor.equals(rhs.profileLinkColor))))&&((this.isTranslator == rhs.isTranslator)||((this.isTranslator!= null)&&this.isTranslator.equals(rhs.isTranslator))))&&((this.listedCount == rhs.listedCount)||((this.listedCount!= null)&&this.listedCount.equals(rhs.listedCount))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.profileSidebarFillColor == rhs.profileSidebarFillColor)||((this.profileSidebarFillColor!= null)&&this.profileSidebarFillColor.equals(rhs.profileSidebarFillColor))))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.profileImageUrlHttps == rhs.profileImageUrlHttps)||((this.profileImageUrlHttps!= null)&&this.profileImageUrlHttps.equals(rhs.profileImageUrlHttps))))&&((this.following == rhs.following)||((this.following!= null)&&this.following.equals(rhs.following))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.followersCount == rhs.followersCount)||((this.followersCount!= null)&&this.followersCount.equals(rhs.followersCount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.notifications == rhs.notifications)||((this.notifications!= null)&&this.notifications.equals(rhs.notifications))))&&((this.followRequestSent == rhs.followRequestSent)||((this.followRequestSent!= null)&&this.followRequestSent.equals(rhs.followRequestSent))));
    }

}
