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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Mayank Verma
 *
 */

@Entity
@Table(name="manufacturer")
public class Manufacturer implements Serializable {

    private static final long serialVersionUID = 8200959090022234026L;
    // sequence,auto causes problem so id 1 given to device , 2 is given to manufacturer 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
    
    @OneToMany(mappedBy="manufacturer", fetch=FetchType.LAZY)
    private Set<Device> devices;

    
    public Manufacturer() {
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

    public Set<Device> getDevices() {
        return devices;
    }

    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }

}
