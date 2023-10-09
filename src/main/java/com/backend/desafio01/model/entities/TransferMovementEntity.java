package com.backend.desafio01.model.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "transfer_movement")
public class TransferMovementEntity {
    @Id
    private String id;

    @Column(name="payer_user")
    @OneToOne
    @JoinColumn(name = "payer_user", referencedColumnName = "id")
    private UserEntity payerUser;

    @Column(name="receiver_user")
    @OneToOne
    @JoinColumn(name = "receiver_user", referencedColumnName = "id")
    private UserEntity receiverUser;

    private double value;

    @Column(name = "tranfer_date")
    private Timestamp tranferDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserEntity getPayerUser() {
        return payerUser;
    }

    public void setPayerUser(UserEntity payerUser) {
        this.payerUser = payerUser;
    }

    public UserEntity getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(UserEntity receiverUser) {
        this.receiverUser = receiverUser;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Timestamp getTranferDate() {
        return tranferDate;
    }

    public void setTranferDate(Timestamp tranferDate) {
        this.tranferDate = tranferDate;
    }
}
