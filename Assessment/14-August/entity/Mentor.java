package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "users")
public class Mentor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 65)
    @Column(name = "user_name")
    private String userName;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String linkedin_url;

    @NotNull
    @Size(max = 128)
    private String password;
    
    @Size(max = 10)
    @Column(name = "contact")
    private long conatct;
    
    @Size(max = 10)
    @Column(name = "year_of_experience")
    private long yoe;

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
    public Mentor() {

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
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

	public long getYoe() {
		return yoe;
	}

	public void setYoe(long yoe) {
		this.yoe = yoe;
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

	public Mentor(Long id,String userName, String linkedin_url,
	String password,long conatct,long yoe,Date reg_datetime, boolean active,String reg_code)
	{
		super();
		this.id = id;
		this.userName = userName;
		this.linkedin_url = linkedin_url;
		this.password = password;
		this.conatct = conatct;
		this.yoe = yoe;
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
