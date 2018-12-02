/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="fuel_report")
public class FuelReport implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8520228337100974361L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;
    
    private double fuel;
    private Timestamp originated;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ASSET_ID")
    private Asset asset;
    
    /**
     * 
     */
    public FuelReport() {
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Timestamp getOriginated() {
        return originated;
    }

    public void setOriginated(Timestamp originated) {
        this.originated = originated;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

}
