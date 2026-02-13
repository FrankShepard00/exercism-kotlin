object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        var steps = 0
        require(start > 0) { "upsi" }
        var numero = start
        while (numero != 1) {
            if (numero % 2 == 0){
                numero /= 2
                steps++
            } else {
                numero = numero * 3 + 1
                steps++
            }
        }
        return steps
    }
}
