package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.entity.PricingType;
import ru.omb.service.PricingTypeService;

import java.util.List;

@RestController
@RequestMapping("/pricingtype")
public class PricingTypeResource {
    private final PricingTypeService pricingTypeService;

    @Autowired
    public PricingTypeResource(PricingTypeService pricingTypeService) {
        this.pricingTypeService = pricingTypeService;
    }

    @GetMapping
    public List<PricingType> findAll() {
        return  pricingTypeService.findAll();
    }
}
