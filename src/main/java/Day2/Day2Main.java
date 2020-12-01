package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2Main {

    private static Scanner scanner = new Scanner(System.in);
    private static String input = "";
    private static List<Integer> numbers = new ArrayList<>();
    private static List<Integer> currentMemory = new ArrayList<>();


    public static void main(String[] args){
        input = scanner.next();
        parseInput();
        currentMemory.addAll(numbers);
        runFirstAssignment();
        runSecondAssignment();
    }

    private static void parseInput(){
        String[] numbersInString = input.split(",");
        for (String s : numbersInString) {
            numbers.add(Integer.parseInt(s));
        }
    }

    private static void runFirstAssignment(){
        currentMemory.set(1, 12);
        currentMemory.set(2, 2);
        runProgram(0);
        System.out.println(currentMemory.get(0));
    }

    private static void runSecondAssignment(){
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++) {
                currentMemory.clear();
                currentMemory.addAll(numbers);
                currentMemory.set(1, i);
                currentMemory.set(2, j);
                runProgram(0);
                if(currentMemory.get(0) == 19690720){
                    System.out.println(100 * i + j);
                    return;
                }
            }
        }
    }

    private static void runProgram(int index){
        int opcode = currentMemory.get(index);
        int firstPosition = currentMemory.get(index+1);
        int secondPosition = currentMemory.get(index+2);
        int resultPosition = currentMemory.get(index+3);
        int firstNumber = currentMemory.get(firstPosition);
        int secondNumber = currentMemory.get(secondPosition);
        if(opcode == 99){
            System.out.println("Found opcode 99");
        }
        else if(opcode == 1){
            currentMemory.set(resultPosition, firstNumber + secondNumber);
            runProgram(index+4);
        }
        else if(opcode == 2){
            currentMemory.set(resultPosition, firstNumber * secondNumber);
            runProgram(index+4);
        }
    }
}
