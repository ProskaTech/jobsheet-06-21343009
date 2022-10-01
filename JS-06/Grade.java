/**
 * Created by 21343009_Mukhtarijal
 */

public class Grade {
    public static void main(String[] args){
        double grade = 20.0;

        if (grade >= 90){
            System.out.println("Excellent!");
        }
        else if ((grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
    }
        else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study Harder!");
    }
        else {
        System.out.println("Sorry, Your Failed!");
    }
    }
}