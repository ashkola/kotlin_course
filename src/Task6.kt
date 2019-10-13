fun main(args: Array<String>) {
    println("Input a:")
    var a = readLine()?.toInt()?:0
    println("Input b:")
    var b = readLine()?.toInt()?:0
    var res = a > b
    if (res) {
        println("a more than b")
    } else {
        println("a less than b")
    }
}