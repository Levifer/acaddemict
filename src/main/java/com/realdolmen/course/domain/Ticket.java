package com.realdolmen.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by BPTAT47 on 9/09/2014.
 */
@Entity
public class Ticket {

    @Id @GeneratedValue
    private Long id;

    private BigDecimal price;

    private Date dateOfDeparture;

    private  String destination;


    public Ticket() {
    }

    public Ticket(BigDecimal price, Date dateOfDepearture, String destination) {
        this.price = price;
        this.dateOfDeparture = dateOfDepearture;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDateOfDeparture(Date dateOfDepearture) {
        this.dateOfDeparture = dateOfDepearture;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
