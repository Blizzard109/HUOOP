package rs.week3.practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String n){
        naam = n;
    }

    public String getNaam(){
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double c) {
        cijfer = c;
    }

    @Override
    public String toString() {
        String s = naam + " heeft cijfer: " + cijfer;
        return s;
    }
}
