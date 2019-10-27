fun main(args: Array<String>) {
    var plane1 = Aircraft2("ID123", 20000, 170)
    var plane2 = Aircraft2("SU1245",3000,130)
    println("Aircraft number: ${plane1.id}, with fuel consumption: ${plane1.consumption} liters per 100 km")
    println("Aircraft number: ${plane2.id}, with fuel consumption: ${plane2.consumption} liters per 100 km")
}

class Aircraft2 constructor (var id : String, var maxdistance: Int, var capacity: Int){
    val consumption
    get() = capacity.toFloat() * 100 / maxdistance
}