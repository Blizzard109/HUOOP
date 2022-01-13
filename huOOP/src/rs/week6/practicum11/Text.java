package rs.week6.practicum11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Text {
    public ArrayList<String> getTextArray(String TextSourceName) throws IOException{
        Path sourcePath = Path.of(TextSourceName);
        ArrayList<String> stringsFromSource = new ArrayList<String>();

        if (Files.exists(sourcePath) && Files.isRegularFile(sourcePath)){
            for (String row : Files.readAllLines(sourcePath)){
                stringsFromSource.add(row);
                System.out.println(row);
            }
            return stringsFromSource;
        }
        return null;
    }

    public ArrayList<String> StringSeperation(ArrayList<String> strings){
        ArrayList<String> products = new ArrayList<String>();

        for (String row: strings){
            String[] rowContains = row.split(":");
            products.add(rowContains[0]);
        }
        return products;
    }

    public ArrayList<Double> PriceSeperation(ArrayList<String> strings){
        ArrayList<Double> prices = new ArrayList<Double>();

        for (String row: strings){
            String[] rowContains = row.split(":");
            prices.add(Double.parseDouble(rowContains[1]));
        }
        return prices;
    }

}
