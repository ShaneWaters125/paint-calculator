import java.util.Scanner;

public class Main {

    static final double METERS_PER_LITRE = 6.5; //1l of paint for 6.5m^2 of wall or ceiling

    //0.2 litres per square meter might be better

    public static void main(String[] args) {
        Main runApp = new Main();
        runApp.start();
    }

    private void start(){
        System.out.println("Total surface area of all the walls (in m^2): ");
        Scanner reading = new Scanner(System.in);
        double totalArea = reading.nextDouble();
        System.out.println("Total surface area of the ceiling (in m^2): ");
        totalArea += reading.nextDouble();
        System.out.println("Total surface area which windows occupy on the walls and ceiling (in m^2): ");
        totalArea -= reading.nextDouble();
        System.out.println("How many coats of paint?: ");
        totalArea *= reading.nextDouble();
        System.out.println(totalArea*METERS_PER_LITRE + " Litres of paint required");
    }

}
