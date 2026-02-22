package starwars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StarWarsCodigosSecretos {
    Scanner scanner = new Scanner(System.in);
    boolean correcto = true;

    //Mensaje de inicio y pausa hasta pulsar intro
    public void inicio() {
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n" +
                        "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
                        "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                        "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                        "está construyendo para destruirla. (Presiona Intro para continuar)");
        scanner.nextLine();
    }

    //Nivel 1: Calcula la suma de todos los números entre el sistema y el sector.
    public void nivel1() {
        int numeroSistema = (int) (Math.random()*10) + 1;  //Del 1 al 10
        int numeroSector = (int) (Math.random()*11) + 20;  //Del 20 al 30

        System.out.println("=== NIVEL 1 ===");
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta el\n" +
                        "sistema " + numeroSistema + " en el sector " + numeroSector + ", pero el sistema de navegación está estropeado y el\n" +
                        "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                        "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
                        "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                        "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                        "¿Qué debe introducir?");

        //Suma todos los números en el rango [numeroSistema, numeroSector]
        int sumatorio = 0;
        for (int i = numeroSistema; i <= numeroSector; i++) sumatorio += i;
        
        comprobacion(sumatorio);
    }

    //Nivel 2: Calcula el producto de todos los números entre el id del agente y el de la nave.
    public void nivel2() {
        int idAgente = (int) (Math.random()*7) + 1;  //Del 1 al 7
        int idNave = (int) (Math.random()*5) + 8;    //Del 8 al 12

        System.out.println("\n=== NIVEL 2 ===");
        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                        "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                        "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                        "agente de espaciopuerto " + idAgente + " contactando con nave imperial " + idNave + ". No están destinados\n" +
                        "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh…\n" +
                        "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para\n" +
                        "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                        "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                        "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                        "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                        "¿Cuál es el código?");

        //Multiplicar todos los números en el rango [idAgente, idNave]
        int producto = 1;
        for (int i = idAgente; i <= idNave; i++) producto *= i;

        comprobacion(producto);
    }

    //Nivel 3: Calcula el factorial de la décima parte del numero de niveles.
    public void nivel3() {
        int totalNiveles = (int) (Math.random()*51) + 50;  //Del 50 al 100

        System.out.println("\n=== NIVEL 3 ===");
        System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                        "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                        "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + totalNiveles + " existentes se\n" +
                        "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                        "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                        "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                        "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n" +
                        "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
                        "¿Cual es el nivel correcto?");
        
        totalNiveles /= 10;

        comprobacion(factorial(totalNiveles));
    }

    public void nivel4() {
        int numeroAComprobar = (int) (Math.random()*91) + 10; //Del 10 al 100

        System.out.println("\n=== NIVEL 4 ===");
        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                        "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                        "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                        "verificar si el número " + numeroAComprobar + " es primo o no.\n" +
                        "Si es primo introduce un 1, si no lo es introduce un 0.");
        
        //Comprobar si el numero es primo
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(numeroAComprobar) && primo == true; i++) {
            if (numeroAComprobar % i == 0) primo = false;
        }

        //Darle valor de 1 o 0 segun si es o no primo
        int resultado = 0;
        if (primo) {resultado = 1;}
        else {resultado = 0;}

        comprobacion(resultado);
    }

    //Nivel 5: Calcula la suma de los factoriales de los minutos y los segundos.
    public void nivel5() {
        int minutos = (int) (Math.random()*6) + 5;  //Del 5 al 10
        int segundos = (int) (Math.random()*6) + 5;  //Del 5 al 10

        System.out.println("\n=== NIVEL 5 ===");
        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
                        "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
                        "explote en exactamente " + minutos + " minutos y " + segundos + " segundos, el tiempo suficiente para escapar\n" +
                        "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
                        "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
                        "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
                        "el factorial de los minutos y el factorial de los segundos.\n" +
                        "¿Qué valor debe introducir?");

        int suma = factorial(minutos) + factorial(segundos);

        comprobacion(suma);
    }

    //Método auxiliar para calcular el factorial de un número.
    public int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) factorial *= i;
        return factorial;
    }
    
    //Comprueba si la respuesta del usuario es igual a la respuesta correcta
    public void comprobacion(int respuesta_correcta) {
        try {
            correcto = false;
            int respuesta_usuario = scanner.nextInt();
            if (respuesta_usuario == respuesta_correcta) correcto = true;
        } catch (InputMismatchException e) {}
    }

    //Mensaje ganar
    public void ganar() {
        System.out.println("\nLuke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n" +
                        "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n" +
                        "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
                        "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
                        "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
                        "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
                        "imperio.\n" +
                        "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
    }

    //Mensaje perder
    public void perder() {
        System.out.println("\nEse no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
    }

    //Mensaje final
    public void fin() {
        System.out.println("\nGracias por jugar :D");
    }
}