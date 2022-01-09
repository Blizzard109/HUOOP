package rs.week3.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kc){
        klasCode = kc;
    }

    public void wijzigCijfer(String l, double i){
        for (Leerling t:deLeerlingen) {
            if(t.getNaam().equals(l)){
                t.setCijfer(i);
            }
        }
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public ArrayList<Leerling> getLeerlingen(){
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    @Override
    public String toString() {
        String s = "In klas " + klasCode + " zitten de volgende leerlingen:";
        for (Leerling l: deLeerlingen) {
            s += "\n" + l.toString();
        }
        return s;
    }
}
