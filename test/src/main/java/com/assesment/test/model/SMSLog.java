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
@Table(name="sms_log")
public class SMSLog implements Serializable {

    private static final long serialVersionUID = -4381726052750636255L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String message;
	private String status;
    private Timestamp created;
    private Timestamp delivered;
    private String failure;
	
    @ManyToOne(fetch=FetchType.LAZY)
	private Alert alert;

    /**
     * 
     */
    public SMSLog() {
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getDelivered() {
        return delivered;
    }

    public void setDelivered(Timestamp delivered) {
        this.delivered = delivered;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public Alert getAlert() {
        return alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }
	
}