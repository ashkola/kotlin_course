fun main(args: Array<String>) {
    println("Введите сумму вклада")
    var depositSum = readLine()?.toInt()?:0
    println("Введите длительность вклада (количество месяцев)")
    var depositDuration = readLine()?.toInt()?:0
    println("Введите ежемесячный процент по вкладу")
    var depositRate = readLine()?.toInt()?:0
    var totalAmount = depositSum
    var delta = 0
    for (i in 1..depositDuration) {
        delta = totalAmount*depositRate/100
        totalAmount += delta
        println("Month $i, depo will increase by $delta, total sum $totalAmount")
    }
}