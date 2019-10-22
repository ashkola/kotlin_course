fun main(args: Array<String>) {
    println("Введите год")
    var num = readLine()?.toInt()?:0
    println(isLeap(num).toString())
}

fun isLeap(year: Int): Boolean {
    return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
}