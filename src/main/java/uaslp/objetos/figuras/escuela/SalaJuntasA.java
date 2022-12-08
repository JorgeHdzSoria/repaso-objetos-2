package uaslp.objetos.escuela;

public class SalaJuntasA implements SalaDeJuntas{
    @Override
    public String getNombre() {
        return "Sala A";
    }

    private static SalaJuntasA instance = new SalaJuntasA();

    public static SalaDeJuntas getInstance() {
        return instance;
    }
}
