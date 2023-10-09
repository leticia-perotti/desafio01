package com.backend.desafio01.model.entities;

import com.backend.desafio01.model.constants.ChangeTypeEnum;
import jakarta.persistence.*;

import java.beans.ConstructorProperties;
import java.sql.Timestamp;

@Entity
@Table(name = "movement_historic")
public class MovementHistoricEntity {
    @Id
    private String id;

    @Column(name = "payer_user")
    @OneToOne
    @JoinColumn(name="payer_user", referencedColumnName = "id")
    private UserEntity payerUser;

    @Column(name = "receiver_user")
    @OneToOne
    @JoinColumn(name = "receiver_user", referencedColumnName = "id")
    private UserEntity receiverUser;

    private double value;

    @Column(name = "original_date")
    private Timestamp originalDate;

    @Column(name = "change_date")
    private Timestamp changeDate;

    @Column(name = "change_type")
    @Enumerated(EnumType.STRING)
    private ChangeTypeEnum changeType;

    private String justification;

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

    public Timestamp getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(Timestamp originalDate) {
        this.originalDate = originalDate;
    }

    public Timestamp getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Timestamp changeDate) {
        this.changeDate = changeDate;
    }

    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }
}
