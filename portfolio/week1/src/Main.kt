// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val a = (args[0]).toFloat()
    val b = (args[1]).toFloat()
    val c = (args[2]).toFloat()

    var semiPerimeter: Float = (0.5f * (a + b + c))

    var area: Float = sqrt(semiPerimeter * (semiPerimeter
            - a) * (semiPerimeter - b) * (semiPerimeter - c))
    val areaString: String = "%.5f".format(area)

    println("Area = $areaString")

}