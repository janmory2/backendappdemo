package com.example.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name ="email")
    private String email;

    @Column(name ="dicklenght")
    private Integer dicklenght;

    public User(String name, String email, Integer dicklenght) {
        this.name = name;
        this.email = email;
        this.dicklenght = dicklenght;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setDicklenght(Integer dicklenght) {
        this.dicklenght = dicklenght;
    }
    public Integer getDicklenght() {
        return dicklenght;
    }

}

