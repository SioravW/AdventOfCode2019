package Day1;

import java.util.Scanner;

public class Day1Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static int totalFuel = 0;

    public static void main(String[] args){
        while (scanner.hasNext()){
            getFuelNeeded(scanner.nextInt());
        }
    }

    private static void getFuelNeeded(int mass){
        int fuelneeded = (int) (Math.floor((double) mass / 3) - 2);
        totalFuel += fuelneeded;
        getFuelForFuel(fuelneeded);
    }

    private static void getFuelForFuel(int mass){
        int fuelneeded = (int) (Math.floor((double) mass / 3) - 2);
        if(fuelneeded > 0){
            totalFuel += fuelneeded;
            getFuelForFuel(fuelneeded);
        }
        System.out.println(totalFuel);
    }
}
