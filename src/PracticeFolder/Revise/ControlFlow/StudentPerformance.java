package PracticeFolder.Revise.ControlFlow;

public class StudentPerformance {
    public static void main(String[] args){

        int studentScore = 100;

        if(studentScore >= 80){
            System.out.print("Excellent");
        }
        else if(studentScore >= 60){
            System.out.print("Good");
        }
        else if(studentScore >= 40){
            System.out.print("Bad");
        }
        else if(studentScore < 40){
            System.out.print("Poor");
        }
        else{
            System.out.print("Invalid");
        }
    }
}
