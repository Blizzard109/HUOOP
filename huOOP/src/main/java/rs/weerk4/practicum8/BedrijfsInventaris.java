package rs.weerk4.practicum8;

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
        }
    }

    @Override
    public String toString() {
        return "BedrijfsInventaris{" +
                "bedrijfsNaam='" + bedrijfsNaam + '\'' +
                ", budget=" + budget +
                ", alleGoederen=" + alleGoederen +
                '}';
    }
}
