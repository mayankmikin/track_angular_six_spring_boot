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
@Table(name="role")
public class Role implements Serializable {

    private static final long serialVersionUID = 4948953139560965619L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

    private String name;
    private String type;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Account account;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name="role_permission"
        , joinColumns={
            @JoinColumn(name="ROLE_ID")
            }
        , inverseJoinColumns={
            @JoinColumn(name="PERMISSION_ID")
            }
        )
    private Set<Permission> permissions;

    @ManyToMany(mappedBy="role")
    private Set<User> users;

    /**
     * 
     */
    public Role() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
    
}