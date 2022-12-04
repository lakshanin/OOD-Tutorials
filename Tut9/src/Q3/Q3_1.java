package Q3;

import java.util.Scanner;

public class Q3_1 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value 1");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the value 2");
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the operator (+,-,*,/)");
            char op = sc.next().charAt(0);
            double o;
            switch (op) {
                case '+':
                    o = num1 + num2;
                    System.out.println("The final result:" + num1 + " " + op + " " + num2
                            + " = " + o);
                    break;
                case '-':
                    o = num1 - num2;
                    System.out.println("The final result:" + num1 + " " + op + " " + num2
                            + " = " + o);
                    break;
                case '*':
                    o = num1 * num2;
                    System.out.println("The final result:" + num1 + " " + op + " " + num2
                            + " = " + o);
                    break;
                case '/':
                    o = num1 / num2;
                    System.out.println("The final result:" + num1 + " " + op + " " + num2
                            + " = " + o);
                    break;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
