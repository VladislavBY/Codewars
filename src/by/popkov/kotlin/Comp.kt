package by.popkov.kotlin

import kotlin.math.sqrt

fun comp(a: IntArray?, b: IntArray?): Boolean {
    if (a?.size != b?.size) return false
    val sqrtB = b?.map { o -> sqrt(o.toDouble()).toInt() }?.toIntArray()
    sqrtB?.sort()
    a?.sort()
    if (a != null) {
        for (i in a.indices) {
            if (a[i] != sqrtB?.get(i)) return false
        }
    }
    return true
}

fun main() {
    val a1 = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
    val a2 = intArrayOf(11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19)
    println(comp(a1, a2))
}