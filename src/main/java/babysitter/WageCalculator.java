package babysitter;

//Variations:
//Create a minimum wage rule and ensure that the babysitter does not receive pay that
// falls below the minimum wage for the entire shift. For example a minimum wage of $9:
//With one hour pre-bedtime and four hours pre midnight/post bedtime hours would pay $45.
//With one hour pre-bedtime and one hour pre midnight/post bedtime hours would remain $20.
//Allow partial hour pay and take start/end times as String arguments.
//In real life just pay the sitter a flat rate. They're taking care of your kids, they deserve it.
public class WageCalculator {

    private int startTime;
    private int endTime;
    private int bedTime;
    private int paymentAmount;
    private int paymentAmount2;
    private int paymentAmount3;
    private int totalPaymentAmount;

    public int calculateShiftWage(int startTime, int endTime, int bedTime) {

        if (startTime >= 17) {
            startTime -= 17;
        } else if (startTime <= 3) {
            startTime += 7;
        }
        if (bedTime >= 20 && bedTime <= 23) {
            bedTime -= 17;
        }
        if (endTime >= 18) {
            endTime -= 17;
        } else if (endTime <= 4) {
            endTime += 7;
        }
        paymentAmount = (12 * (bedTime - startTime));
        paymentAmount2 = (8 * (7 - bedTime));
        paymentAmount3 = (16 * (endTime - 7));
        totalPaymentAmount = paymentAmount + paymentAmount2 + paymentAmount3;
        return totalPaymentAmount;
    }
}