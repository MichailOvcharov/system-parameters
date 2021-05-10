import {DealType} from "./deal-type";
import {Currency} from "./currency";
import {JewelryType} from "./jewelry-type";
import {PricingType} from "./pricing-type";
import {UnitMeasure} from "./unit-measure";
import {ValType} from "./val-type";

export class Guids {
  currences: Currency[];
  dealType: DealType[];
  guids: Guids[];
  jewelry: JewelryType[];
  pricingTypes: PricingType[];
  unitMeasures: UnitMeasure[];
  valType: ValType[];


  getCurrency():Currency[]  {
    return this.currences;
  }
}
