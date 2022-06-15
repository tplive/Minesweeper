fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    val initial = 20000
    var final = initial - (old * 2000) // Adjust for age
    final -= (120 - maximumSpeed) * 100 // Adjust for max speed
    final -= kilometers / 10000 * 200 // Adjust for ran kilometers
    final += if (automatic) 1500 else 0 // Adjust for automatic transmission

    println(final)
}
