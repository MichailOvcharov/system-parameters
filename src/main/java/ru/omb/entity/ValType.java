package ru.omb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table( name = "val_type", schema = "public")
public class ValType {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;

    public ValType() {
    }
}
