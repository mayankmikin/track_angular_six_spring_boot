/**
 * 
 */
package com.assesment.test.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;

/**
 * @author Manas Sahu
 *
 */

@Entity
@Table(name="route")
public class Route implements Serializable {

    private static final long serialVersionUID = -6903966809413965575L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String name;
	private String description;
	private String status;

	@OneToMany(mappedBy="route", fetch=FetchType.LAZY)
	private Set<Journey> journeys;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="START_ID")
    private Location start;
	
    @ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="STOP_ID")
	private Location stop;

    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;

    /**
     * 
     */
    public Route() {
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

    public Set<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(Set<Journey> journeys) {
        this.journeys = journeys;
    }

    public Location getStart() {
        return start;
    }

    public void setStart(Location start) {
        this.start = start;
    }

    public Location getStop() {
        return stop;
    }

    public void setStop(Location stop) {
        this.stop = stop;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}