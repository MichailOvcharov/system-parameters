package ru.omb.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ContractorPropertesDto implements Serializable {
    List<ContractorPropertyDto> contractorPropertyDtos;
}
