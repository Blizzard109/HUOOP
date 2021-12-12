package rs.week3.practicum6a;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    private String pattern = "0.00";
    private DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public Persoon(String nm, double bg){
        naam = nm;
        budget = bg;
    }

    private Game gameInLijst(Game game){
        for (var g: mijnGames) {
            if(g.equals(game)){
                return g;
            }
        }
        return null;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
        if(!mijnGames.contains(g) && g.huidigeWaarde() <= budget) {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper){
        if(mijnGames.contains(g)){
            if(koper.koop(g)){
                mijnGames.remove(g);
                budget += g.huidigeWaarde();
                return true;
            }
        }
        return false;
    }

    private String printArrayListItems(){
        String t = "" ;
        for (var g: mijnGames) {
            t += "\n"+g.toString();
        }
        return t ;
    }

    @Override
    public String toString() {
        String s = ""+ naam +" heeft een budget van \u20AC" + decimalFormat.format(this.budget)+" en bezit de volgende games:"+ printArrayListItems();
        return s;
    }
}
