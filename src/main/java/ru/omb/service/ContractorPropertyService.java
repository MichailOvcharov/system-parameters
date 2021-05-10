package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.config.ContractorPropertyMapper;
import ru.omb.dto.ContractorPropertyDto;
import ru.omb.dto.GuidsDto;
import ru.omb.entity.ContractorProperty;
import ru.omb.entity.ValType;
import ru.omb.repository.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractorPropertyService {

    // private ModelMapper modelMapper;
    private final ContracorPropertyRepository contracorPropertyRepository;
    private final ContractorPropertyMapper contractorPropertyMapper;
    private final DealTypeRepository dealTypeRepository;
    private final CurrencyRepository currencyRepository;
    private final JewelryTypeRepository jewelryTypeRepository;
    private final PricingTypeRepository pricingTypeRepository;
    private final UnitMeasureRepositiory unitMeasureRepositiory;
    private final ValTypeRepository valTypeRepository;

    @Autowired
    public ContractorPropertyService(ContracorPropertyRepository contracorPropertyRepository, ContractorPropertyMapper contractorPropertyMapper, DealTypeRepository dealTypeRepository, CurrencyRepository currencyRepository, JewelryTypeRepository jewelryTypeRepository, PricingTypeRepository pricingTypeRepository, UnitMeasureRepositiory unitMeasureRepositiory, ValTypeRepository valTypeRepository) {
        this.contracorPropertyRepository = contracorPropertyRepository;
        this.contractorPropertyMapper = contractorPropertyMapper;
        this.dealTypeRepository = dealTypeRepository;
        this.currencyRepository = currencyRepository;
        this.jewelryTypeRepository = jewelryTypeRepository;
        this.pricingTypeRepository = pricingTypeRepository;
        this.unitMeasureRepositiory = unitMeasureRepositiory;
        this.valTypeRepository = valTypeRepository;
    }

    public ContractorPropertyDto saveContractorProperty(ContractorPropertyDto contractorPropertyDto) {
        ContractorProperty contractorProperty = contractorPropertyMapper.toContractorProperty(contractorPropertyDto);
        contractorProperty = contracorPropertyRepository.save(contractorProperty);
        return contractorPropertyMapper.toContractorPropertyDto(contractorProperty);
    }

    public List<ContractorPropertyDto> saveContractorPropertyList(List<ContractorPropertyDto> contractorPropertyDtos) {
        List<ContractorPropertyDto> contractorPropertyReturnDtos = new ArrayList<>();
        for(ContractorPropertyDto contractorPropertyDto: contractorPropertyDtos) {
            contractorPropertyReturnDtos.add(saveContractorProperty(contractorPropertyDto));
        }
        return contractorPropertyReturnDtos;
    }

    public List<ContractorPropertyDto> findSystemContractorProperties(Long id) {
        List<ContractorPropertyDto> contractorPropertyDtos = new ArrayList<>();
        List<ContractorProperty> contractorProperties = contracorPropertyRepository.findSystemContractProperties(id);
        for(ContractorProperty contractorProperty: contractorProperties) {
            contractorPropertyDtos.add(contractorPropertyMapper.toContractorPropertyDto(contractorProperty));
        }
        return contractorPropertyDtos;
    }

    public GuidsDto findGuidsDto() {
        GuidsDto guidsDto = new GuidsDto();
        guidsDto.setCurrencies(currencyRepository.findAll());
        guidsDto.setDealTypes(dealTypeRepository.findAll());
        guidsDto.setJewelryTypes(jewelryTypeRepository.findAll());
        guidsDto.setPricingTypes(pricingTypeRepository.findAll());
        guidsDto.setUnitMeasures(unitMeasureRepositiory.findAll());
        guidsDto.setValTypes(valTypeRepository.findAll());
        return guidsDto;
    }
}
