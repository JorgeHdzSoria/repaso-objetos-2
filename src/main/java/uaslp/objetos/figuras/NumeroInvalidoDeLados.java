package uaslp.objetos.figuras;

public class NumeroInvalidoDeLados extends RuntimeException{

    public String getMessage(){
        return "Número de lados válido a partir de 5";
    }
}
