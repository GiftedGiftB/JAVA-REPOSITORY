package PracticeFolder.Revise.Loops;

public class SkipEvenNumber {
    public static void main(String[] args) {

        for(int count = 1; count <= 20; count++){
            if(count % 2 == 0){
                continue;
            }
            System.out.println(count);
        }
    }
}
