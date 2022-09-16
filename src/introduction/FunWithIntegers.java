package ca.nl.cna.java1.introduction;
import java.util.Scanner;

/**
 * How can Integers NOT be fun!
 *
 * @author josh.taylor
 */
public class FunWithIntegers {

    public static void main(String[] args) {
        System.out.println("Fun with ... INTEGERS!");


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = input.nextInt();

        System.out.println("Enter second number: ");
        int y = input.nextInt();



        System.out.printf("\nx + y: %d",x+y );
        System.out.printf("\nx - y: %d",x-y );
        System.out.printf("\nx * y: %d",x*y );
        System.out.printf("\nx // y: %d",x/y );
        System.out.printf("\nx %% y: %d",x%y );

        if (x == y){
            System.out.println("X is equal to y ");
        } else{
            System.out.println("X is not equal to Y" );
        }




    }

}
