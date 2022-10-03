fun main() {
    //INSTANTIATES EACH EMPLOYEE
    val person1 = Employee("Jim Robins", PositionTitle.PRODUCTION.lower, true, 27.00, 1)
    val person2 = Employee("Stacey Edwards", PositionTitle.SECRETARIAL.lower, false, 22.00, 2)
    val person3 = Employee("Derrick Lionel", PositionTitle.ADMINISTRATION.lower, false, 21.00, 3)

    // DISPLAYS THE EMPLOYEE INFO
    person1.display()
    person1.calculate(45.0)
    print("\n")
    person2.display()
    person2.calculate(50.0)
    print("\n")
    person3.display()
    person3.calculate(35.0)
}