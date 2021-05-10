package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.dto.LongDTO;
import ru.omb.entity.Contractor;
import ru.omb.service.ContractorService;

import java.util.List;

@RestController
@RequestMapping("/contractor")
public class ContractroResource {
    private final ContractorService contractorService;

    @Autowired
    public ContractroResource(ContractorService contractorService) {
        this.contractorService = contractorService;
    }

    @GetMapping
    public Contractor findOne(@RequestBody LongDTO id) {
        return contractorService.fingById(id.getId());
    }

    @GetMapping("/all")
    public List<Contractor> findAll() {
        return contractorService.findAll();
    }
}
