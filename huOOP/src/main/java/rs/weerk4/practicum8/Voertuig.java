package rs.weerk4.practicum8;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Voertuig){
            Voertuig ov = (Voertuig) o;
            if (ov.bouwjaar == this.bouwjaar && ov.type == this.type && ov.nieuwprijs == this.nieuwprijs){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "type='" + type + '\'' +
                ", nieuwprijs=" + nieuwprijs +
                ", bouwjaar=" + bouwjaar +
                '}';
    }
}
