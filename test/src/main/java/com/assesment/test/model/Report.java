/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="report")
public class Report implements Serializable {

    private static final long serialVersionUID = 6267760249930259140L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
	private Long id;

    private String status;

	@Column(name="START_LOCATION")
	private String startLocation;
	@Column(name="START_TIME")
	private Timestamp startTime;

	@Column(name="STOP_LOCATION")
	private String stopLocation;
	@Column(name="STOP_TIME")
	private Timestamp stopTime;

    private double distance;
    private Long duration;
    
    private Timestamp created;

    @ManyToOne
	private Asset asset;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="START_ID")
    private Track start;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STOP_ID")
    private Track stop;

    public Report() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public String getStopLocation() {
        return stopLocation;
    }

    public void setStopLocation(String stopLocation) {
        this.stopLocation = stopLocation;
    }

    public Timestamp getStopTime() {
        return stopTime;
    }

    public void setStopTime(Timestamp stopTime) {
        this.stopTime = stopTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Track getStart() {
        return start;
    }

    public void setStart(Track start) {
        this.start = start;
    }

    public Track getStop() {
        return stop;
    }

    public void setStop(Track stop) {
        this.stop = stop;
    }
	
}