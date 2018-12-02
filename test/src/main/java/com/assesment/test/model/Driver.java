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
@Table(name="driver")
public class Driver implements Serializable {

    private static final long serialVersionUID = 521958309470125210L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String name;
	
    @Column(name="LICENSE_NUMBER", nullable=false, length=20)
    private String licenseNumber;
    @Column(name="EXPIRY_DATE")
    private Date expiryDate;
    @Column(name="DATE_OF_BIRTH")
    private Date dob;
    
    private String address;

    @Column(name="PHONE_NUMBER")
    private String phoneNumber;
    
    private String status;
    
    @ManyToOne(fetch=FetchType.LAZY)
	private Account account;

	@ManyToMany(mappedBy="drivers")
	private Set<Journey> journeys;

    /**
     * 
     */
    public Driver() {
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

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(Set<Journey> journeys) {
        this.journeys = journeys;
    }

}