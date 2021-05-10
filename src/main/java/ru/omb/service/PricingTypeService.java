package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.PricingType;
import ru.omb.repository.PricingTypeRepository;

import java.util.List;

@Service
public class PricingTypeService {

    private final PricingTypeRepository pricingTypeRepository;

    @Autowired
    public PricingTypeService(PricingTypeRepository pricingTypeRepository) {
        this.pricingTypeRepository = pricingTypeRepository;
    }

    public List<PricingType> findAll() {
        return pricingTypeRepository.findAll();
    }
}
