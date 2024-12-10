package com.fonseca.airport_db.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Enterprise
{

    private int enterpriseID;
    private String name;

}
