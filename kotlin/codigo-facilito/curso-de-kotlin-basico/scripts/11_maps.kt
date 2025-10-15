fun main(args: Array<String>){
    val datos = mapOf("Nombre" to "Gabriel", "Apellido" to "Solari")
    println(datos["Nombre"])
    println(datos["Apellido"])

    val datosM = mutableMapOf("Nombre" to "Gabriel", "Apellido" to "Solari")
    datosM.remove("Nombre")
    println(datosM)
    datosM["Nombre"] = "Gabriel"
    println(datosM)
    datosM["Edad"] = "28"
    println(datosM)

    val datosN = mutableMapOf(Pair("uno", 1), Pair("dos", 2))
    println(datosN)
    println(datosN["dos"])
}