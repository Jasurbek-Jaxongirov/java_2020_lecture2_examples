import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        double x = 1;
//        final double PI = 3.1415;
//        final double SOME_NUMBER = x * 41;
//
//        System.out.println(12e-10);
//

//        System.out.println("Enter a double value?");
//        double d = input.nextDouble();
//        System.out.println("You entered: " + d);
//
//        System.out.println("Enter an integer value?");
//        int i = input.nextInt();
//        System.out.println("You entered: " + i);

//        System.out.printf("You entered %.2f\n", 0.33333F);
//        System.out.printf("Some integer %d\n", 2147483648L);
//        System.out.println("5/2=" + (5 / 2)); //2
//        System.out.println("5/2.0=" + (5 / 2.0)); //2.5
//        System.out.println((2 + 1000) % 7);

//        System.out.println("Enter a temperature in Farenheit?");
//        double f = input.nextDouble();
//        System.out.printf("Celsius: %.2f\n", TemperatureConverter.convertToCelsius(f));

//        System.out.println(CurrentTime.getUTCTime());
//          System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
//          System.out.println(1.0 - 0.6);
//        int i = 1;
//        System.out.println(++i + i); //4
//        i = 1;
//        System.out.println(i++ + i); //3
//
//        int x = 5;
//        double y = 2;
//        double z = x / y; //2
//
//        System.out.println(2147483647 + 1);
//        System.out.println(1.0 - (0.1 + 0.1 + 0.1 + 0.1 + 0.1));
//
//        ArithmeticGame.start();
//
//        x=4;
//        System.out.println((x % 2 == 0) ^ (x % 3 == 0)); //true


//        System.out.println("Enter a year?");
//        int year = input.nextInt();
//        System.out.printf("Is Leap year: %s\n", LeapYearChecker.check(year));

//        int a=1,b=2,c=3;
//
//        System.out.println(a=b+=c=5);

//        GuessNumberGame.start();

//        AverageCalculator.start();

//        System.out.println(EstimatePI.estimate(1000000));

//        LocalDateTime d = LocalDateTime.now();
//        System.out.println(d.getYear());

        PrimeFinder.find(50);

    }
}
