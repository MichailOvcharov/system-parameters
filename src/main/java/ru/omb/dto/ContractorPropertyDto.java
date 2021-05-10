package ru.omb.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class ContractorPropertyDto implements Serializable  {
    private Long id;
    private String value;
    private Date beginDate;
    private Date endDate;
    private Long property_type_id;
    private Long contractor_id;
    private String inputType;
    private Date createBy;
    private Date createDate;
    private Date lastModifiedBy;
    private Date lastModifiedByDate;

    public ContractorPropertyDto() {
    }

    public ContractorPropertyDto(Long id, String value, Date beginDate, Date endDate, Long property_type_id, Long contractor_id, String inputType, Date createBy, Date createDate, Date lastModifiedBy, Date lastModifiedByDate) {
        this.id = id;
        this.value = value;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.property_type_id = property_type_id;
        this.contractor_id = contractor_id;
        this.inputType = inputType;
        this.createBy = createBy;
        this.createDate = createDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByDate = lastModifiedByDate;
    }

    public ContractorPropertyDto(String value, Date beginDate, Date endDate, Long property_type_id, Long contractor_id, String inputType, Date createBy, Date createDate, Date lastModifiedBy, Date lastModifiedByDate) {
        this.value = value;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.property_type_id = property_type_id;
        this.contractor_id = contractor_id;
        this.inputType = inputType;
        this.createBy = createBy;
        this.createDate = createDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByDate = lastModifiedByDate;
    }
}

