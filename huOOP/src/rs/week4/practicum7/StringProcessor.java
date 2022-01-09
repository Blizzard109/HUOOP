package rs.week4.practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();

    public StringProcessor(){}

    public String verwerk(String input){
        String s = input;
        for (int i=0; i < processen.size(); i++){
            s = processen.get(i).maakOp(s);
        }
        return s;
    }

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }
}
