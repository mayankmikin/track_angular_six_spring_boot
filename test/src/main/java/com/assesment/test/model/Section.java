/**
 * 
 */
package com.assesment.test.model;

import java.sql.Timestamp;

/**
 * @author Manas Sahu
 *
 */
public class Section {

    private Long startID;
    private Long stopID;
    private Timestamp startTime;
    private Timestamp stopTime;
    private String startLocation;
    private String stopLocation;

    double distance;
    
    /**
     * 
     */
    public Section() {
        // TODO Auto-generated constructor stub
    }

    public Section(Long startID, Long stopID, Timestamp startTime,
            Timestamp stopTime, String startLocation, String stopLocation,
            double distance) {
        super();
        this.startID = startID;
        this.stopID = stopID;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.startLocation = startLocation;
        this.stopLocation = stopLocation;
        this.distance = distance;
    }

    public Long getStartID() {
        return startID;
    }

    public void setStartID(Long startID) {
        this.startID = startID;
    }

    public Long getStopID() {
        return stopID;
    }

    public void setStopID(Long stopID) {
        this.stopID = stopID;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getStopTime() {
        return stopTime;
    }

    public void setStopTime(Timestamp stopTime) {
        this.stopTime = stopTime;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getStopLocation() {
        return stopLocation;
    }

    public void setStopLocation(String stopLocation) {
        this.stopLocation = stopLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}
