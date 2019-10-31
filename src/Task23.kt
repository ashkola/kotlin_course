fun main(args: Array<String>) {
    var car1 = Car("LADA","blue","A123CT190")
    var car2 = Car("MAZDA", "red", "A777AA77")
    var car3 = car1.copy(model = "UAZ",number = "Y321CC61")
    println(car1.toString())
    println(car2.toString())
    println(car3.toString())
    println(car1.equals(car3))
}

data class Car(val model: String, val color: String, val number: String)
