/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="track_history")
public class Track_History implements Serializable {

    private static final long serialVersionUID = -301644245797762781L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private double latitude;
    private double longitude;
    private int altitude;
    private int speed;
    private String ignition;
    private int course;
    
    private double fuel;
    private double fuels;
    private int temp;
    private int temps;
    private String misc;
    private String miscs;
    
    private String ac;
    private String door;
    private String reserved;

    private String gps;
    private int satelites;

	/*@Column(name="RAW_ID")
    private Long rawid;
	  public Long getRawid() {
			return rawid;
		}

		public void setRawid(Long rawid) {
			this.rawid = rawid;
		}*/
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp originated;
    private Timestamp created;

    private String location;
    
    @OneToMany(mappedBy="start", fetch=FetchType.LAZY)
    private Set<Report> startReports;

    @OneToMany(mappedBy="stop", fetch=FetchType.LAZY)
    private Set<Report> stopReports;
    
    @OneToMany(mappedBy="start", fetch=FetchType.LAZY)
    private Set<GroupReport> startGroupReports;

    @OneToMany(mappedBy="stop", fetch=FetchType.LAZY)
    private Set<GroupReport> stopGroupReports;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GEOCODE_ID")
    private Geocode geocode;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ASSET_ID")
    private Asset asset;

    /**
     * 
     */
    public Track_History() {
        // TODO Auto-generated constructor stub
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

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuels() {
        return fuels;
    }

    public void setFuels(double fuels) {
        this.fuels = fuels;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public String getMiscs() {
        return miscs;
    }

    public void setMiscs(String miscs) {
        this.miscs = miscs;
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

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public Timestamp getOriginated() {
        return originated;
    }

    public void setOriginated(Timestamp originated) {
        this.originated = originated;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Report> getStartReports() {
        return startReports;
    }

    public void setStartReports(Set<Report> startReports) {
        this.startReports = startReports;
    }

    public Set<Report> getStopReports() {
        return stopReports;
    }

    public void setStopReports(Set<Report> stopReports) {
        this.stopReports = stopReports;
    }

    public Set<GroupReport> getStartGroupReports() {
        return startGroupReports;
    }

    public void setStartGroupReports(Set<GroupReport> startGroupReports) {
        this.startGroupReports = startGroupReports;
    }

    public Set<GroupReport> getStopGroupReports() {
        return stopGroupReports;
    }

    public void setStopGroupReports(Set<GroupReport> stopGroupReports) {
        this.stopGroupReports = stopGroupReports;
    }

    public Geocode getGeocode() {
        return geocode;
    }

    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

}