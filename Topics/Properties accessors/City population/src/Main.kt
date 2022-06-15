const val MIN_VALUE = 1
const val MAX_VALUE = 49_999_999

data class City(val name: String) {

    var population: Int = 0
        set(value) {
            field = value.coerceIn(MIN_VALUE..MAX_VALUE)
        }
}