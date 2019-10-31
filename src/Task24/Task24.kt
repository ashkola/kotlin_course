package Task24

fun main(args: Array<String>) {
    var companyAircrafts: List<Aircraft> = listOf(Boing747(524 , "SU1245", 14205, 241140),
            Boing747(524  , "SU1246", 14205, 241140),
            Boing747(581  , "SU1247", 14815, 242470),
            LockheedC5("LC5", 10411, 150819, 118387),
            Airbus330(219, "U750", 7400, 139090))
    while (true) {
        println("Выберите действие:\n1) Вывести размер парка самолетов\n2) Вывести детальную информацию о самолете")
        var res = readLine()?.toInt()?:0
        when (res) {
            1 -> println(companyAircrafts.size)
            2 -> {
                println("введите номер")
                var idx = readLine()?.toInt()?:0
                try {
                    companyAircrafts[idx+1].consolePrint()
                } catch (ex: ArrayIndexOutOfBoundsException) {
                    println("номер самолета должен быть от 1 до ${companyAircrafts.size}")
                }
            }
        }
    }
}

abstract class Aircraft constructor(protected var id: String, protected var maxdistance: Int, protected var fuelCapacity: Int) {
    protected val consumption
        get() = fuelCapacity.toFloat() * 100 / maxdistance

    open fun consolePrint() {
        println("Aircraft number ${this.id}, with fuel consumption ${this.consumption} liters per 100 km")
    }
}

interface Carrying {
    val carrying: Int
}

interface Passenger {
    val passengerCapacity: Int
}

open class Boing747 : Aircraft, Passenger {
    override val passengerCapacity: Int

    constructor(passengerCap: Int, id: String, maxdistance: Int, fuelCapacity: Int) : super(id, maxdistance, fuelCapacity) {
        passengerCapacity = passengerCap
    }

    override fun consolePrint() {
        println("Aircraft number ${this.id}, with fuel consumption ${this.consumption} liters per 100 km, with ${this.passengerCapacity} passengers seats")
    }
}

class LockheedC5(id: String, maxdistance: Int, fuelCapacity: Int, override val carrying: Int) : Aircraft(id, maxdistance, fuelCapacity), Carrying {
    override fun consolePrint() {
        println("Aircraft number ${this.id}, with fuel consumption ${this.consumption} liters per 100 km, with ${this.carrying} carrying")
    }
}

class Airbus330(override val passengerCapacity: Int, id: String, maxdistance: Int, fuelCapacity: Int) : Aircraft (id, maxdistance, fuelCapacity),Passenger {
    override fun consolePrint() {
        println("Airbus number ${this.id}, with fuel consumption ${this.consumption} liters per 100 km, with ${this.passengerCapacity} passengers seats")
    }
}
