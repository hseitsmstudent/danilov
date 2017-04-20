package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class person
{
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
}
