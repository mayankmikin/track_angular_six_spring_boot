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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="asset")
public class Asset implements Serializable {

    private static final long serialVersionUID = 1392604882248957977L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;

    @Column(name="LICENSE_NUMBER", nullable=false, length=20)
    private String licenseNumber;
    
    @Column(name="IMEI", nullable=false, length=20)
    private String IMEI;
    
    @Column(name="IMSI", nullable=true, length=20)
    private String IMSI;
    
    private String icon;

    private String prop;
    private String fuel;
    
    @Column(name="LOADS")
    private String load;
    private String temp;
    private String misc;
    private String ac;
    private String door;
    private String reserved;
    
    @Column(name="LOW", nullable=false, precision=10, scale=2)
    @NumberFormat(style=Style.NUMBER, pattern="#,###.##")
    private double low;
    @Column(name="HIGH", nullable=false, precision=10, scale=2)
    @NumberFormat(style=Style.NUMBER, pattern="#,###.##")
    private double high;
    
    private String timezone;
    private String status;
    private Timestamp created;
    @Column(name="JOINED", nullable=true)
    private Timestamp joined;

    @OneToOne(mappedBy="asset", fetch=FetchType.LAZY, optional=true)
    @LazyToOne(LazyToOneOption.NO_PROXY)
    private AssetInfo assetInfo;

    @OneToMany(mappedBy="asset")
    private Set<GroupReport> dailyReports;

    @OneToMany(mappedBy="asset", fetch=FetchType.LAZY)
    private Set<Journey> journeys;

    @OneToMany(mappedBy="asset")
    private Set<Report> reports;
    
    @OneToMany(mappedBy="asset")
    private Set<ExceptionReport> exceptionreports;
    
    @OneToMany(mappedBy="asset")
    private Set<FuelReport> fuelReports;

    @OneToMany(mappedBy="asset", fetch=FetchType.LAZY)
    private Set<Track> tracks;
    
    @OneToMany(mappedBy="asset", fetch=FetchType.LAZY)
    private Set<RawData> rawdatae;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ACCOUNT_ID")
    private Account account;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DEVICE_ID")
    private Device device;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DRIVER_ID")
    private Driver driver;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GROUP_ID")
    private Group group;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="VEHICLE_ID")
    private Vehicle vehicle;

    @ManyToMany(mappedBy="assets", fetch=FetchType.LAZY)
    private Set<Alert> alerts;
    
  /*  @Column(name="DEMAND_STATUS")
    private byte DemandStatus;
    public byte getDemandStatus() {
		return DemandStatus;
	}

	public void setDemandStatus(byte demandStatus) {
		DemandStatus = demandStatus;
	}*/

	/**
     * 
     */
    public Asset() {
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
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

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getJoined() {
        return joined;
    }

    public void setJoined(Timestamp joined) {
        this.joined = joined;
    }

    public AssetInfo getAssetInfo() {
        return assetInfo;
    }

    public void setAssetInfo(AssetInfo assetInfo) {
        this.assetInfo = assetInfo;
    }

    public Set<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(Set<Journey> journeys) {
        this.journeys = journeys;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public Set<RawData> getRawdatae() {
        return rawdatae;
    }

    public void setRawdatae(Set<RawData> rawdatae) {
        this.rawdatae = rawdatae;
    }

    public Set<GroupReport> getDailyReports() {
        return dailyReports;
    }

    public void setDailyReports(Set<GroupReport> dailyReports) {
        this.dailyReports = dailyReports;
    }

    public Set<Report> getReports() {
        return reports;
    }

    public void setReports(Set<Report> reports) {
        this.reports = reports;
    }

    public Set<ExceptionReport> getExceptionreports() {
        return exceptionreports;
    }

    public void setExceptionreports(Set<ExceptionReport> exceptionreports) {
        this.exceptionreports = exceptionreports;
    }

    public Set<FuelReport> getFuelReports() {
        return fuelReports;
    }

    public void setFuelReports(Set<FuelReport> fuelReports) {
        this.fuelReports = fuelReports;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Set<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(Set<Alert> alerts) {
        this.alerts = alerts;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((IMEI == null) ? 0 : IMEI.hashCode());
        result = prime * result + ((IMSI == null) ? 0 : IMSI.hashCode());
        result = prime * result + ((created == null) ? 0 : created.hashCode());
        result = prime * result
                + ((licenseNumber == null) ? 0 : licenseNumber.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result
                + ((timezone == null) ? 0 : timezone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Asset other = (Asset) obj;
        if (IMEI == null) {
            if (other.IMEI != null)
                return false;
        } else if (!IMEI.equals(other.IMEI))
            return false;
        if (IMSI == null) {
            if (other.IMSI != null)
                return false;
        } else if (!IMSI.equals(other.IMSI))
            return false;
        if (created == null) {
            if (other.created != null)
                return false;
        } else if (!created.equals(other.created))
            return false;
        if (licenseNumber == null) {
            if (other.licenseNumber != null)
                return false;
        } else if (!licenseNumber.equals(other.licenseNumber))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (timezone == null) {
            if (other.timezone != null)
                return false;
        } else if (!timezone.equals(other.timezone))
            return false;
        return true;
    }

}
