const val RUTA="imagen/imagen.jpg"

fun main(args: Array<String>){
    val nombre = "Gabriel"
    var edad = 28

    // val nombreS : String? = ""
    var apellidoS : String? = ""

    println("Ingresa el nombre: ")
    val nombreS : String? = readLine()
    println(nombreS)

    println("Ingresa el apellido: ")
    apellidoS = readLine()
    println(apellidoS)

    apellidoS = "Nadie"
    print(apellidoS)
}