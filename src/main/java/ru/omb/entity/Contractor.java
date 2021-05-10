package ru.omb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contractor", schema = "public")
@Getter
@Setter
public class Contractor {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "isFPP")
    private Boolean isFpp;
    @OneToMany(mappedBy = "contractor", fetch = FetchType.EAGER)
    private List<ContractorProperty> contractorPropertes;

    public Contractor() {
    }
}
