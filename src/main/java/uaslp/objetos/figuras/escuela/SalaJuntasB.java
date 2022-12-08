package uaslp.objetos.escuela;

public class SalaJuntasB implements SalaDeJuntas{

    @Override
    public String getNombre() {
        return "Sala B";
    }

    private static SalaJuntasB instance = new SalaJuntasB();

    public static SalaDeJuntas getInstance() {
        return instance;
    }
}
