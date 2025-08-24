package PracticeFolder;

public class FunctionPractice {
    public static void main(String[] args) {

        taskOne();System.out.println();
        taskTwo();System.out.println();
        taskThree();System.out.println();
        taskFour();System.out.println();
        taskFive();System.out.println();
        System.out.print(taskSix()); System.out.println();
        System.out.print("Sum of first 50 natural numbers are: " + taskSeven()); System.out.println();
    }
    public static void taskOne(){
        for(char count = 'a'; count <= 'z'; count++){
            System.out.print(count + " ");
        }
    }
    public static void taskTwo(){
        for(int count = 0; count <= 100; count++){
           if(count % 2 == 1){
                System.out.print(count + " ");
           }
        }
    }
    public static void taskThree(){
        for(int count = 1; count <= 20; count++){
            System.out.println("The square of: " + count + " is " + count * count + " ");
        }
    }
    public static void taskFour(){
        for(int count = 1; count <= 50; count++){
            if(count % 3 == 0) {
                System.out.println("The multiple of 3 are: " + count);
            }
        }
    }
    public static void taskFive(){
        for(int count = 1; count <= 100; count++){
            if(count % 3 == 0 && count % 5 == 0){
                System.out.println("The numbers that are divisible by 3 & 5 are: " + count);
            }
        }
    }
    public static int taskSix(){
        int counter = 0;
        for(int count = 1; count <= 100; count++) {
            if (count % 7 == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static int taskSeven(){
        int sum = 0;
        for(int count = 1; count <= 50; count++) {
            sum+= count;
        }
        return sum;
    }
}
