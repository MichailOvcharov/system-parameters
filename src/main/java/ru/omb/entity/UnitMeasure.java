package ru.omb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "unit_of_measure", schema = "public")
public class UnitMeasure {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;

    public UnitMeasure() {
    }

}
