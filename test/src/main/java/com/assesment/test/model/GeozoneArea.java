/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="geozone_area")
public class GeozoneArea implements Serializable {

    private static final long serialVersionUID = -7105299944620586770L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String latitude;
	private String longitude;

    @ManyToOne(fetch=FetchType.LAZY)
	private Geozone geozone;

    public GeozoneArea() {
        // TODO Auto-generated constructor stub
    }

    public GeozoneArea(String latitude, String longitude) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Geozone getGeozone() {
        return geozone;
    }

    public void setGeozone(Geozone geozone) {
        this.geozone = geozone;
    }

}