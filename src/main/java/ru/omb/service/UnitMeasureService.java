package ru.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omb.entity.UnitMeasure;
import ru.omb.repository.UnitMeasureRepositiory;

import java.util.List;

@Service
public class UnitMeasureService {

    private final UnitMeasureRepositiory unitMeasureRepositiory;

    @Autowired
    public UnitMeasureService(UnitMeasureRepositiory unitMeasureRepositiory) {
        this.unitMeasureRepositiory = unitMeasureRepositiory;
    }

    public List<UnitMeasure> findAll() {
        return  unitMeasureRepositiory.findAll();
    }
}
