package de.szut.customer.database.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Customer {

    @GeneratedValue
    @Id
    private long id;

    private String firstname;

    private String lastname;

    private String company;




}
