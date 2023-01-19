import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner muscles= new Scanner(System.in);
        Scanner goal = new Scanner (System.in);

        System.out.println("Please Write Bellow Your Muscle Group of Choice.");

        System.out.print("Muscle Group: ");
        String Muscles = muscles.nextLine();
        System.out.println();

        System.out.println("Now Please Select and Write Your Exercise Goal (Strength, Cardio, Athletic)");

        System.out.print("Goal: ");
        String Goal = goal.nextLine();

        //This is the Muscles selection
        //if ()

        //This is the Goal Selection
       switch(Goal){
           case "Strength": SetsReps.strength(); break;
           case "strength": SetsReps.strength(); break;
           case "Cardio": SetsReps.cardio(); break;
           case "cardio": SetsReps.cardio(); break;
           case "Athletic": SetsReps.athletic(); break;
           case "athletic": SetsReps.athletic(); break;



       }

    }
}
