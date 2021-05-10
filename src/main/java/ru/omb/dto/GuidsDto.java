package ru.omb.dto;


import lombok.Getter;
import lombok.Setter;
import ru.omb.entity.*;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class GuidsDto implements Serializable {
    private List<JewelryType> jewelryTypes;
    private List<Currency> currencies;
    private List<PricingType> pricingTypes;
    private List<DealType> dealTypes;
    private List<UnitMeasure> unitMeasures;
    private List<ValType> valTypes;
}
