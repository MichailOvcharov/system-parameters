package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.entity.ValType;
import ru.omb.service.ValTypeService;

import java.util.List;

@RestController
@RequestMapping("/valtype")
public class ValTypeResource {
    private  final ValTypeService valTypeService;

    @Autowired
    public ValTypeResource(ValTypeService valTypeService) {
        this.valTypeService = valTypeService;
    }

    @GetMapping
    public List<ValType> findAll() {
        return  valTypeService.findAll();
    }
}
