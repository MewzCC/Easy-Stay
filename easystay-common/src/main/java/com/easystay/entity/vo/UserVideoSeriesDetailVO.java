package com.easystay.entity.vo;

import com.easystay.entity.po.UserVideoSeries;
import com.easystay.entity.po.UserVideoSeriesVideo;

import java.util.List;

public class UserVideoSeriesDetailVO {
    private UserVideoSeries videoSeries;
    private List<UserVideoSeriesVideo> seriesVideoList;

    public UserVideoSeriesDetailVO() {

    }

    public UserVideoSeriesDetailVO(UserVideoSeries videoSeries, List<UserVideoSeriesVideo> seriesVideoList) {
        this.videoSeries = videoSeries;
        this.seriesVideoList = seriesVideoList;
    }

    public UserVideoSeries getVideoSeries() {
        return videoSeries;
    }

    public void setVideoSeries(UserVideoSeries videoSeries) {
        this.videoSeries = videoSeries;
    }

    public List<UserVideoSeriesVideo> getSeriesVideoList() {
        return seriesVideoList;
    }

    public void setSeriesVideoList(List<UserVideoSeriesVideo> seriesVideoList) {
        this.seriesVideoList = seriesVideoList;
    }
}
