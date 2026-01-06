package com.nutrion.nutrionbackend.domain;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<QrCode> codes;

    public User() {}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole () {
        return this.role;
    }

    public void setRole (String role) {
       this.role = role;
    }

    public List<QrCode> getCodes(){
        return this.codes;
    }

    public void setCodes(List<QrCode> codes){
        this.codes = codes;
    }
    
}
