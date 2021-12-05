package rs.week2.practicum3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) throws IllegalArgumentException{
        if (rad <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }else{
            radius=rad;
            xPositie=x;
            yPositie=y;
        }
    }

    public String toString(){
        return "Cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}
