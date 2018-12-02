/**
 * 
 */
package com.assesment.test.model;

import static javax.persistence.TemporalType.TIME;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="alert")
public class Alert implements Serializable {

    private static final long serialVersionUID = 2043966252976258685L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;
    
    private String name;
    private String code;
    private String operator;
    private String value;
    private String mode;
	private String email;
	private String phone;
	
    @Column(name="DND_MODE")
    private String dndMode;
    
    @Temporal(TIME)
    @Column(name="DND_START_TIME", nullable=true)
    private Date dndStartTime;
    
    @Temporal(TIME)
    @Column(name="DND_STOP_TIME", nullable=true)
    private Date dndStopTime;
    
    private String status;
    
    @OneToMany(mappedBy="alert", fetch=FetchType.LAZY)
    private Set<EmailLog> emailLogs;
    
    @OneToMany(mappedBy="alert", fetch=FetchType.LAZY)
    private Set<SMSLog> smsLogs;

    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;

    @ManyToOne(fetch=FetchType.LAZY)
    private User user;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
        name="alert_asset"
        , joinColumns={
            @JoinColumn(name="ALERT_ID")
            }
        , inverseJoinColumns={
            @JoinColumn(name="ASSET_ID")
            }
        )
    private Set<Asset> assets;

    @ManyToMany(mappedBy="alerts", fetch=FetchType.LAZY)
    private Set<Geozone> geozones;

    @ManyToMany(mappedBy="alerts", fetch=FetchType.LAZY)
    private Set<Landmark> landmarks;

    /**
     * 
     */
    public Alert() {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public String getDndMode() {
        return dndMode;
    }

    public void setDndMode(String dndMode) {
        this.dndMode = dndMode;
    }

    public Date getDndStartTime() {
        return dndStartTime;
    }

    public void setDndStartTime(Date dndStartTime) {
        this.dndStartTime = dndStartTime;
    }

    public Date getDndStopTime() {
        return dndStopTime;
    }

    public void setDndStopTime(Date dndStopTime) {
        this.dndStopTime = dndStopTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<EmailLog> getEmailLogs() {
        return emailLogs;
    }

    public void setEmailLogs(Set<EmailLog> emailLogs) {
        this.emailLogs = emailLogs;
    }

    public Set<SMSLog> getSmsLogs() {
        return smsLogs;
    }

    public void setSmsLogs(Set<SMSLog> smsLogs) {
        this.smsLogs = smsLogs;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

    public Set<Geozone> getGeozones() {
        return geozones;
    }

    public void setGeozones(Set<Geozone> geozones) {
        this.geozones = geozones;
    }

    public Set<Landmark> getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(Set<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

}