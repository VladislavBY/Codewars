package by.popkov.kotlin

import kotlin.streams.toList


fun twoOldestAges(ages: List<Int>): List<Int> {
    return ages.stream().sorted { o1, o2 -> o2 - o1 }.limit(2).sorted().toList()
}

fun main() {
    println(twoOldestAges(listOf(1, 5, 87, 45, 8, 8)))
}