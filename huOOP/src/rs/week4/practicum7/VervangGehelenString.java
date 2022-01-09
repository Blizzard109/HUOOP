package rs.week4.practicum7;

public class VervangGehelenString implements OpmaakProces {
    public VervangGehelenString(){}

    @Override
    public String maakOp(String input) {
        String s = input;
        s = s.replaceAll(s,"MOST SECRET");
        System.out.println(s);
        return s;
    }
}
