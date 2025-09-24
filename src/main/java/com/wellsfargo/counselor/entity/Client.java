package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    @JoinColumn(name = "financialAdvisorId", nullable = false)
    private FinancialAdvisor advisor;

    @Column(nullable = false)
    private String name;

    protected Client() {}

    public Client(FinancialAdvisor advisor, String name) {
        this.advisor = advisor;
        this.name = name;
    }

    public Long getClientId() {
        return clientId;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
