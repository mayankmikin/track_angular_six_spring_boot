/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="location")
public class Location implements Serializable {

    private static final long serialVersionUID = 5147649488065632067L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
	private String latitude;
	private String longitude;
	private String status;

	@OneToMany(mappedBy="start", fetch=FetchType.LAZY)
	private Set<Route> startRoutes;

	@OneToMany(mappedBy="stop", fetch=FetchType.LAZY)
	private Set<Route> stopRoutes;

    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;

    /**
     * 
     */
    public Location() {
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Route> getStartRoutes() {
        return startRoutes;
    }

    public void setStartRoutes(Set<Route> startRoutes) {
        this.startRoutes = startRoutes;
    }

    public Set<Route> getStopRoutes() {
        return stopRoutes;
    }

    public void setStopRoutes(Set<Route> stopRoutes) {
        this.stopRoutes = stopRoutes;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}