package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.Contractor;
import ru.omb.repository.ContractorRepository;

import java.util.List;

@Service
public class ContractorService {
    private final ContractorRepository contractorRepository;

    @Autowired
    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }

    public Contractor fingById(Long id) {
        return contractorRepository.findById(id).get();
    }

    public List<Contractor> findAll() {
        return contractorRepository.findAll();
    }
}
