package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;  //training id
//import userid from User.java
//import mid from Mentor.java
//import sid from Technology.java
//import tid from Training.java
    
 //commission can be edit under the mid in the payment page
    @Size(max = 65)
    @Column(name = "commission")
    private String commission ;
    

    

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public Payment() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
