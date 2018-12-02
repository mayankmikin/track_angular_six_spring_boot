/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="asset_info")
public class AssetInfo implements Serializable {

    private static final long serialVersionUID = -7368711076409121645L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private double latitude;
    private double longitude;
    private int course;
    private int speed;
    private String ignition;
    private double fuel;
   /* @Column(name="ASSET_STATUS")
    private byte Asset_Status;*/
	@Column(name="LOADS")
    private double load;
    private int temp;
    private String ac;
    private String door;

    @Temporal(TemporalType.TIMESTAMP)
    private Date originated;
    @Temporal(TemporalType.TIMESTAMP)
    private Date initialized;
    
    private String location;

    @OneToOne(optional = false)
    private Asset asset;

    public AssetInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getIgnition() {
        return ignition;
    }

    public void setIgnition(String ignition) {
        this.ignition = ignition;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Date getOriginated() {
        return originated;
    }

    public void setOriginated(Date originated) {
        this.originated = originated;
    }

    public Date getInitialized() {
        return initialized;
    }

    public void setInitialized(Date initialized) {
        this.initialized = initialized;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
/*
    public byte isAsset_Status() {
		return Asset_Status;
	}

	public void setAsset_Status(byte asset_Status) {
		Asset_Status = asset_Status;
	}*/
}