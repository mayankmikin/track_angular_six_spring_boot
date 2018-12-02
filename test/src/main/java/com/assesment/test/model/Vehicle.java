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

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="vehicle")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 3163932184383282363L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    @Column(name="NAME", nullable=false, length=120)
    private String name;
    
    private int radius;
    private int length;
    
    @Column(name="CAPACITY", nullable=false, precision=10, scale=2)
    @NumberFormat(style=Style.NUMBER, pattern="#,###.##")
    private double capacity;
    
    @Column(name="LOW", nullable=false, precision=10, scale=2)
    @NumberFormat(style=Style.NUMBER, pattern="#,###.##")
    private double low;
    @Column(name="MEDIUM", nullable=false, precision=10, scale=2)
    @NumberFormat(style=Style.NUMBER, pattern="#,###.##")
    private double medium;
    @Column(name="HIGH", nullable=false, precision=10, scale=2)
    @NumberFormat(style=Style.NUMBER, pattern="#,###.##")
    private double high;

    @OneToMany(mappedBy="vehicle", fetch=FetchType.LAZY)
    private Set<Asset> assets;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="BRAND_ID")
    private Brand brand;
    
    /**
     * 
     */
    public Vehicle() {
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    
    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getMedium() {
        return medium;
    }

    public void setMedium(double medium) {
        this.medium = medium;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
