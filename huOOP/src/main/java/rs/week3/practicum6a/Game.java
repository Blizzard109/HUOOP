package rs.week3.practicum6a;

import java.time.LocalDate;
import java.text.DecimalFormat;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    private String pattern = "0.00";
    private DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public Game(String nm, int rj, double nwpr){
        naam=nm;
        releaseJaar=rj;
        nieuwprijs=nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }

    public double huidigeWaarde(){
        double prijs = nieuwprijs;
        prijs *= Math.pow(0.7,LocalDate.now().getYear()- releaseJaar);
        if(prijs < 0){
            return 0;
        }else {
            return prijs;
        }
    }

    public boolean equals(Object g){
        if(g instanceof Game){
            Game og = (Game) g;
            if(og.getNaam() == this.naam && og.getReleaseJaar() == this.releaseJaar){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = ""+naam+", uitgegeven in "+releaseJaar +"; nieuwprijs: €"+decimalFormat.format(nieuwprijs)+" nu voor: €"+decimalFormat.format( huidigeWaarde())+"";
        return s;
    }
}
