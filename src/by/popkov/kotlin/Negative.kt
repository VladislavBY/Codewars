package by.popkov.kotlin

import kotlin.math.absoluteValue

class Negative {
    fun makeNegative(x: Int): Int = -x.testMy
}


public val Int.testMy: Int get() = this.absoluteValue

fun main() {
    println(Negative().makeNegative(1))

}