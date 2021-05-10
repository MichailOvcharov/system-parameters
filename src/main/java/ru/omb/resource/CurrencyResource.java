package ru.omb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.omb.entity.Currency;
import ru.omb.service.CurrencyService;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyResource {

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyResource(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public List<Currency> findAll() {
        return currencyService.findAll();
    }
}
