package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public SalaDeJuntasFactory(){
    }

    public static SalaDeJuntas get(String nombreSala) {
        switch (nombreSala) {
            case "Sala A":
                return SalaJuntasA.getInstance();
            case "Sala B":
                return SalaJuntasB.getInstance();
            case "Sala C":
                return SalaJuntasC.getInstance();
            default:
                return null;
        }
    }
}
