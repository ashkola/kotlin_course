fun main(args: Array<String>) {
    println("Введите имена через запятую")
    var names = readLine()!!.split(",")
    print(counter(*names.toTypedArray()))
}

fun counter(vararg name:String): Int {
    var count = 0
    for(i in name) count++
    return count
}