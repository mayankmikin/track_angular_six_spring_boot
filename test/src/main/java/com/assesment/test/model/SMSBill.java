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
@Table(name="sms_bill")
public class SMSBill implements Serializable {

    private static final long serialVersionUID = -4952231303526163202L;

    @Id
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
    private String contact;
    private int cap;
    private long total;

    public SMSBill() {
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}