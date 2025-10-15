fun main(args: Array<String>){
    val numeros = setOf(3, 8, 1, 6, 10, 6, 18, 20, 3)
    println(numeros)
    println(numeros.elementAt(5))
    // Sets mutablesl
    val setA = mutableSetOf(3, 8, 1, 6, 10, 6, 18, 20, 3)
    val setB = mutableSetOf(12, 8, 1, 6, 7, 16, 34, 3)
    // Agregar
    setA.add(40)
    // Eliminar
    setB.remove(7)
    // Cruces en sets
    val intereseccion = setA.intersect(setB)
    println(intereseccion)
    val union = setA.union(setB)
    println(union)
    val sustraer = setA.subtract(setB)
    println(sustraer)
    // Tamaño en sets
    println(setA.count())
    println(setA.size)
    // Operaciones en sets
    println(setA.sum())
    println(setA.average())
}