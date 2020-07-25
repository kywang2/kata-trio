package babysitter;

//Variations:
//Create a minimum wage rule and ensure that the babysitter does not receive pay that
// falls below the minimum wage for the entire shift. For example a minimum wage of $9:
//With one hour pre-bedtime and four hours pre midnight/post bedtime hours would pay $45.
//With one hour pre-bedtime and one hour pre midnight/post bedtime hours would remain $20.
//Allow partial hour pay and take start/end times as String arguments.
//In real life just pay the sitter a flat rate. They're taking care of your kids, they deserve it.

//
public class WageCalculator {

    private int startTime;
    private int endTime;
    private int bedTime;
    private int preBedtimeHours = 0;
    private int bedtimeHours = 0;
    private int postBedtimeHours = 0;
    private int preBedtimePay;
    private int bedtimePay;
    private int postBedtimePay;
    private int totalPay;

    public int calculateShiftWage(int startTime, int endTime, int bedTime) {
        if (startTime >= 17 && startTime <= 24) {
            startTime -= 17;
        } else if (startTime >= 18 && startTime <= 23) {
            startTime -= 17;
        } else if (startTime <= 3 && startTime >= 0) {
            startTime += 7;
        }
        if (bedTime >= 20 && bedTime <= 23) {
            bedTime -= 17;
        }
        if (endTime >= 18 && endTime <= 24) {
            endTime -= 17;
        } else if (endTime <= 4 && endTime >= 0) {
            endTime += 7;
        }
        System.out.println("start time:" + startTime);
        System.out.println("End time:" + endTime);
        System.out.println("Bed time:" + bedTime);
        if (startTime < 0 || endTime > 11 || startTime > endTime || bedTime < 3 || bedTime > 7) {
            System.out.println("Invalid input.");
            return -1;
        } else if (startTime <= bedTime && endTime <= bedTime) {
            System.out.println("Case 1");
            preBedtimeHours = endTime - startTime;
        } else if (startTime >= 7) {
            System.out.println("case 2");
            postBedtimeHours = endTime - startTime;
        }
//        else if (startTime >= bedTime && endTime <= bedTime) {
//            System.out.println("case 3");
//            bedtimeHours = endTime - startTime;
//        }

        int preBedtimePay = 12 * preBedtimeHours;
        int bedtimePay = 8 * bedtimeHours;
        int postBedtimePay = 16 * postBedtimeHours;
        int totalPay = preBedtimePay + bedtimePay + postBedtimePay;

        return totalPay;
    }
}