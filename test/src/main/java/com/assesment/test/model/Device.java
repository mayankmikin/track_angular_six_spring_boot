/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
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
 * @author Mayank Verma
 *
 */

@Entity
@Table(name="device")
public class Device implements Serializable {

    private static final long serialVersionUID = 5197402565909324498L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
    
    @Column(name="FUEL_FORMULA")
    private String fuelFormula;

    @OneToMany(mappedBy="device", fetch=FetchType.LAZY)
    private Set<Asset> assets;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MANUFACTURER_ID")
    private Manufacturer manufacturer;
    
    public Device() {
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

    public String getFuelFormula() {
        return fuelFormula;
    }

    public void setFuelFormula(String fuelFormula) {
        this.fuelFormula = fuelFormula;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
