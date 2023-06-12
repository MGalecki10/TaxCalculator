package pl.MGalecki;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculator {

    //pierwsza wersja
//    static BigDecimal sum(List<Item> items, Function<Item, BigDecimal> extractor) {
//        BigDecimal sum = BigDecimal.ZERO;
//        for (Item item : items) {
//            sum = sum.add(extractor.apply(item));
//        }
//        return sum;
//    }

    static Stats calculateStats(List<Item> items) {
        BigDecimal nettoSum = sumNettoPrice(items);
        BigDecimal taxSum = sumTaxPrice(items);
        BigDecimal bruttoSum = sumBruttoPrice(items);
        return new Stats(nettoSum,taxSum,bruttoSum);

    }

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

