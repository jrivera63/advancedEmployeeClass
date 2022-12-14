import java.text.DecimalFormat

/**
 * enum Class Employee
 * @author
 * Josiah Rivera
 * DATE 10/6/2022
 *
 * @param name this is to get the employees name
 * position this is needed to get the position, use from PostitionTitle
 * salary is a boolean that checks to see if the employee is on salary
 * payRate sets the pay rate of the employee
 * shift checks which shift they are on
 * this allows the user to put the titles in a lowercase(except first letter)
 */
class Employee constructor(var name: String,
                           var position: String,
                           var salary: Boolean,
                           var payRate: Double,
                           var shift: Int
                           ){
    fun calculate(hoursIn: Double){
        // CREATES VARIABLES TO BE USED LATER IN THE FUNCTION
        val formatDec = DecimalFormat("#,###.00")
        var multiplier = 1.0
        var payIncrease = 1.0
        var hoursOfOT = 0.0

        // CHECKS TO SEE WHICH SHIFT THEY WORK SO THEY CAN INCREASE THE PAY BY 5% OR 10%
        if (shift == 2){
            payIncrease = payRate * .05
            payRate += payIncrease
        } else if (shift == 3){
            payIncrease = payRate * .10
            payRate += payIncrease
        }

        // CHECKS TO SEE IF ON SALARY AND WORKED OVERTIME
        if (!salary && hoursIn > 40){
            hoursOfOT = (hoursIn - 40)
            multiplier = 1.5
        }

        // CREATES THE VARIABLES TO BE PRINTED AS INFORMATION
        val regHours = hoursIn - hoursOfOT
        val overtimePay = (payRate * multiplier) * hoursOfOT
        val regPay = regHours * payRate
        val weeklyPay = overtimePay + regPay
        println("Rate of pay is ${formatDec.format(payRate)}\nAmount made this week: $${formatDec.format(weeklyPay)}")

    }

    // DISPLAYS THE INFO ABOUT THE EMPLOYEE
    fun display(){
        println("$name\n$position is salary: $salary\nShift: $shift")
    }
}