package PracticeFolder.Revise.Loops;

public class SkipOddNumber {
    public static void main(String[] args) {

        for(int count = 1; count <= 20; count++){
            if(count % 2 == 1){
                continue;
            }
            System.out.print(count);
        }
    }
}
