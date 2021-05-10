package ru.omb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.omb.dto.ContractorPropertyDto;
import ru.omb.entity.ContractorProperty;
import ru.omb.repository.ContractorRepository;
import ru.omb.repository.PropertyTypeRepository;
import ru.omb.service.ContractorService;
import ru.omb.service.PropertyTypeService;

@Component
public class ContractorPropertyMapper {

    private final ContractorService contractorService;
    private final PropertyTypeService propertyTypeService;

    @Autowired
    public ContractorPropertyMapper(ContractorService contractorService, PropertyTypeService propertyTypeService) {
        this.contractorService = contractorService;
        this.propertyTypeService = propertyTypeService;
    }

    public ContractorProperty toContractorProperty(ContractorPropertyDto contractorPropertyDto) {
        return new ContractorProperty(
                contractorPropertyDto.getValue(),
                contractorPropertyDto.getBeginDate(),
                contractorPropertyDto.getEndDate(),
                propertyTypeService.findById(contractorPropertyDto.getProperty_type_id()),
                contractorService.fingById(contractorPropertyDto.getContractor_id()),
                contractorPropertyDto.getInputType(),
                contractorPropertyDto.getCreateBy(),
                contractorPropertyDto.getCreateDate(),
                contractorPropertyDto.getLastModifiedBy(),
                contractorPropertyDto.getLastModifiedByDate()
                );
    }

    public ContractorPropertyDto toContractorPropertyDto(ContractorProperty contractorProperty) {
        return new ContractorPropertyDto(
                contractorProperty.getId(),
                contractorProperty.getValue(),
                contractorProperty.getBeginDate(),
                contractorProperty.getEndDate(),
                contractorProperty.getPropertyType().getId(),
                contractorProperty.getContractor().getId(),
                contractorProperty.getInputType(),
                contractorProperty.getCreateBy(),
                contractorProperty.getCreateDate(),
                contractorProperty.getLastModifiedBy(),
                contractorProperty.getLastModifiedByDate()
        );
    }
}
