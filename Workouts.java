public class Workouts {
    static String Workout[] = new String[45];
    public static void Work(){

            //back
            Workout[0] = "Row Machine x10 min";
            Workout[1] = "Pullups 3x12";
            Workout[2] = "Rope Slams 3x1 min";

            Workout[3] = "Lat Pulldown 4x8";
            Workout[4] = "Barbell Row 4x8";
            Workout[5] = "Single Arm Pulldown 3x12 E.A.";

            Workout[6] = "Deadlift 5x5";
            Workout[7] = "Single Arm Balanced Row 4x12";
            Workout[8] = "Rope Slams 4x1 min";

            //chest
            Workout[9] = "Rope Slams 4x1 min";
            Workout[10] = "Pushups 4x max";
            Workout[11] = "Rope Slams 4x1 min";

            Workout[12] = "Bench Press 4x8";
            Workout[13] = "Cable Flys 4x12";
            Workout[14] = "Pushups 4x max";

            Workout[15] = "Pushups 4x max";
            Workout[16] = "Rope Slams 4x1 min";
            Workout[17] = "Single Arm Dumbbell Press";

            //Legs
            Workout[18] = "Jump Rope 4x2 min";
            Workout[19] = "Running";
            Workout[20] = "Biking";

            Workout[21] = "Squat 4x8";
            Workout[22] = "Quad Extension 4x12";
            Workout[23] = "Hamstring Curl 4x12";

            Workout[24] = "Hex-bar Deadlift 5x5";
            Workout[25] = "Box Jumps 5x6";
            Workout[26] = "Split Squat 5x8 E.L.";

            //Arms
            Workout[27] = "Rope Slams 4x1 min";
            Workout[28] = "Med Ball Slams 4x1 min";
            Workout[29] = "Pushups 4x max";

            Workout[30] = "Bicep Curls 4x12";
            Workout[31] = "Tricep Pushdowns 4x12";
            Workout[32] = "Reverse Curls 4x12";

            Workout[33] = "Rope Slams 4x1 min";
            Workout[34] = "Med Ball Slams 4x1 min";
            Workout[35] = "Pushups 4x max";

            //Shoulders
            Workout[36] = "Rope Slams 4x1 min";
            Workout[37] = "Pushups 4x max";
            Workout[38] = "Med Ball Slams 4x1 min";

            Workout[39] = "Shoulder Press 4x8";
            Workout[40] = "Lateral Raise 4x12";
            Workout[41] = "Face Pulls 4x12";

            Workout[42] = "Rope Slams 4x1 min";
            Workout[43] = "Pushups 4x max";
            Workout[44] = "Single Arm Press 4x8";
        }


        public static void back (String Goal){
            System.out.println("Way to get Back to it!");

            switch (Goal) {
                case "conditioning":
                    for (int k = 0; k <= 2; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "strength":
                    for (int k = 3; k <= 5; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "athletic":
                    for (int k = 6; k <= 8; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
            }
            System.out.println();
        }

        public static void chest (String Goal){
            System.out.println("Best day is chest day!");

            switch (Goal) {
                case "conditioning":
                    for (int k = 9; k <= 11; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "strength":
                    for (int k = 12; k <= 14; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "athletic":
                    for (int k = 15; k <= 17; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
            }
            System.out.println();
        }

        public static void legs (String Goal){
            System.out.println("Finally!");

            switch (Goal) {
                case "conditioning":
                    for (int k = 18; k <= 20; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "strength":
                    for (int k = 21; k <= 23; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "athletic":
                    for (int k = 24; k <= 26; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
            }
            System.out.println();
        }

        public static void arms (String Goal){
            System.out.println("Maybe legs next time?");

            switch (Goal) {
                case "conditioning":
                    for (int k = 27; k <= 29; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "strength":
                    for (int k = 30; k <= 32; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "athletic":
                    for (int k = 33; k <= 35; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
            }
            System.out.println();
        }

        public static void shoulders (String Goal){
            System.out.println("Go get those boulder shoulders!");

            switch (Goal) {
                case "conditioning":
                    for (int k = 36; k <= 38; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "strength":
                    for (int k = 40; k <= 42; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
                case "athletic":
                    for (int k = 43; k <= 45; k++) {System.out.print(Workout[k] + " ");}
                    System.out.println();
                    break;
            }
            System.out.println();
        }
    }