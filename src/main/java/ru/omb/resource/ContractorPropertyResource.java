package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.omb.dto.ContractorPropertesDto;
import ru.omb.dto.ContractorPropertyDto;
import ru.omb.dto.GuidsDto;
import ru.omb.service.ContractorPropertyService;

import java.util.List;

@RestController
@RequestMapping("/contractorproperty")
public class ContractorPropertyResource {
    private final ContractorPropertyService contractorPropertyService;

    @Autowired
    public ContractorPropertyResource(ContractorPropertyService contractorPropertyService) {
        this.contractorPropertyService = contractorPropertyService;
    }

    @PostMapping
    public ContractorPropertyDto create(@RequestBody ContractorPropertyDto contractorPropertyDto) {
        return  contractorPropertyService.saveContractorProperty(contractorPropertyDto);
    }

    @PostMapping("/list")
    public List<ContractorPropertyDto> createContractorPropertes(@RequestBody ContractorPropertesDto contractorPropertyDtos) {
        return contractorPropertyService.saveContractorPropertyList(contractorPropertyDtos.getContractorPropertyDtos());
    }

    @GetMapping("/{id}")
    public List<ContractorPropertyDto> findSystemContractorProperties(@PathVariable("id") Long id) {
        return contractorPropertyService.findSystemContractorProperties(id);
    }

    @GetMapping("/guids")
    public GuidsDto findGuids() {
        return contractorPropertyService.findGuidsDto();
    }
}
