package Task2;

import java.lang.reflect.Array;

public class Q1 {
    public static void main(String args[])
    {

        String input = "aaaabbccAAdd";
                   // Character to search is 'a'.

        int count=0;
        String [] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","w",
        "u","v","x","y","z"};



            for (int j = 0; j < input.length(); j++) {

                for(int i=0; i<=26;i++) {
                    if (input.charAt(j) == a[i]) {
                        count++;
                        System.out.println("The Character '" + a[i] + "' appears " + count + " times.");
                    }
            }

        }


    }
}

