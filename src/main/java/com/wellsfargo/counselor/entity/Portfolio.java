package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private LocalDate creationDate;

    @OneToOne
    @JoinColumn(name = "clientId", nullable=false)
    private Client client;

    protected Portfolio(){

    }
    public Portfolio(LocalDate creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
