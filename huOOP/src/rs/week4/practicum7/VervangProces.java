package rs.week4.practicum7;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;

    public VervangProces(String od, String nw){
        oud = od;
        nieuw = nw;
    }

    @Override
    public String maakOp(String input) {
        String s = input.replace(oud, nieuw);
        return s;
    }
}
