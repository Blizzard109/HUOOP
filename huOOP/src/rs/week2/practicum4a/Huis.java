package rs.week2.practicum4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        adres=adr;
        bouwjaar=bwjr;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar +  " \n" +
                "en heeft huisbaas " + huisbaas;
    }
}
