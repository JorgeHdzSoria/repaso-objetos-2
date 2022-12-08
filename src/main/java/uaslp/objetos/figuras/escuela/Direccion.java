package uaslp.objetos.escuela;

public class Direccion {
    private Direccion(){
    }
    private static Direccion instance = new Direccion();

    public static Direccion getInstance(){
        return instance;
    }
}
