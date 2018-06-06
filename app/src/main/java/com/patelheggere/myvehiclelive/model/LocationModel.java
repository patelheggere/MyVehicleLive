package com.patelheggere.myvehiclelive.model;

/**
 * Created by Patel Heggere on 3/13/2018.
 */

public class LocationModel {
    double lat;
    double lon;
    long timestamp;

    public LocationModel(double lat, double lon, long timestamp) {
        this.lat = lat;
        this.lon = lon;
        this.timestamp = timestamp;
    }
    public LocationModel()
    {

    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
