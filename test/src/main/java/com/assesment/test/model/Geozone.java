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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="geozone")
public class Geozone implements Serializable {

    private static final long serialVersionUID = 4954841516658248120L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
    private String description;
    private String status;
    
	@OneToMany(mappedBy="geozone", cascade=CascadeType.ALL)
	private List<GeozoneArea> geozoneAreas;

    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;
    
    @ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinTable(
        name="geozone_alert"
        , joinColumns={
            @JoinColumn(name="GEOZONE_ID")
            }
        , inverseJoinColumns={
            @JoinColumn(name="ALERT_ID")
            }
        )
    private Set<Alert> alerts;

    /**
     * 
     */
    public Geozone() {
        // TODO Auto-generated constructor stub
    }

    public Geozone(String name, String description) {
        super();
        this.name = name;
        this.description = description;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeozoneArea> getGeozoneAreas() {
        return geozoneAreas;
    }

    public void setGeozoneAreas(List<GeozoneArea> geozoneAreas) {
        this.geozoneAreas = geozoneAreas;
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