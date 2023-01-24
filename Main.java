import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        for(int k = 0; k <= 6; k++){

            Scanner muscles = new Scanner(System.in);
            String Muscles = muscles.nextLine();


            MusclesGoals.Muscles(Muscles);
            MusclesGoals.Goals();

        }

        System.out.println("Good Job this week! Take a look back on what you did this week and relax. I will see you next week!");
        Workouts.past();

    }
}
