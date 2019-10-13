fun main(args: Array<String>) {
//    println("Hello Kotlin")

    var any:Any? = null
    any = 1
    var res = any/2.5 //переменная res типа double
    println("${res::class.java}")

}