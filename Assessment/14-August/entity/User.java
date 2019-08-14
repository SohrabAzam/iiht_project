package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//import sid from Technology.java  for registration of any course.
    @NotNull
    @Size(max = 65)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 65)
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(max = 128)
    private String password;
    
    @Size(max = 10)
    @Column(name = "contact")
    private long conatct;

    @Size(max = 65)
    @Column(name = "reg_datetime")
    private Date reg_datetime ;

    @Column(name = "active")
	private boolean active;
    
    @NotNull
    @Size(max = 65)
    @Column(name = "reg_code")
    private String reg_code;

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public User() {

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getConatct() {
		return conatct;
	}

	public void setConatct(long conatct) {
		this.conatct = conatct;
	}

	public Date getReg_datetime() {
		return reg_datetime;
	}

	public void setReg_datetime(Date reg_datetime) {
		this.reg_datetime = reg_datetime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getReg_code() {
		return reg_code;
	}

	public void setReg_code(String reg_code) {
		this.reg_code = reg_code;
	}

	public User(Long id,String firstName,String lastName,String email, String password,long conatct, Date reg_datetime, boolean active,String reg_code)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.conatct = conatct;
		this.reg_datetime = reg_datetime;
		this.active = active;
		this.reg_code = reg_code;
	}
    

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
