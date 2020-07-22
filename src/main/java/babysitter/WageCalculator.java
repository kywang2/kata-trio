package babysitter;

//Babysitter
//
//Today's gig economy is disrupting industries around the world. This kata pays homage to one of the original gig jobs. The goal is to write a method that calculates the pay for a babysitter's shift.
//
//The Rules:
//
//The babysitter
//
//starts no earlier than 5:00PM.
//leaves no later than 4:00AM.
//gets paid $12/hour from the start of their shift to the children's bedtime.
//gets paid $8/hour from bedtime to midnight.
//gets paid $16/hour from midnight to the end of their shift.
//will start their shift on the hour and end their shift on the hour.
//The bedtime
//
//will be between 8:00PM and 11:00PM.
//can be before the start of the babysitter's shift.
//can be after the end of the babysitter's shift.
//The Feature:
//
//As a babysitter,
//
//In order to get paid for 1 night of work,
//
//I want to calculate my nightly wage.
//Create a method that takes the babysitter's start time, end time, and the children's bedtime and returns the amount that the babysitter is owed for that shift. You should use military/24 hour format for the start/end times.
//
//Variations:
//
//Create a minimum wage rule and ensure that the babysitter does not receive pay that falls below the minimum wage for the entire shift. For example a minimum wage of $9:
//With one hour pre-bedtime and four hours pre midnight/post bedtime hours would pay $45.
//With one hour pre-bedtime and one hour pre midnight/post bedtime hours would remain $20.
//Allow partial hour pay and take start/end times as String arguments.
//In real life just pay the sitter a flat rate. They're taking care of your kids, they deserve it.
public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        return 0;
    }
}
