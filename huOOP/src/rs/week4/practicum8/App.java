package rs.week4.practicum8;

public class App {
    public static void main(String[] arg) {
        BedrijfsInventaris b1 = new BedrijfsInventaris("HU", 300000.00);

        Goed c1 = new Computer("Asus 666", "3C-9B-AA-42", 800.00, 2015);
        Goed c2 = new Computer("Asus 666", "3C-9B-AA-42", 800.00, 2015);
        Goed c3 = new Computer("ALIENZ", "R2-D2-C3-P0", 800.00, 2020);

        Goed a1 = new Auto("Opel Masta", 16000.00, 2020, "AU-B1-92");
        Goed a2 = new Auto("Opel Masta", 16000.00, 2020, "AU-B1-92");
        Goed a3 = new Auto("Bugati", 10000000000000000.00, 2020, "F1-B9-99");

        Goed f1 = new Fiets("Oma Fiets", 1200.00, 2014, 22);
        Goed f2 = new Fiets("Oma Fiets", 1200.00, 2014, 22);
        Goed f3 = new Fiets("Opa Fiets", 420.00, 2019, 21);

        b1.schafAan(c1);
        b1.schafAan(c2);
        b1.schafAan(c3);
        b1.schafAan(a1);
        b1.schafAan(a2);
        b1.schafAan(a3);
        b1.schafAan(f1);
        b1.schafAan(f2);
        b1.schafAan(f3);

        System.out.println(b1.toString());
    }
}
