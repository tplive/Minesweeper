enum class Moni(val moni: String) {
    EURO("Euro"),
    CFA_FRANC("CFA Franc"),
    EC_DOLLAR("East Caribbean Dollar"),
    AUS_DOLLAR("Australian Dollar"),
    REAL("Brazilian Real"),
    CAN_DOLLAR("Canadian Dollar"),
    NULL("");

    companion object {
        fun findMoniByName(value: String): Moni {
            return valueOf(value)
        }
    }

}

enum class Country(val country: String, val currency: Moni) {
    GERMANY("Germany", Moni.EURO),
    MALI("Mali", Moni.CFA_FRANC),
    DOMINICA("Dominica", Moni.EC_DOLLAR),
    CANADA("Canada", Moni.CAN_DOLLAR),
    SPAIN("Spain", Moni.EURO),
    AUSTRALIA("Australia", Moni.AUS_DOLLAR),
    BRAZIL("Brazil", Moni.REAL),
    SENEGAL("Senegal", Moni.CFA_FRANC),
    FRANCE("France", Moni.EURO),
    GRENADA("Grenada", Moni.EC_DOLLAR),
    KIRIBATI("Kiribati", Moni.AUS_DOLLAR);

    companion object {
        fun findCurrency(countryName: String): Moni {

            for (enum in values()) {
                if (countryName == enum.country) return enum.currency
            }
            return Moni.NULL
        }
    }
}

fun main() {

    val (input1, input2) = readln()!!.split(" ")
    println(Country.findCurrency(input1) == Country.findCurrency(input2))
}