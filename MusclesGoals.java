import java.util.Scanner;

public class MusclesGoals {

    public static void Muscles(String Muscles) {

        //Scanner muscles = new Scanner(System.in);
        //System.out.println("Please Write Bellow Your Muscle Group of Choice.");
        //System.out.print("Muscle Group: ");
        //String Muscles = muscles.nextLine();
        //System.out.println();

        //This is the Muscles selection
        switch (Muscles) {
            case "Back": Workouts.back(); break;
            case "back": Workouts.back(); break;
            case "Chest": Workouts.chest(); break;
            case "chest": Workouts.chest(); break;
            case "Legs": Workouts.legs(); break;
            case "legs": Workouts.legs(); break;
            case "Arms": Workouts.arms();break;
            case "arms": Workouts.arms(); break;
            case "Shoulders": Workouts.shoulders(); break;
            case "shoulders": Workouts.shoulders(); break;
            default: System.out.print("I dont think that's a body part...");
                Scanner mistakemuscles = new Scanner(System.in);
                System.out.println("Please Write Bellow Your Actual Muscle Group of Choice.");
                System.out.print("Muscle Group: ");
                Muscles = mistakemuscles.nextLine();
                System.out.println(); break;

        }


    }
        public static void Goals(String Goal) {

            //Scanner goal = new Scanner(System.in);
            //System.out.println("Now Please Select and Write Your Exercise Goal (Strength, Cardio, Athletic)");
            //System.out.print("Goal: ");
            //String Goal = goal.nextLine();


            //This is the Goal Selection
            switch (Goal) {
                case "Strength": SetsReps.strength(); break;
                case "strength": SetsReps.strength(); break;
                case "Cardio": SetsReps.cardio(); break;
                case "cardio": SetsReps.cardio(); break;
                case "Athletic": SetsReps.athletic(); break;
                case "athletic": SetsReps.athletic(); break;
                default: System.out.print("Maybe try that again..."); MusclesGoals.MistakeGoal(); break;
            }
    }

    public static void MistakeMuscle(){




    }

    public static void MistakeGoal(){

        Scanner mistakegoal = new Scanner(System.in);
        System.out.println("Now Please Select and Write Your Actual Exercise Goal (Strength, Cardio, Athletic)");
        System.out.print("Goal: ");
        String Goal = mistakegoal.nextLine();


    }
}

