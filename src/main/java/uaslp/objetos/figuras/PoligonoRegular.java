package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double area;
    //area de un polígono regular = (perimetro*apotema)/2

    public double getArea() {

        double perimetro= numeroDeLados * lado;

        //Para calcular el apotema necesitamos conocer el ángulo
        //double theta= (360 / numeroDeLados);
        //double apotema= (lado/2*(Math.toRadians(theta/2))); //Librería math para utilizar funcion trigonométrica tangente

        double apotema= 8.6602540378443866;
        area= ((perimetro * apotema) / 2);
        return area;
    }

    public double getLado() {
        return lado;
    }
}
