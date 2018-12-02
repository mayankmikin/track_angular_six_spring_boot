/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="polyline")
public class Polyline implements Serializable {

    private static final long serialVersionUID = 4954841516658248120L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
    private String source;
    private String destination;
    private int deviation;
    
    @Lob
    private String path;
    private String status;
    
	@OneToMany(mappedBy="polyline", cascade=CascadeType.ALL)
	private List<PolylineBox> polylineBoxes;

    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;
    
    @ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinTable(
        name="polyline_alert"
        , joinColumns={
            @JoinColumn(name="POLYLINE_ID")
            }
        , inverseJoinColumns={
            @JoinColumn(name="ALERT_ID")
            }
        )
    private Set<Alert> alerts;

    /**
     * 
     */
    public Polyline() {
        // TODO Auto-generated constructor stub
    }

    public Polyline(String name) {
        super();
        this.name = name;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDeviation() {
        return deviation;
    }

    public void setDeviation(int deviation) {
        this.deviation = deviation;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PolylineBox> getPolylineBoxes() {
        return polylineBoxes;
    }

    public void setPolylineBoxes(List<PolylineBox> polylineBoxes) {
        this.polylineBoxes = polylineBoxes;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(Set<Alert> alerts) {
        this.alerts = alerts;
    }

}