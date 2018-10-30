import java.util.Scanner;

public class DegreeConverter {

    public static String fahrenheitToCelcius(double fahrenheit){
        double celcius = (fahrenheit - 32)* 5/9 ;
        return "Celcius: " + celcius;
    }

    public static String celciusToFahrenheit(double celcius){
        double fahrenheit = celcius * 9/5 + 32;
        return "Fahrenheit: " + fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celcius: ");
                    double celcius = sc.nextDouble();
                    System.out.println(celciusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}
