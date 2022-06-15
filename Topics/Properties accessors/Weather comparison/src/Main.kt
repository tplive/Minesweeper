data class City(val name: String) {
    var degrees: Int = 0
        set(value) {

            // Set default if outside range
            if (!(value > -92 && value < 57)) {

                field = when (name) {
                    "Dubai" -> 30
                    "Moscow" -> 5
                    "Hanoi" -> 20
                    else -> value
                }
            } else field = value
        }
}

fun main() {

    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    var degrees = Int.MAX_VALUE
    var name = ""

    for (city in listOf(firstCity, secondCity, thirdCity)) {
        if (city.degrees < degrees) {
            degrees = city.degrees
            name = city.name
        } else if (city.degrees == degrees && name.isNotEmpty()) {
            name = "neither"
        }
    }

    print(name)


}