package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "users")
public class Technology implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
//link to MentorSkill.java
    
    
 //unique courses must have unique mid and folowing all the entity
    @Size(max = 65)
    @Column(name = "technologyname")
    private String technologyname ;
    
    @Size(max = 65)
    @Column(name = "toc")
    private String toc ;
    
    @Size(max = 65)
    @Column(name = "Fees")
    private int fees ;
    
    @Size(max = 65)
    @Column(name = "Duration")
    private int duration ;
    
    @Size(max = 65)
    @Column(name = "prerequites")
    private String prerequites ;
    
    
    

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public Technology() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
