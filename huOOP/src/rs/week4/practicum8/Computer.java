package rs.week4.practicum8;

import rs.week5.practicum9a.Utils;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;
    private String pattern = "0.00";
    private DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public Computer(String tp, String adr, double pr, int jr) {
        type=tp;
        macAdres=adr;
        aanschafPrijs=pr;
        productieJaar=jr;
    }

    @Override
    public double huidigeWaarden() {
        double prijs = aanschafPrijs;
        prijs *= Math.pow(0.6, LocalDate.now().getYear()- productieJaar);
        if(prijs < 0){
            return 0;
        }else {
            return prijs;
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Computer){
            Computer ov = (Computer) o;
            if (ov.productieJaar == this.productieJaar && ov.type == this.type && ov.aanschafPrijs == this.aanschafPrijs && ov.macAdres == this.macAdres){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Computer: " + type +
                " met macAdres " + macAdres +
                " productie jaar " + productieJaar +
                " met een huidigewaarden van: " + Utils.euroBedrag(huidigeWaarden());
    }
}
