enum class DangerLevel(private val criticality: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int = criticality
}

