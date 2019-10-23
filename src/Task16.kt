fun main(args: Array<String>) {
    val pi=Math.PI
    println(pi.sqrt())
}
fun Double.sqrt():Double {
    return kotlin.math.sqrt(this)
}