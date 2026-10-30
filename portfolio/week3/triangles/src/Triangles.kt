// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(triangle: Triangle): Boolean {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    return a < b + c && b < a + c && c < a + b
}

fun triangleArea(triangle: Triangle): Double {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

    require(isValidTriangle(triangle)) {"Invalid Triangle."}

    var semiPerimeter = 0.5 * (a + b + c)

    var area = sqrt(semiPerimeter * (semiPerimeter
            - a) * (semiPerimeter - b) * (semiPerimeter - c))
    return area
}