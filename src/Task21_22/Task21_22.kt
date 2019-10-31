package Task21_22

fun main(args: Array<String>) {
    var boing = Boing747 (526, "SU1245", 3000, 130)
    boing.consolePrint()
}

abstract class Aircraft constructor (protected var id : String, protected var maxdistance: Int, protected var capacity: Int){
    protected val consumption
        get() = capacity.toFloat() * 100 / maxdistance

    open fun consolePrint() {
        println("Aircraft number ${this.id}, with fuel consumption ${this.consumption} liters per 100 km")
    }
}

interface Passenger{
    val passengerCapacity:Int
}

class Boing747 : Aircraft, Passenger {
    override val passengerCapacity: Int

    constructor(passengerCap: Int, id: String, maxdistance: Int, capacity: Int) : super(id, maxdistance, capacity) {
        passengerCapacity = passengerCap
    }

    override fun consolePrint() {
        println("Aircraft number ${this.id}, with fuel consumption ${this.consumption} liters per 100 km, with ${this.passengerCapacity} passengers seats")
    }

}


