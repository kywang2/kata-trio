package babysitter;

import java.util.Scanner;

public class BabySitterApp {
    private static int totalHours;

    public static void main(String[] args) {
        WageCalculator wageCalculate = new WageCalculator();

        Scanner babySitterTimeClock = new Scanner(System.in);
        System.out.println("Start time:");
        int startTime = babySitterTimeClock.nextInt();
        System.out.println("End time:");
        int endTime = babySitterTimeClock.nextInt();
        System.out.println("Bed time:");
        int bedTime = babySitterTimeClock.nextInt();
        System.out.println(totalHours);
        System.out.println("Total Payment Amount is: " +wageCalculate.calculateShiftWage(startTime, endTime, bedTime));
    }
}
