object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Solo números positivos son permitidos" }
        var steps = 0
        var  valorActual = start
        while (valorActual != 1) {
            valorActual = if (valorActual % 2 == 0) valorActual / 2 else valorActual * 3 + 1
            steps++
        }
        return steps
    }
}
