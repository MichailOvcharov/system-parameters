package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.ValType;
import ru.omb.repository.ValTypeRepository;

import java.util.List;

@Service
public class ValTypeService {
    private final ValTypeRepository valTypeRepository;

    @Autowired
    public ValTypeService(ValTypeRepository valTypeRepository) {
        this.valTypeRepository = valTypeRepository;
    }

    public List<ValType> findAll() {
        return valTypeRepository.findAll();
    }
}
