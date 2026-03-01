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
    
    //Comprueba si la respuesta del usuario es igual a la respuesta correcta
    public void comprobacion(int respuesta_correcta) {
        try {
            correcto = false;
            int respuesta_usuario = scanner.nextInt();
            if (respuesta_usuario == respuesta_correcta) correcto = true;
        } catch (InputMismatchException e) {scanner.nextLine();}
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