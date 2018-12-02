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
@Table(name="permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 6737307691379334483L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String name;

	@ManyToMany(mappedBy="permissions", fetch=FetchType.LAZY)
	private Set<Role> roles;

    /**
     * 
     */
    public Permission() {
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
	
}