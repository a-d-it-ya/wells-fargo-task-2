package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable=false)
    private  String name;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable=false)
    private Advisor advisor;

    protected Client() {

    }

    public Client(String name, Advisor advisor) {
        this.name = name;
        this.advisor = advisor;
    }

    public long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    
    
}
