import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String mHistory[] = new String[6];
        String gHistory[] = new String[6];

        for (int k = 0; k <= 5; k++) {

            Scanner muscles = new Scanner(System.in);
            System.out.println("Please Write Bellow Your Muscle Group of Choice.");
            System.out.print("Muscle Group: ");
            String Muscles = muscles.nextLine();
            switch (Muscles) {
                case "Back": Workouts.back();break;
                case "back": Workouts.back();break;
                case "Chest": Workouts.chest();break;
                case "chest": Workouts.chest();break;
                case "Legs": Workouts.legs();break;
                case "legs": Workouts.legs();break;
                case "Arms": Workouts.arms();break;
                case "arms": Workouts.arms();break;
                case "Shoulders": Workouts.shoulders();break;
                case "shoulders": Workouts.shoulders();break;
                default:
                    System.out.print("I dont think that's a body part...");
                    Scanner mistakemuscles = new Scanner(System.in);
                    System.out.println("Please Write Bellow Your Actual Muscle Group of Choice.");
                    System.out.print("Muscle Group: ");
                    Muscles = mistakemuscles.nextLine();
                    System.out.println();
                    break;
            }
            System.out.println();
            mHistory[k] = Muscles;

            Scanner goal = new Scanner(System.in);
            System.out.println("Now Please Select and Write Your Exercise Goal (Strength, Conditioning, Athletic)");
            System.out.print("Goal: ");
            String Goal = goal.nextLine();
            switch (Goal) {
                case "Strength": SetsReps.strength();break;
                case "strength": SetsReps.strength();break;
                case "Conditioning": SetsReps.cardio();break;
                case "conditioning": SetsReps.cardio();break;
                case "Athletic": SetsReps.athletic();break;
                case "athletic": SetsReps.athletic();break;
                default:
                    System.out.print("Maybe try that again...");
                    Scanner mistakegoal = new Scanner(System.in);
                    System.out.println("Now Please Select and Write Your Actual Exercise Goal (Strength, Cardio, Athletic)");
                    System.out.print("Goal: ");
                    Goal = mistakegoal.nextLine();
                    break;
            }
            gHistory[k] = Goal;
        }
        System.out.println("Good Job this week! Take a look back on what you did this week and relax.");
        for (int k = 0; k <= 5; k++) {
            int day = k + 1;
            System.out.println("Day " + day + ": " + mHistory[k] + " with the goal of " + gHistory[k]);
        }
        System.out.println("See You Next Week!");
    }
}
