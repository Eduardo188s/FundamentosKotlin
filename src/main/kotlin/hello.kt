fun main(){
    println("Hello World!")

    // Variables
    // val para declarar constantes (solo lecturas)
    // var para variables
    val pi = 3.14
    var x = 34

    println(pi)
    x = 24
    x = x + 1
    x++
    x--
    x += 10
    x -= 2
    x *= 2
    x /= 5
    println(x)

    val firstName = "Eduardo"
    val lastName: String = "Sanchez"
    val fullName = firstName + "" + lastName
    println(fullName)


    val age: Int = 19
    val height: Double = 1.76

    var stars = 10

    // String Templates
    // $ para imprimir variables
    // ${} para procesar antes de imprimir

    println("I'm $age years old")
    println("I'm $height de altura")
    println("Obtendre ${ stars + 10 } estrellas")

}