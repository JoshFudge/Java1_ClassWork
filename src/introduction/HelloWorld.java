package ca.nl.cna.java1.introduction;

/**
 * This is a JavaDoc Comment. This can be read and displayed by JavaDoc app into real documentation.
 *
 * @author josh.taylor
 */
public class HelloWorld {

    public static void main(String[] args) {
        //Simple single line print out
        System.out.println("Hello World!");

        //Declare a car
        Car car = new Car("Ford", "Focus", "2015",102000);

        //If you want to echo variables, use printf
        System.out.printf("Car details: %s, %s, %s, %d",
                car.getMake(), car.getModel(), car.getYear(), car.getMileage());


    }

}
