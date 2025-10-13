fun main(args: Array<String>){
    var saludo: String = "Hola mundo"
    var precio: Double =  2000.50
    var edad: Int = 20
    var esMayor: Boolean = true
    var sexo: Char = 'M'

    var precioC: Double =  "2000.50".toDouble()
    var edadC: Int = "20".toInt()

    // Ejercicio
    println("Ingresa un número: ")
    var numero1: Int = readLine()!!.toInt()
    
    println("Ingresa otro número: ")
    var numero2: Int = readLine()!!.toInt()

    println("La suma de los dos números es:")
    var suma = numero1 + numero2

    println(suma)
}