object Math {

    fun abs(input: Int): Int {
        return if (input < 0) input * -1 else input
    }

    fun abs(input: Double): Double {
        return if (input < 0) input * -1 else input
    }
}