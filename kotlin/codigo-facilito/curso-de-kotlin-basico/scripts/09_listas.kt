fun main(args: Array<String>){
    // Lista Mutable
    // Agregar un valor, modificarlo, eliminarlo, consultarlo.
    val profesores = mutableListOf<String>("Jose", "Daniela", "Yoseline", "Marina")
    // Agregar elemento
    profesores.add("David")
    profesores.add(0, "Cesar")
    println(profesores)
    // Eliminar elemento
    profesores.remove("Marina")
    profesores.removeAt(3)
    println(profesores)
    // Modificar elemento
    profesores.set(1, "Gabriel")
    // profesores[1] = "Gabriel"
    println(profesores)
    // profesores.fill("Aracelly")
    // println(profesores)
    // Tamaño de lista
    println(profesores.size)
    // Ordenamientos
    profesores.reverse()
    println(profesores)
    val ascendente = profesores.sorted()
    println(ascendente)
    val descendente = profesores.sortedDescending()
    println(descendente)

    val calificaciones = mutableListOf<Int>(1,3,5,6,10,9,8)
    val ordenaCalificaciones = calificaciones.sortedDescending()
    println(ordenaCalificaciones)

    val filtrado = ordenaCalificaciones.filter{ x-> x > 5}
    println(filtrado)
}