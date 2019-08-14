package com.example.jpa.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_profiles")
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    @Size(max = 15)
    private String username;

    @Size(max = 100)
    private String password;

    public Admin() {

    }
}
