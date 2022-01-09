package rs.week4.practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    @Override
    public double huidigeWaarden() {
        double prijs = nieuwprijs;
        prijs *= Math.pow(0.7, LocalDate.now().getYear()- bouwjaar);
        if(prijs < 0){
            return 0;
        }else {
            return prijs;
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Auto){
            Auto ov = (Auto) o;
            if (ov.kenteken == this.kenteken && super.equals(o)){
                return true;
            }
        }
        return false;
    }
}
