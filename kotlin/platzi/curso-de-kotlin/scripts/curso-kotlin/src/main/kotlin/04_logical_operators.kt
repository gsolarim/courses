fun main(){
    val emailsRecibidos = 15
    val emailsEnviados = 10
    val limiteEmails = 20

    val tieneEmails = emailsRecibidos > 16
    val excedeEnviados = emailsEnviados >= limiteEmails

    println("Tiene emails? $tieneEmails")
    println("Alcanzamos el límite de emails? $excedeEnviados")

    val sonIguales = emailsRecibidos == emailsEnviados
    println("Son iguales? : $sonIguales")

    val sonDiferentes = emailsRecibidos != emailsEnviados
    println("SonDiferentes? : $sonDiferentes")

    val email = "user@example.com"
    val password = "1234"

    val tieneArroba = email.contains("@")
    val tienePunto = email.contains(".")
    val dominioUK = email.contains(".uk")
    val esEmailValido = tieneArroba && tienePunto && dominioUK // AND

    println("Tiene arroba? : $tieneArroba")
    println("Es email valido? : $esEmailValido")

    val passwordCorto = password.length < 6
    val passwordLargo = password.length > 20
    val passwordProblematico = passwordCorto || passwordLargo // OR
    println("Es una contraseña problemática? : $passwordProblematico")

    val emailInvalido = !esEmailValido // !true -> false | !false -> true
    println("Es un email invalido? : $emailInvalido")

    println("\n ===EJERCICIO===")
    println("Valida email: debe tener: @ y ., no debe contener 'test'")
    println("Valida que no sea spam: asunto no debe tener 'GRATIS' o 'URGENTE'")

    println("\n ===SOLUCIÓN===")
    val emailAlt = "gabriel.solarim@gmail.com"
    val tieneArrobaAlt = emailAlt.contains("@")
    val tienePuntoAlt = emailAlt.contains(".com")
    val tieneTest = emailAlt.lowercase().contains("test")
    val emailValidoAlt = tieneArrobaAlt && tienePuntoAlt && !tieneTest
    println("Es un email valido? : $emailValidoAlt")
    val emailCategory = "RECIBIDOS"
    val emailAsunto = "Urgente: Ganaste entradas dobles para alentar a la Bicolor!"
    val emailValidaSpam = emailCategory.lowercase().contains("spam")
    val emailValidaAsunto = emailAsunto.lowercase().contains("gratis") || emailAsunto.lowercase().contains("urgente")
    val emailValida = !emailValidaSpam && !emailValidaAsunto
    println("Es categoría y asunto valido? : $emailValida")
}