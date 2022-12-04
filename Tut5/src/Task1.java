import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(s1.equals(s2));

        int c = s1.compareTo(s2);

        if(c>0) {
            System.out.println("S1 is greater");
        }
        else if(c<0) {
            System.out.println("S2 is greater");
        }
        if(c==0) {
            System.out.println("Both are equals");
        }
    }
}
