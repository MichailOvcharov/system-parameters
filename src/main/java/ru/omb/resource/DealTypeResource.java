package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.entity.DealType;
import ru.omb.service.DealTypeService;

import java.util.List;

@RestController
@RequestMapping("/dealtype")
public class DealTypeResource {
    private final DealTypeService dealTypeService;

    @Autowired
    public DealTypeResource(DealTypeService dealTypeService) {
        this.dealTypeService = dealTypeService;
    }

    @GetMapping
    public List<DealType> findAll() {
        return  dealTypeService.findAll();
    }
}
