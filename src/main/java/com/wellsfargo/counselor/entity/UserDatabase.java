package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class UserDatabase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guid;

    @Column(nullable = false, unique = true)
    private String emailId;

    @Column(nullable = false)
    private LocalDate userCreationDate;

    @Column(nullable = false)
    private boolean isActive;

    protected UserDatabase() {}

    public UserDatabase(String emailId, LocalDate userCreationDate, boolean isActive) {
        this.emailId = emailId;
        this.userCreationDate = userCreationDate;
        this.isActive = isActive;
    }

    public Long getGuid() {
        return guid;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public LocalDate getUserCreationDate() {
        return userCreationDate;
    }

    public void setUserCreationDate(LocalDate userCreationDate) {
        this.userCreationDate = userCreationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
