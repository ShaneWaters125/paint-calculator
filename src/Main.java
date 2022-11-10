import java.util.Scanner;

public class Main {

    static final double METERS_PER_LITRE = 6.5; //1l of paint for 6.5m^2 of wall or ceiling

    //0.2 litres per square meter might be better

    public static void main(String[] args) {
        Main runApp = new Main();
        runApp.start();
    }

    private void start(){
        Scanner reading = new Scanner(System.in);
        System.out.println("How many walls are there in the room?");
        int numWalls = reading.nextInt();
        int totalArea = 0;
        double height, width;

        for(int i=0; i<numWalls; i++){
            System.out.println("Height of wall " + (i+1) + "(m):");
            height = reading.nextDouble();
            System.out.println("Width of wall " + (i+1) + "(m):");
            width = reading.nextDouble();
            totalArea += height*width;
        }

        System.out.println("Width of ceiling (m):");
        width = reading.nextDouble();
        System.out.println("Length of ceiling (m):");
        height = reading.nextDouble();
        totalArea += width*height;

        System.out.println("Number of coats of paint:");
        totalArea *= reading.nextInt();
        System.out.println(totalArea/METERS_PER_LITRE + " Litres of paint required");

    }

}
