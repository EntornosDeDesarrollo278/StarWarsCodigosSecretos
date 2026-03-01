package starwars;

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