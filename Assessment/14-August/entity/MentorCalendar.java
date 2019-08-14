package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "users")
public class MentorCalendar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//link to Mentor.java
    
//link to mentorSkill.java Mid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
 //unique courses must have unique mid and folowing all the entity
    @Size(max = 65)
    @Column(name = "starttime")
    private String starttime ;
    
    @Size(max = 65)
    @Column(name = "endtime")
    private String endtime ;
    
    @Size(max = 65)
    @Column(name = "startdate")
    private Date startdate ;
    
    @Size(max = 65)
    @Column(name = "enddate")
    private Date enddate ;
    
    
    

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public MentorCalendar() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
