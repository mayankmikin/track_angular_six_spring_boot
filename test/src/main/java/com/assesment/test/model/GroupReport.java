/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="group_report")
public class GroupReport implements Serializable {

    private static final long serialVersionUID = 3696075480923036115L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
	private Long id;

    @Column(name="START_LOCATION")
    private String startLocation;
    @Column(name="STOP_LOCATION")
    private String stopLocation;

    @Temporal(TemporalType.DATE)
	@Column(name="REPORT_DATE")
	private Date reportDate;

    private double distance;
    private Long duration;
    private Timestamp created;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="START_ID")
    private Track start;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STOP_ID")
    private Track stop;
    
    @ManyToOne
	private Asset asset;

    public GroupReport() {
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
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

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
	
}