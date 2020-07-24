package babysitter;

import java.util.Scanner;

public class BabySitterApp {


    public static void main(String[] args) {
        WageCalculator wageCalculate = new WageCalculator();

        Scanner babySitterTimeClock = new Scanner(System.in);
        System.out.println("Start time:");
        int startTime = babySitterTimeClock.nextInt();
        System.out.println("End time:");
        int endTime = babySitterTimeClock.nextInt();
        System.out.println("Bed time:");
        int bedTime = babySitterTimeClock.nextInt();

        wageCalculate.calculateShiftWage(startTime, endTime, bedTime);
    }
}
