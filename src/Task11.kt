fun main(args: Array<String>) {

    var workplace = hashMapOf(1 to "Shkola Andrey", 2 to "Layshev Timur", 3 to "Marat Nevmyanov", 4 to "Markova Yana")
    println("Введите номер рабочего места")
    var num = readLine()?.toInt()
    println(workplace[num])
}
