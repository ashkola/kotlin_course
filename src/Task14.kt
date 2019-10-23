fun main(args: Array<String>) {
    val name = "Shkola Andrey"
    val age = 34
    val position = "QA"
    val maritalStatus = "married"
    consoleWriter(name, position)
    consoleWriter(name, age, position)
    consoleWriter(name, maritalStatus, position)
    consoleWriter(name, age, maritalStatus, position)

}

fun consoleWriter(fullName:String, position: String) = println("$fullName, $position")
fun consoleWriter(fullName:String, age: Int, position: String) = println("$fullName, $age, $position")
fun consoleWriter(fullName: String, maritalStatus: String, position: String) = println("$fullName, $maritalStatus, $position")
fun consoleWriter(fullName: String, age: Int, maritalStatus: String, position: String) = println("$fullName - $age - $maritalStatus - $position")