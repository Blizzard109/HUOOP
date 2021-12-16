package rs.weerk4.practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

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
        return "Computer{" +
                "type='" + type + '\'' +
                ", macAdres='" + macAdres + '\'' +
                ", aanschafPrijs=" + aanschafPrijs +
                ", productieJaar=" + productieJaar +
                '}';
    }
}
