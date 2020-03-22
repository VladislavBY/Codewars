package by.popkov.kotlin

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    var height = 0
    var day = 0
    while (true) {
        day++
        height += upSpeed
        if (height>=desiredHeight) return day
        height -= downSpeed
    }

}
fun main() {
    println(growingPlant(100,10,910))
}