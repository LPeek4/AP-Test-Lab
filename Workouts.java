public class Workouts {

    public static void Work() {
        String Workouts[] = new String[45];
        {
            //back
            Workouts[0] = "Row Machine x10 min";
            Workouts[1] = "Pullups 3x12";
            Workouts[2] = "Rope Slams 3x1 min";

            Workouts[3] = "Lat Pulldown 4x8";
            Workouts[4] = "Barbell Row 4x8";
            Workouts[5] = "Single Arm Pulldown 3x12 E.A.";

            Workouts[6] = "Deadlift 5x5";
            Workouts[7] = "Single Arm Balanced Row 4x12";
            Workouts[8] = "Rope Slams 4x1 min";

            //chest
            Workouts[9] = "Rope Slams 4x1 min";
            Workouts[10] = "Pushups 4x max";
            Workouts[11] = "Rope Slams 4x1 min";

            Workouts[12] = "Bench Press 4x8";
            Workouts[13] = "Cable Flys 4x12";
            Workouts[14] = "Pushups 4x max";

            Workouts[15] = "Pushups 4x max";
            Workouts[16] = "Rope Slams 4x1 min";
            Workouts[17] = "Single Arm Dumbbell Press";

            //Legs
            Workouts[18] = "Jump Rope 4x2 min";
            Workouts[19] = "Running";
            Workouts[20] = "Biking";

            Workouts[21] = "Squat 4x8";
            Workouts[22] = "Quad Extension 4x12";
            Workouts[23] = "Hamstring Curl 4x12";

            Workouts[24] = "Hex-bar Deadlift 5x5";
            Workouts[25] = "Box Jumps 5x6";
            Workouts[26] = "Split Squat 5x8 E.L.";

            //Arms
            Workouts[27] = "Rope Slams 4x1 min";
            Workouts[28] = "Med Ball Slams 4x1 min";
            Workouts[29] = "Pushups 4x max";

            Workouts[30] = "Bicep Curls 4x12";
            Workouts[31] = "Tricep Pushdowns 4x12";
            Workouts[32] = "Reverse Curls 4x12";

            Workouts[33] = "Rope Slams 4x1 min";
            Workouts[34] = "Med Ball Slams 4x1 min";
            Workouts[35] = "Pushups 4x max";

            //Shoulders
            Workouts[36] = "Rope Slams 4x1 min";
            Workouts[37] = "Pushups 4x max";
            Workouts[38] = "Med Ball Slams 4x1 min";

            Workouts[39] = "Shoulder Press 4x8";
            Workouts[40] = "Lateral Raise 4x12";
            Workouts[41] = "Face Pulls 4x12";

            Workouts[42] = "Rope Slams 4x1 min";
            Workouts[43] = "Pushups 4x max";
            Workouts[44] = "Single Arm Press 4x8";
        }
    }

    public static void back(String Goal){
        System.out.println("Way to get Back to it!");

        switch(Goal){
            case "conditioning": for(int k = 0; k <= 2; k++){ System.out.print(Workouts[k] + " ");} break;
            case "strength": for(int k = 3; k <= 5; k++){ System.out.print(Workouts[k] + " ");} break;
            case "athletic": for(int k = 6; k <= 8; k++){ System.out.print(Workouts[k] + " ");} break;
        }
        System.out.println();

    }

    public static void chest(String Goal){
        System.out.println("Best day is chest day!");

        switch(Goal){
            case "conditioning": for(int k = 9; k <= 11; k++){ System.out.print(Workouts[k] + " ");} break;
            case "strength": for(int k = 12; k <= 14; k++){ System.out.print(Workouts[k] + " ");} break;
            case "athletic": for(int k = 15; k <= 17; k++){ System.out.print(Workouts[k] + " ");} break;
        }

    }

    public static void legs(String Goal){
        System.out.println("Finally!");

        switch(Goal){
            case "conditioning": for(int k = 18; k <= 20; k++){ System.out.print(Workouts[k] + " ");} break;
            case "strength": for(int k = 21; k <= 23; k++){ System.out.print(Workouts[k] + " ");} break;
            case "athletic": for(int k = 24; k <= 26; k++){ System.out.print(Workouts[k] + " ");} break;
        }

    }

    public static void arms(String Goal){
        System.out.println("Maybe legs next time?");

        switch(Goal){
            case "conditioning": for(int k = 27; k <= 29; k++){ System.out.print(Workouts[k] + " ");} break;
            case "strength": for(int k = 30; k <= 32; k++){ System.out.print(Workouts[k] + " ");} break;
            case "athletic": for(int k = 33; k <= 35; k++){ System.out.print(Workouts[k] + " ");} break;
        }

    }

    public static void shoulders(String Goal){
        System.out.println("Go get those boulder shoulders!");

        switch(Goal){
            case "conditioning": for(int k = 36; k <= 38; k++){ System.out.print(Workouts[k] + " ");} break;
            case "strength": for(int k = 40; k <= 42; k++){ System.out.print(Workouts[k] + " ");} break;
            case "athletic": for(int k = 43; k <= 45; k++){ System.out.print(Workouts[k] + " ");} break;
        }
    }
}