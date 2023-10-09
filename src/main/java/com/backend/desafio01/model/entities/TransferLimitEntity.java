package com.backend.desafio01.model.entities;

import com.backend.desafio01.model.constants.DayWeekEnum;
import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "transfer_limit")
public class TransferLimitEntity {
    @Id
    private int id;

    @OneToOne
    @JoinColumn(name="user", referencedColumnName = "id")
    private UserEntity user;

    private Time time;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="day_week")
    private DayWeekEnum dayWeek;

    private double value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public DayWeekEnum getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(DayWeekEnum dayWeek) {
        this.dayWeek = dayWeek;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
