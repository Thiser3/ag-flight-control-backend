package com.fonseca.airport_db.domain.enterprise;

import jakarta.persistence.*;
import lombok.*;

@Table(name="enterprises")
@Entity(name="enterprise")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "enterpriseID")
public class Enterprise
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enterpriseID;
    private String name;
}
