package Q3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
            case '+':
                o = num1 + num2;
                System.out.println("The final result:"+num1 + " " + op + " " + num2
                        + " = " + o);
                break;
            case '-':
                o = num1 - num2;
                System.out.println("The final result:"+num1 + " " + op + " " + num2
                        + " = " + o);
                break;
            case '*':
                o = num1 * num2;
                System.out.println("The final result:"+num1 + " " + op + " " + num2
                        + " = " + o);
                break;
            case '/':
                o = num1 / num2;
                System.out.println("The final result:"+num1 + " " + op + " " + num2
                        + " = " + o);
                break;
            default:
                System.out.println("You enter wrong operand");
                break;
        }
    }
}
