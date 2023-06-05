package pl.MGalecki;

import java.math.BigDecimal;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Item> items = List.of(
                new Item("Telewizor", new BigDecimal("100"), new BigDecimal("23")),
                new Item("Praliny", new BigDecimal("40"), new BigDecimal("8")),
                new Item("Thinking in Java", new BigDecimal("120"), new BigDecimal("5"))
        );
        System.out.println("Sprzedaż Netto: " + PriceCalculator.sumNettoPrice(items) + "zł");
        System.out.println("Suma podatku VAT ze sprzedaży: " + PriceCalculator.sumTaxPrice(items) + "zł");
        System.out.println("Sprzedaż brutto: " + PriceCalculator.sumBruttoPrice(items) + "zł");
    }
}