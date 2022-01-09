package rs.week4.practicum7;

public class HoofdletterProces implements OpmaakProces{

    public HoofdletterProces(){}

    @Override
    public String maakOp(String input) {
        String s = input.toUpperCase();
        return s;
    }
}
