package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "users")
public class MentorSkill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//link to Mentor.java
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
 //unique courses must have unique mid and folowing all the entity
    @Size(max = 10)
    @Column(name = "self_rating")
    private long selfrating;
    
    @Size(max = 10)
    @Column(name = "year_of_experience")
    private long yoe;

    @Size(max = 65)
    @Column(name = "training_delivered")
    private int trainingdelivered ;
    
    
    //import sid from technology.java
    
    
	/*
	 * @NotNull
	 * 
	 * @Size(max = 65)
	 * 
	 * @Column(name = "courses") private String course;
	 */ //must be list //unique 

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public MentorSkill() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
