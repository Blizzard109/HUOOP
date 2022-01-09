package rs.week4.practicum8;

import rs.week5.practicum9a.Utils;

import java.text.DecimalFormat;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    private String pattern = "0.00";
    private DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Voertuig){
            Voertuig ov = (Voertuig) o;
            if (ov.bouwjaar == this.bouwjaar && ov.type == this.type && ov.nieuwprijs == this.nieuwprijs){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarden van: " + Utils.euroBedrag(huidigeWaarden(),1);
    }
}
