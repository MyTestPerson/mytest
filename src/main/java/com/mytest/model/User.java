package com.mytest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "email", nullable = false, unique = true, length = 45)
    private String email;

    @Column(name = "password", nullable = false, length = 65)
    private String password;

    @Column(name = "enabled", nullable = false, length = 1)
    private Boolean enabled;

    @Column(name = "account_non_expired", nullable = false, length = 1)
    private Boolean account_non_expired;

    @Column(name = "credentials_non_expired", nullable = false, length = 1)
    private Boolean credentials_non_expired;

    @Column(name = "account_non_locked", nullable = false, length = 1)
    private Boolean account_non_locked;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAccount_non_expired() {
        return account_non_expired;
    }

    public void setAccount_non_expired(Boolean account_non_expired) {
        this.account_non_expired = account_non_expired;
    }

    public Boolean getCredentials_non_expired() {
        return credentials_non_expired;
    }

    public void setCredentials_non_expired(Boolean credentials_non_expired) {
        this.credentials_non_expired = credentials_non_expired;
    }

    public Boolean getAccount_non_locked() {
        return account_non_locked;
    }

    public void setAccount_non_locked(Boolean account_non_locked) {
        this.account_non_locked = account_non_locked;
    }
}
