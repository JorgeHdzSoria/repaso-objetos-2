package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private String nombre;
    private double base;
    private double altura;
    private String descripcion;

    public Triangulo() {
        super("Triangulo");
        this.descripcion = "Cualquier triangulo";
    }

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String description,String Name){
        super(Name);
        this.descripcion=description;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() throws BaseNoProvistaException,AlturaNoProvistaException{

        if(base == 0){
            throw new BaseNoProvistaException();
        }
        if(altura == 0){
            throw new AlturaNoProvistaException();
        }

        return ((base*altura)/2);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription() {
        return descripcion;
    }
}
