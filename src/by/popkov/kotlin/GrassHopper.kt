package by.popkov.kotlin

object GrassHopper {
    fun summation(n:Int):Int {
        var sum = 0
        for (i in 0..n) sum+=i
        return sum
    }
    @JvmStatic
    fun main(args: Array<String>) {
        println(summation(2))
    }
}