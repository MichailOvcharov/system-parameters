package ru.omb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contractor_property", schema = "public")
@Getter
@Setter
public class ContractorProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "value")
    private String value;
    @Column(name = "begin_date")
    private Date beginDate;
    @Column(name = "end_date")
    private Date endDate;
    // Связь
    // @Column(name = "property_type_id")
    // private Long propertyTypeId;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "property_type_id")
    private PropertyType propertyType;
    // Связь
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "contractor_id")
    private Contractor contractor;
    // @Column(name = "contractor_id")
    // private Long contractorId;
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

    public ContractorProperty() {
    }

    public ContractorProperty(String value, Date beginDate, Date endDate, PropertyType propertyType, Contractor contractor, String inputType, Date createBy, Date createDate, Date lastModifiedBy, Date lastModifiedByDate) {
        this.value = value;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.propertyType = propertyType;
        this.contractor = contractor;
        this.inputType = inputType;
        this.createBy = createBy;
        this.createDate = createDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByDate = lastModifiedByDate;
    }
}
