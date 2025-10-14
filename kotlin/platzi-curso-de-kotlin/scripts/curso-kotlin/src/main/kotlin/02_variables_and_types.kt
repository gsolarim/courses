fun main(){
    // Strings
    val nombreUsuario = "Gabriel"
    var nombreUsuarioAlt = "Jose"

    println(nombreUsuario)
    println(nombreUsuarioAlt)

    nombreUsuarioAlt = "Gabriel"
    println(nombreUsuarioAlt)

    // Integers
    var emailNoLeidos = 5
    emailNoLeidos = 3
    println(emailNoLeidos)

    // Interpolación
    println("Usuario: $nombreUsuario, Emails: $emailNoLeidos")

    // Tipos
    val totalEmail: Int = 150
    val totalEmailAlt: Long = 150
    val porcentaje: Float = 75.5f
    val porcentajeAlt: Double = 150.2
    val asunto: String = "Reunión"
    val esUrgente: Boolean = true

    // Conversión de Tipos
    val numero = 42
    val comoTexto = numero.toString()
    val textoNumero = "25".toInt()

    println(numero)
    println(comoTexto)
    println(textoNumero)

    val leidos = 15
    val totales = 20

    // val porcentajeEmails = leidos/totales
    val porcentajeEmails = leidos.toFloat()/totales
    println(porcentajeEmails)

    println("\n=== EJERCICIO ===")
    println("Crea: nombre (val), emails recibidos/enviados (var).")
    println("Calcula porcentaje de emails enviados.")

    println("\n=== SOLUCIÓN ===")
    val name = "Gabriel"
    var emailsRecibidos = 20.0
    var emailsEnviados = 5.0
    var pctEmailsEnviados = (emailsEnviados / (emailsRecibidos + emailsEnviados))*100

    println("Nombre: $name, Pct. Emails Recibidos: $pctEmailsEnviados%")
}