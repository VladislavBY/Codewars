package by.popkov.kotlin

fun findScreenHeight(width: Int, ratio: String): String {
    val split = ratio.split(":")
    val height: Int = (width / split[0].toDouble() * split[1].toDouble()).toInt()
    return String.format("%dx%d", width, height)
}