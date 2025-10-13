// Constantes
const val RUTA_IMAGEN = "imagen/imagen.jpg"
const val NOMBRE_EMPRESA = "Codigo Facilito"
// RUTA_IMAGEN = "photo/imagen.jpg" // no se puede modificar una constante

fun main(args: Array<String>){
    // Variables
    var edad: Int = 28
    println("Ingresa tu nombre: ")
    var nombre = readLine()
    
    // println(nombre)
    // println(edad)
    print("Eres ")
    print(nombre)
    print(" y tienes ")
    print(edad)
    println(" años")
    println("Hasta luego!")

    // Constantes
    println(RUTA_IMAGEN)
    println(NOMBRE_EMPRESA)
}