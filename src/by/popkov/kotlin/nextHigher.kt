package by.popkov.kotlin

fun nextHigher(n: Int): Int {
    var num = n
    val count = num.toString(2).count { o: Char -> o == '1' }
    while (true) {
        num += 1
        if (count == num.toString(2).count { o: Char -> o == '1' }) {
            return num
        }
    }
}

fun main() {
    println(nextHigher(323423))
}