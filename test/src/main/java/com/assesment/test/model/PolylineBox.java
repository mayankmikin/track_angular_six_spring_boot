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
@Table(name="polyline_box")
public class PolylineBox implements Serializable {

    private static final long serialVersionUID = -7105299944620586770L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    @Column(name="POINT1_LAT")
    private String point1Latitude;
    @Column(name="POINT1_LNG")
    private String point1Longitude;
    @Column(name="POINT2_LAT")
    private String point2Latitude;
    @Column(name="POINT2_LNG")
    private String point2Longitude;

    @ManyToOne(fetch=FetchType.LAZY)
    private Polyline polyline;

    public PolylineBox() {
        // TODO Auto-generated constructor stub
    }
    
    public PolylineBox(String point1Latitude, String point1Longitude, String point2Latitude, String point2Longitude, Polyline polyline) {
        super();
        this.point1Latitude = point1Latitude;
        this.point1Longitude = point1Longitude;
        this.point2Latitude = point2Latitude;
        this.point2Longitude = point2Longitude;
        this.polyline = polyline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoint1Latitude() {
        return point1Latitude;
    }

    public void setPoint1Latitude(String point1Latitude) {
        this.point1Latitude = point1Latitude;
    }

    public String getPoint1Longitude() {
        return point1Longitude;
    }

    public void setPoint1Longitude(String point1Longitude) {
        this.point1Longitude = point1Longitude;
    }

    public String getPoint2Latitude() {
        return point2Latitude;
    }

    public void setPoint2Latitude(String point2Latitude) {
        this.point2Latitude = point2Latitude;
    }

    public String getPoint2Longitude() {
        return point2Longitude;
    }

    public void setPoint2Longitude(String point2Longitude) {
        this.point2Longitude = point2Longitude;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }

}