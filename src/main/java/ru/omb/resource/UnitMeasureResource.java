package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.entity.UnitMeasure;
import ru.omb.service.UnitMeasureService;

import java.util.List;

@RestController
@RequestMapping("/unitMeasure")
public class UnitMeasureResource {

    public final UnitMeasureService unitMeasureService;

    @Autowired
    public UnitMeasureResource(UnitMeasureService unitMeasureService) {
        this.unitMeasureService = unitMeasureService;
    }

    @GetMapping
    public List<UnitMeasure> findAll() {
        return unitMeasureService.findAll();
    }
}
