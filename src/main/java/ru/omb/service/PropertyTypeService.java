package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.PropertyType;
import ru.omb.repository.PropertyTypeRepository;

@Service
public class PropertyTypeService {
    private final PropertyTypeRepository propertyTypeRepository;

    @Autowired
    public PropertyTypeService(PropertyTypeRepository propertyTypeRepository) {
        this.propertyTypeRepository = propertyTypeRepository;
    }

    public PropertyType findById(Long id) {
        return  propertyTypeRepository.findById(id).get();
    }
}
