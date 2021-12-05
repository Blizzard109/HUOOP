package rs.week1.practicum2a;

public class Zwembad {
    private double _breedte;
    private double _lengte;
    private double _diepte;

    public Zwembad(double breedte, double lengte, double diepte){
        _breedte = breedte;
        _lengte = lengte;
        _diepte = diepte;
    }

    public Zwembad(){

    }

    public void setBreedte(double _breedte) {
        this._breedte = _breedte;
    }

    public void setLengte(double _lengte) {
        this._lengte = _lengte;
    }

    public void setDiepte(double _diepte) {
        this._diepte = _diepte;
    }

    public double getBreedte(){
        return _breedte;
    }

    public double getLengte(){
        return _lengte;
    }

    public double getDiepte(){
        return _diepte;
    }

    public double inhoud(){
        return _lengte * _breedte * _diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + _breedte + " meter breed, " + _lengte + " meter lang, en " + _diepte + " meter diep.";
    }

    public static void main(String[] arg) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getBreedte());
        System.out.println("LENGTE: " + z1.getLengte());
        System.out.println("DIEPTE: " + z1.getDiepte());
        System.out.println("BEREKENDE INHOUD: " + z1.inhoud());
        System.out.println();

        Zwembad z2 = new Zwembad( );
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.inhoud());
    }
}
