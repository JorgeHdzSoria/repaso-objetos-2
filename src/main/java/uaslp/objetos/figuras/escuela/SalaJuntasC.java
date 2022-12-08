package uaslp.objetos.escuela;

public class SalaJuntasC implements SalaDeJuntas{

    @Override
    public String getNombre() {
        return "Sala C";
    }

    private static SalaJuntasC instance = new SalaJuntasC();

    public static SalaDeJuntas getInstance() {
        return instance;
    }
}
