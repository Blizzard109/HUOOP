package rs.week4.practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

    public BedrijfsInventaris(String nm, double db){
        bedrijfsNaam = nm;
        budget = db;
    }

    public void schafAan(Goed g){
        if(g.huidigeWaarden() <= budget && !alleGoederen.contains(g)){
            alleGoederen.add(g);
            budget -= g.huidigeWaarden();
        }
    }

    @Override
    public String toString() {
        String s = "Bedrijf " + bedrijfsNaam + " heeft budget " + budget + " en bezit de volgende goederen:";
        for (Goed g: alleGoederen) {
            s += "\n" + g;
        }
        return s;
    }
}
