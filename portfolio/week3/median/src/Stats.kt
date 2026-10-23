// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty())
    val sorted = numbers.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 != 0) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2.0f
    }
}

fun displayStats(numbers: List<Float>) {
    val min = numbers.min()
    val max = numbers.max()
    val mean = numbers.average()
    val med = median(numbers)

    println("Minimum: $min")
    println("Maximum: $max")
    println("Mean: $mean")
    println("Median: $med")
}