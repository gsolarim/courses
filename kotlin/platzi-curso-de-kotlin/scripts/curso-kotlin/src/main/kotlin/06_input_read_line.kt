fun main(){
    println("====Sistema de EMAIL====")
    print("Ingresa tu email: ")
    val email = readLine() ?: "Sin Email"

    print("Ingresa el destinatario: ")
    val destinatario = readLine()?: "Sin destinatario"

    print("Ingresa el asunto: ")
    val asunto = readLine()?: "Sin asunto"

    println("De: $email")
    println("Para: $destinatario")
    println("Asunto: $asunto")

    print("Ingresa el mensaje: ")
    val mensajeSinLimpiar = readLine()
    val mensajeLimpio = mensajeSinLimpiar?.trim()

    println("=====================")
    println("VISTA PREVIA DE EMAIL")
    println("=====================")

    println("De: $email")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Asunto: $mensajeLimpio")
    println("=====================")
}fun main(){
    println("====Sistema de EMAIL====")
    print("Ingresa tu email: ")
    val email = readLine() ?: "Sin Email"

    print("Ingresa el destinatario: ")
    val destinatario = readLine()?: "Sin destinatario"

    print("Ingresa el asunto: ")
    val asunto = readLine()?: "Sin asunto"

    println("De: $email")
    println("Para: $destinatario")
    println("Asunto: $asunto")

    print("Ingresa el mensaje: ")
    val mensajeSinLimpiar = readLine()
    val mensajeLimpio = mensajeSinLimpiar?.trim()

    println("=====================")
    println("VISTA PREVIA DE EMAIL")
    println("=====================")

    println("De: $email")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Asunto: $mensajeLimpio")
    println("=====================")
}