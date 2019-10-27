fun main(args: Array<String>) {
    var plane1 = Aircraft()
    var plane2 = Aircraft()
    plane2.id = "SU1245"
    plane2.maxdistance = 3000
    plane2.capacity = 130
    println("Aircraft number: ${plane1.id}, with fuel consumption: ${plane1.consumption} liters per 100 km")
    println("Aircraft number: ${plane2.id}, with fuel consumption: ${plane2.consumption} liters per 100 km")
}

class Aircraft {
    var id : String = "AB123"
    var maxdistance: Int = 10000
    var capacity : Int = 250
    val consumption
    get() = capacity.toFloat() * 100 / maxdistance
}