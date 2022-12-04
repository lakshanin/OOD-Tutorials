package Q2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {



        try {
            int[] arr = new int[2];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value");
            int value = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the index");
            int index = Integer.parseInt(sc.nextLine());

            arr[index] = value;
        }
        catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (NumberFormatException ex){
            System.out.println("NumberFormatException");
        }

    }
}
