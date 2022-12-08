package uaslp.objetos.escuela;
import java.time.LocalDate;

public class Builder {
    public Builder(){
    }

    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Builder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public Builder clave(String clave){
        this.clave = clave;
        return this;
    }
    public Builder claveDeCarrera(String claveDeCarrera){
        this.claveDeCarrera = claveDeCarrera;
        return this;
    }
    public Builder anioDeIngreso(int anioDeIngreso){
        this.anioDeIngreso = anioDeIngreso;
        return this;
    }
    public Builder fechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public Alumno build(){
        return new Alumno(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
