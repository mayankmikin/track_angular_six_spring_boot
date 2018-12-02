/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="exception_report")
public class ExceptionReport implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7820564303535062111L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
	private Long id;

    @Temporal(TemporalType.DATE)
	@Column(name="ALERT_DATE")
	private Date alertDate;

    private int overspeed;
    private int idle;
    @Column(name="IDLE_DURATION")
    private Long idleDuration;
    
    @ManyToOne
	private Asset asset;

    public ExceptionReport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(Date alertDate) {
        this.alertDate = alertDate;
    }

    public int getOverspeed() {
        return overspeed;
    }

    public void setOverspeed(int overspeed) {
        this.overspeed = overspeed;
    }

    public int getIdle() {
        return idle;
    }

    public void setIdle(int idle) {
        this.idle = idle;
    }

    public Long getIdleDuration() {
        return idleDuration;
    }

    public void setIdleDuration(Long idleDuration) {
        this.idleDuration = idleDuration;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
    

}