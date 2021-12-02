package rs.week2.practicum4b;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){}

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs(){
        if(huurder != null && gehuurdeAuto != null){
            return huurder.getKorting() * gehuurdeAuto.getPrijsPerDag();
        }else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        String str = "";

        if(gehuurdeAuto == null){
            str = str + "er is geen auto bekend\n";
        }else{
            str = str + "autotype: " + gehuurdeAuto + "\n";
        }

        if(huurder == null){
            str = str + "er is geen huurder bekend\n";
        }else{
            str = str + "op naam van: " + huurder + "\n";
        }

        str = str + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();

        return str;
    }
}
