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
@Table(name="account")
public class Account implements Serializable {

    private static final long serialVersionUID = -4340554149745583731L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;
    
    private String type;
    private String name;
    private String logo;
    private String address;
    private String contact;
    private String email;
    private String phone;
    
    @Column(name="SMS_CAP")
    private int smscap;

    private String status;
    
    private Timestamp created;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ZONE_ID")
    private Zone zone;
    
    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Alert> alerts;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Asset> assets;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Driver> drivers;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Geozone> geozones;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Group> groups;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Journey> journeys;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Landmark> landmarks;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Location> locations;
    
    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Role> roles;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<Route> routes;

    @OneToMany(mappedBy="account", fetch=FetchType.LAZY)
    private Set<User> users;
/*    
    @OneToMany(mappedBy="account")
    private Set<SMSBill> smsBills;
*/
    /**
     * 
     */
    public Account() {
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSmscap() {
        return smscap;
    }

    public void setSmscap(int smscap) {
        this.smscap = smscap;
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

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Set<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(Set<Alert> alerts) {
        this.alerts = alerts;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Set<Geozone> getGeozones() {
        return geozones;
    }

    public void setGeozones(Set<Geozone> geozones) {
        this.geozones = geozones;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public Set<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(Set<Journey> journeys) {
        this.journeys = journeys;
    }

    public Set<Landmark> getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(Set<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
/*
    public Set<SMSBill> getSmsBills() {
        return smsBills;
    }

    public void setSmsBills(Set<SMSBill> smsBills) {
        this.smsBills = smsBills;
    }
*/
}
