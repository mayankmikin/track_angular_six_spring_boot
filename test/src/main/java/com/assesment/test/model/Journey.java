/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.Set;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="journey")
public class Journey implements Serializable {

    private static final long serialVersionUID = 1864869379589756992L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String name;
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_TIME")
	private Date startTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STOP_TIME")
	private Date stopTime;

    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;

    @ManyToOne(fetch=FetchType.LAZY)
    private Asset asset;

    @ManyToOne(fetch=FetchType.LAZY)
    private Route route;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
        name="journey_driver"
        , joinColumns={
            @JoinColumn(name="JOURNEY_ID")
            }
        , inverseJoinColumns={
            @JoinColumn(name="DRIVER_ID")
            }
        )
    private Set<Driver> drivers;

    /**
     * 
     */
    public Journey() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }
	
}