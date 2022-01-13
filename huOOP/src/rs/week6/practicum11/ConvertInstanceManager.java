package rs.week6.practicum11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ConvertInstanceManager {

    private String sourceName;
    private String targetFileName;
    private double euroWorth;

    public ConvertInstanceManager(String sn, String tfn, double ew){
        sourceName = sn;
        targetFileName = tfn;
        euroWorth = ew;
    }

    public void Convert() throws IOException{
        Text text = new Text();
        WorthConverter worthConverter = new WorthConverter();
        ArrayList<Double> euroPrice = new ArrayList<Double>();
        ArrayList<String> fileLines = new ArrayList<String>();

        ArrayList<String> dollarWorthArray = text.getTextArray(sourceName);
        ArrayList<String> products = text.StringSeperation(dollarWorthArray);
        ArrayList<Double> dollarPrices = text.PriceSeperation(dollarWorthArray);

        for (Double price: dollarPrices){
            euroPrice.add(worthConverter.convert(euroWorth, price));
        }

        for (int i=0; i<products.size(); i++){
            fileLines.add(products.get(i) + ": " + euroPrice.get(i).toString());
            System.out.println(fileLines.get(i));
        }


        File myFile = new File(targetFileName);
        if (myFile.createNewFile()) {
            System.out.println("File created: " + myFile.getName());
        } else {
            System.out.println("File already exists.");
        }

        Path p = Path.of(targetFileName);
        BufferedWriter out = Files.newBufferedWriter(p);

        for (String s: fileLines){
            out.write(s);
            out.newLine();
        }
        out.close();
    }
}
