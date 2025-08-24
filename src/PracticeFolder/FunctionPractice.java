package PracticeFolder;

public class FunctionPractice {
    public static void main(String[] args) {

        taskOne();System.out.println();
        taskTwo();System.out.println();
        taskThree();System.out.println();
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
            System.out.print(count * count + " ");
        }
    }
}
