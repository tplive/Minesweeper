class Intern(val weeklyWorkload: Int) {
    val baseWorkload = 20

    class Salary {
        val basePay = 50
        val extraHoursPay = 2.8
    }

    val weeklySalary = (weeklyWorkload - baseWorkload) * Salary().extraHoursPay + Salary().basePay
}