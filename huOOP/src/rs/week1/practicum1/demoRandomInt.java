package rs.week1.practicum1;

public class demoRandomInt {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){
            double f = Math.random()/Math.nextDown(1.0);
            System.out.println("random number: " + f);
        }
    }
}
