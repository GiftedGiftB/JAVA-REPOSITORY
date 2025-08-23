package PracticeFolder.calculatorPack;

public class Calculator {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multipply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static boolean evenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }


}
