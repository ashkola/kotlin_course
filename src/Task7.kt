fun main(args: Array<String>) {
    var successCounter = 0
    println("a) Какая команда выводит полный путь к текущей директории?\n1)ls\n2)pwd\n3)cd\n4)top")
    var a = readLine()?.toInt()?:0
    when (a) {
        2 -> {println("Верно");successCounter++;}
        else -> println("Промазал")
    }
    println("b) Какая команда выводит список содержание директории /etc?\n1)ls\n2)pwd\n3)cd /etc\n4)ls /etc")
    var b = readLine()?.toInt()?:0
    when (b) {
        4 -> {println("Верно");successCounter++;}
        else -> println("Промазал")
    }
    println("c) Какая команда выполняет переход в домашнюю директорию?\n1)pwd home\n2)home\n3)cd home\n4)cd ~")
    var c = readLine()?.toInt()?:0
    when (c) {
        4 -> {println("Верно");successCounter++;}

        else -> println("Промазал")
    }
    println("d) С помощью каких программ можно вывести содержание файла?\n1)cat\n2)file\n3)pwd\n4)wc")
    var d = readLine()?.toInt()?:0
    when (d) {
        1 -> {println("Верно");successCounter++;}
        else -> println("Промазал")
    }
    println("e) Какая команда создает директорию test в текущей директории?\n1)mkdir /test\n2)newdir /test\n3)mkdir ./test\n4)newdir /test")
    var e = readLine()?.toInt()?:0
    when (e) {
        3 -> {println("Верно");successCounter++;}
        else -> println("Промазал")
    }
    when (successCounter) {
        in 0..2 -> println("Неуд")
        3 -> println("Трояк")
        4 -> println("Ваши знания на крепкую четверку")
        5 -> println("Отл")
    }
}