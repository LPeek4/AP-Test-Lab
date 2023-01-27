import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String mHistory[] = new String[6];
        String gHistory[] = new String[6];

        for(int k = 0; k <= 6; k++){

            Scanner muscles = new Scanner(System.in);
            System.out.println("Please Write Bellow Your Muscle Group of Choice.");
            System.out.print("Muscle Group: ");
            String Muscles = muscles.nextLine();
            System.out.println();

            Scanner goal = new Scanner(System.in);
            System.out.println("Now Please Select and Write Your Exercise Goal (Strength, Cardio, Athletic)");
            System.out.print("Goal: ");
            String Goal = goal.nextLine();


            MusclesGoals.Muscles(Muscles);
            MusclesGoals.Goals(Goal);

            mHistory[k] = Muscles;
            gHistory[k] = Goal;

        }

        for(int k = 0; k <= 6; k++) {
            System.out.println("Good Job this week! Take a look back on what you did this week and relax. I will see you next week!");
            String Muscles = mHistory[k];
            String Goal = gHistory[k];

            MusclesGoals.Muscles(Muscles);
            MusclesGoals.Goals(Goal);
        }
    }
}
