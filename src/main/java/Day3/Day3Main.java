package Day3;

import java.util.List;
import java.util.Scanner;

public class Day3Main {

    private static Scanner scanner = new Scanner(System.in);
    private static String firstWireInput;
    private static String[] firstWireSteps;
    private static List<Coord> firstWireCoords;
    private static String secondWireInput;
    private static String[] secondWireSteps;
    private static List<Coord> secondWireCoords;
    private static Coord currentCoord = new Coord(0,0);

    public static void main(String[] args){
        firstWireInput = scanner.next();
        secondWireInput = scanner.next();
        convertWiresToSteps();
        convertFirstWireToCoords();
    }

    private static void convertWiresToSteps() {
        firstWireSteps = firstWireInput.split(",");
        secondWireSteps = secondWireInput.split(",");
    }

    private static void convertFirstWireToCoords() {
        for (String s :
                firstWireSteps) {
            if(s.charAt(0) == 'U'){

            }
        }
    }
}
