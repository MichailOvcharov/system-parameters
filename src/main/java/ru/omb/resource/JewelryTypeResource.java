package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.entity.JewelryType;
import ru.omb.service.JewelryTypeService;

import java.util.List;

@RestController
@RequestMapping("/jewelrytype")
public class JewelryTypeResource {
    private final JewelryTypeService jewelryTypeService;

    @Autowired
    public JewelryTypeResource(JewelryTypeService jewelryTypeService) {
        this.jewelryTypeService = jewelryTypeService;
    }

    @GetMapping
    public List<JewelryType> findAll() {
        return  jewelryTypeService.findAll();
    }
}
