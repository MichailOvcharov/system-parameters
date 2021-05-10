package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.JewelryType;
import ru.omb.repository.JewelryTypeRepository;

import java.util.List;

@Service
public class JewelryTypeService {

    private final JewelryTypeRepository jewelryTypeRepository;

    @Autowired
    public JewelryTypeService(JewelryTypeRepository jewelryTypeRepository) {
        this.jewelryTypeRepository = jewelryTypeRepository;
    }

    public List<JewelryType> findAll() {
        return jewelryTypeRepository.findAll();
    }
}
