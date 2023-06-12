package pl.MGalecki;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
//        List<Item> items = List.of(
//                new Item("Telewizor", new BigDecimal("100"), new BigDecimal("23")),
//                new Item("Praliny", new BigDecimal("40"), new BigDecimal("8")),
//                new Item("Thinking in Java", new BigDecimal("120"), new BigDecimal("5"))
//        );

        try {
            List<Item> items = FileUtils.readItems("items.csv");
            Stats stats = PriceCalculator.calculateStats(items);
            System.out.println("Sprzedaż Netto: " + stats.getNettoSum() + "zł");
            System.out.println("Suma podatku VAT ze sprzedaży: " + stats.getTaxSum() + "zł");
            System.out.println("Sprzedaż brutto: " + stats.getBruttoSum() + "zł");
            FileUtils.exportData(stats, "stats.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        } catch (IOException e) {
            System.out.println("Nie udało się wyeksportować danych");
        }
    }
}