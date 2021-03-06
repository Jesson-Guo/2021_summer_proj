package com.example.pojo;

import java.io.Serializable;

public class GymVideo implements Serializable {
    private Long id;

    private String videourl;

    private String gymVideoName;

    private Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getGymVideoName() {
        return gymVideoName;
    }

    public void setGymVideoName(String gymVideoName) {
        this.gymVideoName = gymVideoName == null ? null : gymVideoName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}