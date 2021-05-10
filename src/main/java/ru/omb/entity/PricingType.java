package ru.omb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table( name = "pricing_type", schema = "public")
public class PricingType {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;

    public PricingType() {
    }
}
