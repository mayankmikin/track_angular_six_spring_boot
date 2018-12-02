/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="rawdata")
public class RawData implements Serializable {

    private static final long serialVersionUID = -8642381046193385327L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String data;
    private Timestamp created;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Asset asset;

    /**
     * 
     */
    public RawData() {
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

}