package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long financialAdvisorId;

    @OneToOne
    @JoinColumn(name = "user_guid", nullable = false)
    private UserDatabase user;

    @Column(nullable = false)
    private String name;

    protected FinancialAdvisor() {}

    public FinancialAdvisor(UserDatabase user, String name) {
        this.user = user;
        this.name = name;
    }

    public Long getFinancialAdvisorId() {
        return financialAdvisorId;
    }

    public UserDatabase getUser() {
        return user;
    }

    public void setUser(UserDatabase user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
