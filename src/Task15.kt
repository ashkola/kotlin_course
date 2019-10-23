fun main(args: Array<String>) {
    val writer = {list: Array<String> -> for(el in list) println(el)}
    writer(args)
}
