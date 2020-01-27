public class LockerProblem {
    public static void main(String[] args)
    {
        int lockers = 100;
        String[] lockerProblem = new String[lockers];

        for (int i = 0; i < lockerProblem.length; i++) {
          lockerProblem[i] = "Locked";
        }
        System.out.println("Show the locked ones");

        for(int i = 0; i < lockerProblem.length; i++){
            System.out.println("Room " + i + " " + lockerProblem[i] + " ");
        }
        for (int i = 0; i < lockerProblem.length; i++){
            lockerProblem[i] = "Open";
        }
        System.out.println("Show the opened ones");
        for(int i = 0; i < lockerProblem.length; i++){
            System.out.println("Room " + i + " " + lockerProblem[i] + " ");
        }

        for (int i = 2; i < lockerProblem.length; i++) {
            for(int j = i; j < lockerProblem.length; j += i){
                lockerProblem[j] = lockerProblem[j] == "Open" ? "Locked" : "Open";
            }
        }
    }
}
