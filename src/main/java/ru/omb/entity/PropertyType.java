package ru.omb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "property_type", schema = "public")
@Getter
@Setter
public class PropertyType {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "tag")
    private String tag;
    @Column(name = "gist")
    private String gist;
    @Column(name = "required")
    private Boolean required;
    @Column(name = "pattern")
    private String pattern;
    @Column(name = "input_type")
    private String inputType;
    @Column(name = "create_by")
    private Date createBy;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "last_modified_by")
    private Date lastModifiedBy;
    @Column(name = "last_modified_by_date")
    private Date lastModifiedByDate;
    @OneToMany(mappedBy = "propertyType", fetch = FetchType.EAGER)
    private List<ContractorProperty> contractorPropertes;

    public PropertyType() {
    }
}
