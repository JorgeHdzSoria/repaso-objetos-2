package uaslp.objetos.figuras;

public class Figura extends DrawableItem{
    private String nombre;

    public Figura(String Name){
        this.nombre=Name;
    }

    public String getName() {
        return nombre;
    }
}
