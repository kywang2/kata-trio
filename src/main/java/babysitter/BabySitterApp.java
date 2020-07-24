package babysitter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BabySitterApp {
    public static void main(String[] args) {
        Scanner babySitterTimeClock = new Scanner(System.in);
        System.out.println("Start time:");
        int startTime = babySitterTimeClock.nextInt();
        System.out.println("End time:");
        int endTime = babySitterTimeClock.nextInt();
        System.out.println("Bed time:");
        int bedTime = babySitterTimeClock.nextInt();
    }
}
