package rs.week2.practicum4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type=tp;
        prijsPerDag=prPd;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
