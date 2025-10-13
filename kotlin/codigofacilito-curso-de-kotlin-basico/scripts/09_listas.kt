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
    // Funciones en listas
    println(profesores.size)
    profesores.reverse()
    println(profesores)
}