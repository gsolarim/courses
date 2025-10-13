fun main(args: Array<String>){
    val alumno1 = "Gabriel"
    val alumno2 = "Aracelly"
    val alumno3 = "Paloma"
    val alumno4 = "Sandra"

    // Mutable
    val alumnos = arrayOf<String>("Gabriel", "Araacelly", "Paloma", "Sandra")
    println(alumnos[0])
    alumnos[1] = "Aracelly"
    println(alumnos[1])

    // Inmutable
    val frutas = listOf("Manzana", "Platano", "Papaya")
    println(frutas[1])
    // frutas[1] = "Mango" // error
}