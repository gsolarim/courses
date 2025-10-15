fun main () {
    var emailObligatorio: String = "user@email.com"
    var emailOpcional: String? = null
    // emailObligatorio = null // no se puede asignar nulo a variable no nula
    // println(emailOpcional!!) // non-null assertion operator
    emailOpcional = "nuevocorreo@opcional.com"
    println(emailOpcional)
    println(emailOpcional!!)

    emailOpcional = null
    val longitudEmail = emailOpcional?.length ?: 0
    println("Longitud del correo: $longitudEmail")

    println("\n ===EJERCICIO===")
    println("Cra variables para: email (obligatorio), nombre (opcional).")
    println("Usa ?: para mostrar 'Anónimo' si nombre es null.")
    println("Usa ?. para obtener la longitud del nombre de forma segura.")

    println("\n ===SOLUCIÓN===")
    var email : String = "gabriel.solarim@gmail.com"
    var nombre : String? = null

    val nombreAlt = nombre ?: "Anónimo"
    val longitud = nombre?.length ?: 0
    println(nombreAlt)
    println(longitud)
    println("Email: $email - Usuario: $nombreAlt - Longitud: $longitud")
}