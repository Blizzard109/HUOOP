package rs.week4.practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    @Override
    public double huidigeWaarden() {
        double prijs = nieuwprijs;
        prijs *= Math.pow(0.9, LocalDate.now().getYear()- bouwjaar);
        if(prijs < 0){
            return 0;
        }else {
            return prijs;
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Fiets){
            Fiets ov = (Fiets) o;
            if (ov.bouwjaar == this.bouwjaar && ov.framenummer == this.framenummer && ov.nieuwprijs == this.nieuwprijs){
                return true;
            }
        }
        return false;
    }
}
