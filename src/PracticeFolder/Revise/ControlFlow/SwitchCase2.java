package PracticeFolder.Revise.ControlFlow;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int light;
        System.out.print("""
                1. Red Light for stop
                2. Yellow Light for ready
                3. Green Light for Go
        """);
        System.out.print("Enter your choice: ");
        light = input.nextInt();

        switch(light){
            case 1:
                System.out.print("Stop");
                break;

            case 2:
                System.out.print("Ready");
                break;

            case 3:
                System.out.print("Go");
                break;

            default:
                System.out.print("Invalid");
        }
    }
}
