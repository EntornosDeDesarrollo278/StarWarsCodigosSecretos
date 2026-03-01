package starwars;

public class StarWarsCodigosSecretosMain {
    public static void main(String[] args) {
    	StarWarsCodigosSecretos juego = new StarWarsCodigosSecretos();
        //Mensaje inicial
        juego.inicio();

        //Si la respuesta es correcta seguira la linea del juego, sino perdera
        juego.nivel1();
        if (juego.correcto) juego.nivel2();
        
        //Verifica si has llegado con todas correctas o has fallado en algun nivel
        if (juego.correcto) juego.ganar();
        else juego.perder();
        
        //Mensaje final
        juego.fin();
    }
}