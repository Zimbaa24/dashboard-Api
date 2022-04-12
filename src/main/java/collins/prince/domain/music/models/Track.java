package collins.prince.domain.music.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@JsonIgnoreProperties({"share", "images", "hub", "artists", "url"})
public class Track {

    private String layout;
    private String type;
    private String key;
    private String title;
    @JsonProperty("subtitle")
    private String subTitle;


    public Track() {
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(layout, track.layout) && Objects.equals(type, track.type) && Objects.equals(key, track.key) && Objects.equals(title, track.title) && Objects.equals(subTitle, track.subTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layout, type, key, title, subTitle);
    }

    @Override
    public String toString() {
        return "Track{" +
                "layout='" + layout + '\'' +
                ", type='" + type + '\'' +
                ", key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}