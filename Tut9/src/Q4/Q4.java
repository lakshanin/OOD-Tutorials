package Q4;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index");
        int index = sc.nextInt();

        try {
            System.out.println(array[index]);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
