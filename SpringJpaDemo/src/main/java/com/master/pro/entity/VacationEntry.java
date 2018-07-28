package com.master.pro.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

@Embeddable
public class VacationEntry {
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    @Column(name = "DAYS")
    private int daysTaken;

    public Calendar getStartDate() {
        return startDate;
    }

    public VacationEntry() {
    }

    public VacationEntry(Calendar startDate, int daysTaken) {
        this.startDate = startDate;
        this.daysTaken = daysTaken;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public int getDaysTaken() {
        return daysTaken;
    }

    public void setDaysTaken(int daysTaken) {
        this.daysTaken = daysTaken;
    }
}
