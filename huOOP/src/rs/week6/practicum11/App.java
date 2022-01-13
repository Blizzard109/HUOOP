package rs.week6.practicum11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please fill in the name of the file you want to use: ");
        BufferedReader sourcefileName = new BufferedReader(new InputStreamReader(System.in));
        String sourceName = sourcefileName.readLine();

        System.out.println("Please fill in the name of the output file you want to use: ");
        BufferedReader targetfileName = new BufferedReader(new InputStreamReader(System.in));
        String targetName = targetfileName.readLine();

        System.out.println("Please fill in the amount of euro-cent one dollar is worth: ");
        BufferedReader euroWorthBuffer = new BufferedReader(new InputStreamReader(System.in));
        double euroWorth = Double.parseDouble(euroWorthBuffer.readLine());

        ConvertInstanceManager convertDollar = new ConvertInstanceManager(sourceName, targetName, euroWorth);
        convertDollar.Convert();
    }
}
