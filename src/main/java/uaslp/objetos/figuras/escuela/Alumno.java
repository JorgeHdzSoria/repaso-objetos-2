package uaslp.objetos.escuela;
import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Alumno(Builder builder){
        this.nombre = builder.getNombre();
        this.clave = builder.getClave();
        this.claveDeCarrera = builder.getClaveDeCarrera();
        this.anioDeIngreso = builder.getAnioDeIngreso();
        this.fechaNacimiento = builder.getFechaNacimiento();
    }

    public static Builder builder() {
        return new Builder();
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
