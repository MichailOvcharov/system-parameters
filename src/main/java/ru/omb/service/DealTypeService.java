package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.Currency;
import ru.omb.entity.DealType;
import ru.omb.repository.CurrencyRepository;
import ru.omb.repository.DealTypeRepository;

import java.util.List;

@Service
public class DealTypeService {
    private final DealTypeRepository dealTypeRepository;

    public DealTypeService(DealTypeRepository dealTypeRepository) {
        this.dealTypeRepository = dealTypeRepository;
    }

    @Autowired


    public List<DealType> findAll() {
        return  dealTypeRepository.findAll();
    }
}
