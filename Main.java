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

            Scanner goal = new Scanner(System.in);
            System.out.println("Now Please Select and Write Your Exercise Goal (Strength, Conditioning, Athletic)");
            System.out.print("Goal: ");
            String Goal = goal.nextLine();

            switch (Goal) {
                case "Strength": break;
                case "strength": break;
                case "Conditioning": break;
                case "conditioning": break;
                case "Athletic": break;
                case "athletic": break;
                default:
                    System.out.print("Maybe try that again...");
                    Scanner mistakegoal = new Scanner(System.in);
                    System.out.println("Now Please Select and Write Your Actual Exercise Goal (Strength, Cardio, Athletic)");
                    System.out.print("Goal: ");
                    Goal = mistakegoal.nextLine();
                    break;
            }
            gHistory[k] = Goal;

            switch (Muscles) {
                case "Back": Workouts.back(Goal);break;
                case "back": Workouts.back(Goal);break;
                case "Chest": Workouts.chest(Goal);break;
                case "chest": Workouts.chest(Goal);break;
                case "Legs": Workouts.legs(Goal);break;
                case "legs": Workouts.legs(Goal);break;
                case "Arms": Workouts.arms(Goal);break;
                case "arms": Workouts.arms(Goal);break;
                case "Shoulders": Workouts.shoulders(Goal);break;
                case "shoulders": Workouts.shoulders(Goal);break;
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

        }
        System.out.println("Good Job this week! Take a look back on what you did this week and relax.");
        for (int k = 0; k <= 5; k++) {
            int day = k + 1;
            System.out.println("Day " + day + ": " + mHistory[k] + " with the goal of " + gHistory[k]);
        }
        System.out.println("See You Next Week!");
    }
}
