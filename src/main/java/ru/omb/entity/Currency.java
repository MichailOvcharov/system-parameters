package ru.omb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "currency", schema = "public")
public class Currency {

    @Id
    @GeneratedValue
    Long id;
    @Column(name = "name")
    String name;

    public Currency() {
    }
}
