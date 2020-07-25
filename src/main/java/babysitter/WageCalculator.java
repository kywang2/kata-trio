package babysitter;

//Variations:
//Create a minimum wage rule and ensure that the babysitter does not receive pay that
// falls below the minimum wage for the entire shift. For example a minimum wage of $9:
//With one hour pre-bedtime and four hours pre midnight/post bedtime hours would pay $45.
//With one hour pre-bedtime and one hour pre midnight/post bedtime hours would remain $20.
//Allow partial hour pay and take start/end times as String arguments.
//In real life just pay the sitter a flat rate. They're taking care of your kids, they deserve it.

//        if (startTime <= 0) {
//            return 0;
//        } else if ((startTime >= 0 || startTime <= 3)&&(endTime>=1||endTime<=3) ) {
//            return preBedtimePay;
//        } else if ((startTime >= 3 || startTime <= 7)&&(endTime>=4||endTime<=7) ) {
//            return bedtimePay;
//        } else if ((startTime >= 7 || startTime <= 11)&&(endTime>=8||endTime<=11) ) {
//            return postBedtimePay;
//
//        }
public class WageCalculator {

    private int startTime;
    private int endTime;
    private int bedTime;
    int preBedtimePay = (12 * (bedTime - startTime));
    int bedtimePay = (8 * (7 - bedTime));
    int postBedtimePay = (16 * (endTime - 7));
    int totalPay = preBedtimePay + bedtimePay + postBedtimePay;
    int totalHours;

    public int getTotalHours() {
        return totalHours;
    }

    public int calculateShiftWage(int startTime, int endTime, int bedTime) {

        if (startTime <= 17) {
            return 0;
        } else if (startTime >= 18 && startTime <= 23) {
            startTime -= 17;
        } else if (startTime <= 3 && startTime >= 0) {
            startTime += 7;
        }
        if (bedTime >= 20 && bedTime <= 23) {
            bedTime -= 17;
        }
        if (endTime >= 18 && endTime<=24) {
            endTime -= 17;
        } else if (endTime <= 4 && endTime >= 0) {
            endTime += 7;
        } else {
            return 0;
        }

        return totalHours;
}
}