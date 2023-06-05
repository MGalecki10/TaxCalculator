package pl.MGalecki;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculator {

    static BigDecimal sumNettoPrice(List<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(item.getNettoPrice());
        }
        return sum;
    }

    static BigDecimal sumTaxPrice(List<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(item.getTax());
        }
        return sum;
    }

    static BigDecimal sumBruttoPrice(List<Item> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(item.getBruttoPrice());
        }
        return sum;
    }
}

