package rs.week2.practicum4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam=nm;
        leeftijd=lft;
    }

    @Override
    public String toString() {
        return "huisbaas "+ naam + "; leeftijd " + leeftijd + " jaar";
    }
}
