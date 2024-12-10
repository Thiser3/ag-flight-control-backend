package com.fonseca.airport_db.domain.Enterprise;

import jakarta.persistence.*;
import lombok.*;

@Table(name="enterprises")
@Entity(name= "enterprise")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "enterpriseID")
public class Enterprise
{
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private int enterpriseID;
    private String name;
}
