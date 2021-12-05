package rs.week1.practicum1;

public class demoSawPattern {
    public static void main(String[] args){
        String s = "s";
        for (int i=0;i<=10;i++){
            if(s == "s"){
                s = "ss";
                System.out.println(s);
            }else if(s == "ss"){
                s = "s";
                System.out.println(s);
            }
        }
    }
}
