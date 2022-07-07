import java.util.*;
import java.io.*;


public class generics {
   
    public static <T> void display(T[] ary)
     {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "  ");

        }
        System.out.println();

    }

    public static void main(String[] args) {

        System.out.println("It time to run the generecis function ......");

        char[] ary_char = { 'a', 'b', 'c', 'd', 'f' };
        int[] ary_int= { 1, 2, 3, 4, 5 };
        double[] ary_dbl = { 12.3, 14.4, 15, 6, 8.97667 };

        // System.out.println("Here we called the display method for the character type");
        // display(ary_char);

        // System.out.println("Here we called the display method for the integer type");
        // display(ary_char);

        // System.out.println("Here we called the display method for the double type");
        // display(ary_dbl);

    }

}
