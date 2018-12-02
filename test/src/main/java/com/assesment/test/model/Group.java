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
@Table(name="groups")
public class Group implements Serializable {

    private static final long serialVersionUID = 3041990285818547039L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, unique=true, nullable=false)
    private Long id;

	private String name;

    @OneToMany(mappedBy="group", fetch=FetchType.EAGER)
    private Set<Asset> assets;
    
    @OneToMany(mappedBy="group", fetch=FetchType.EAGER)
    private Set<User> users;
    
    @ManyToOne(fetch=FetchType.EAGER)
	private Account account;

    /**
     * 
     */
    public Group() {
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

}