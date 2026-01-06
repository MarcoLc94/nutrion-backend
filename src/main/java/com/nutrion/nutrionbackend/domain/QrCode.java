package com.nutrion.nutrionbackend.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "qrcode")
public class QrCode {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @ManyToOne
    @JoinColumn(name = "user.id", nullable = false)
    private User user;


    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
       this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
