fun main(args: Array<String>){
    // Comparar cadenas equals()
    val esIgual = "CodigoFacilito".equals("codigofacilito", ignoreCase = true)
    println(esIgual)
    // Buscar y reemplazar
    val nombreCompleto = "Gabriel Solari"
    val cadenaModificada = nombreCompleto.replace("Solari", "Solari Morales")
    println(cadenaModificada)
    // Comparar expresiones regulares
    val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$")
    val esValido = emailRegex.matches("gabriel.solarim@gmail.com")
    println(esValido)
}