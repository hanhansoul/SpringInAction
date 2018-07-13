package com.master.pro.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String position;
    @OneToOne(mappedBy = "parkingSpace")
    private Employee employee;

    public ParkingSpace() {
    }

    public ParkingSpace(String position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "id=" + id +
                ", position='" + position + '\'' +
                '}';
    }
}
