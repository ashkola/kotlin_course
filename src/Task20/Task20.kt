package Task20

fun main(args: Array<String>) {
    var boing = Boing747 (526, "SU1245", 3000, 130)
    println("Aircraft number: ${boing.id}, with fuel consumption: ${boing.consumption} liters per 100 km, with passenger ${boing.passengerCapacity} seats")
}

open class Aircraft constructor (var id : String, var maxdistance: Int, var capacity: Int){
    val consumption
        get() = capacity.toFloat() * 100 / maxdistance
}

interface Passenger{
    val passengerCapacity:Int
}

class Boing747 : Aircraft, Passenger {
    override val passengerCapacity: Int

    constructor(passengerCap: Int, id: String, maxdistance: Int, capacity: Int) : super(id, maxdistance, capacity) {
        passengerCapacity = passengerCap
    }

}


