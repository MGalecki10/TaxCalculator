package pl.MGalecki;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    static List<Item> readItems(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Item> items = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            Item nextItem = new Item(split[0],new BigDecimal(split[1]),new BigDecimal(split[2]));
            items.add(nextItem);
        }
        return items;
    }

    static void exportData(Stats stats, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("Netto;" + stats.getNettoSum());
        writer.newLine();
        writer.write("Tax;" + stats.getTaxSum());
        writer.newLine();
        writer.write("Brutto;" + stats.getBruttoSum());
        writer.close();

    }
}
