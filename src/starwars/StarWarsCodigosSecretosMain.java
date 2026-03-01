package starwars;

public class StarWarsCodigosSecretosMain {
    public static void main(String[] args) {
    	StarWarsCodigosSecretos juego = new StarWarsCodigosSecretos();
        //Mensaje inicial
        juego.inicio();

        //Verifica si has llegado con todas correctas o has fallado en algun nivel
        if (juego.correcto) juego.ganar();
        else juego.perder();
        
        //Mensaje final
        juego.fin();
    }
}