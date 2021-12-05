package rs.week2.practicum4b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {
    private AutoHuur ah1 = new AutoHuur();
    private Klant k = new Klant("Mijnheer Test");
    private Auto a = new Auto("Opel", 15);

    @Test
    public void geenHuurder(){
        ah1.setGehuurdeAuto(a);
        assertNull(ah1.getHuurder());
    }

    @Test
    public void geenAuto(){
        k.setKorting(12.2);
        ah1.setHuurder(k);
        assertNull(ah1.getGehuurdeAuto());
    }

    @Test
    public void totaalPrijsReturnWhenNull(){
        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    public void totaalPrijsReturnsNullWithHuuredGeenAutoVisaVersa(){
        ah1.setGehuurdeAuto(a);
        assertEquals(0.0, ah1.totaalPrijs());
        ah1.setGehuurdeAuto(null);
        ah1.setHuurder(k);
        assertEquals(0.0, ah1.totaalPrijs());
    }
}