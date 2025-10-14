fun main(){
    val emailsRecibidos = 25
    val emailsEnviados = 15
    val emailsEliminados = 3

    val totalEmails = emailsRecibidos + emailsEnviados
    val diferencia = emailsEliminados - emailsEnviados
    val dobleEmails = emailsRecibidos * 2
    val promedio = totalEmails / 2
    val residuo = emailsRecibidos % 7 // 25 - 21 = 4

    println("Total : $totalEmails, Promedio: $promedio, Residuo: $residuo")

    val calculo = 10 + 5 * 2
    println(calculo)

    val calculoAlt = (10 + 5) * 2
    println(calculoAlt)

    val emailsPorSemana = emailsRecibidos * 7 + emailsEnviados * 7
    println(emailsPorSemana)

    var contador = 10
    println(contador)
    contador = contador + 1
    println(contador)
    contador += 1
    println(contador)
    contador -= 2
    println(contador)
    contador /= 2
    println(contador)
    contador %= 2
    println(contador)

    println("\n=== EJERCICIO ===")
    println("Calcula: Calcula el incremento en porcentaje de emails enviados ayer vs los enviados hoy.")

    println("\n=== SOLUCIÓN ===")
    var emailsAyer = 5
    var emailsHoy = 10
    var incremento = emailsHoy - emailsAyer

    val porcentajeIncremento = (incremento.toFloat() / emailsAyer) * 100
    println(porcentajeIncremento)
}