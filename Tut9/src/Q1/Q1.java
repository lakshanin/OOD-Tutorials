package Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
