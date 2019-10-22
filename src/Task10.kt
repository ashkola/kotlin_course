fun main(args: Array<String>) {
    var cities = arrayListOf<String>()
    loop@ while (true) {
        println("Выберите действие:\n1-добавить название города\n2-просмотреть список записей городов\n3-просмотреть список городов без повторений\n4-выход")
        var action = readLine()?.toInt()
        when (action) {
            1 -> {
                println("введите название")
                var city = readLine()?:""
                cities.add(city)
            }
            2 -> for(c in cities) println(c)
            3 -> for(c in cities.toSet()) println(c)
            4 -> break@loop
        }
    }

}