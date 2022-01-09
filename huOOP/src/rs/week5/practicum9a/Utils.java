package rs.week5.practicum9a;

public class Utils {
    public static String euroBedrag(double bedrag) {
        return getDecimal(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        return getDecimal(bedrag, precisie);
    }

    public static String getDecimal(double bedrag, int precisie){
        return  String.format("%." + precisie+ "f", bedrag);
    }
}
