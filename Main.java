import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String mHistory[] = new String[6];
        String gHistory[] = new String[6];

        for(int k = 0; k <= 1; k++){

            Scanner muscles = new Scanner(System.in);
            System.out.println("Please Write Bellow Your Muscle Group of Choice.");
            System.out.print("Muscle Group: ");
            String Muscles = muscles.nextLine();
            System.out.println();
            //mHistory[k] = Muscles;

            Scanner goal = new Scanner(System.in);
            System.out.println("Now Please Select and Write Your Exercise Goal (Strength, Cardio, Athletic)");
            System.out.print("Goal: ");
            String Goal = goal.nextLine();
            //gHistory[k] = Goal;


            MusclesGoals.Muscles(Muscles);
            MusclesGoals.Goals(Goal);

            mHistory[k] = Muscles;
            gHistory[k] = Goal;

        }
        System.out.println("Good Job this week! Take a look back on what you did this week and relax.");
        for(int k = 0; k <= 1; k++) {
            int day = k + 1;
            System.out.println("Day " + day + ": " + mHistory[k] + " with the goal of " + gHistory[k]);
        }
        System.out.println("See You Next Week!");
    }


}
