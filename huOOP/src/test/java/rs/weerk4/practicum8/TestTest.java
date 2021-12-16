package rs.weerk4.practicum8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    public void BuyCarNoMoneyDontBuy(){
        BedrijfsInventaris b1 = new BedrijfsInventaris("test", 100.00);
        Auto a1 = new Auto("Ferrari", 10000000.00, 2020, "KT");
        b1.schafAan(a1);

        assertNotEquals("Bedrijf HU heeft budget 300000.0 en bezit de volgende goederen:\n" + a1.toString(), b1.toString());
    }
}