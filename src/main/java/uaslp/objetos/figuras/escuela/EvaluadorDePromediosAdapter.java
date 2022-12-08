package uaslp.objetos.escuela;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones){

        List<String> listaDeCalificacionesString = new ArrayList<>(Arrays.asList(listaDeCalificaciones.split(",")));

        List<Double> listaDeCalificacionesDouble = new ArrayList<>();

        for (String califAux : listaDeCalificacionesString) {
            listaDeCalificacionesDouble.add(Double.valueOf(califAux));
        }
        return evaluadorDePromedios.evalua(listaDeCalificacionesDouble);
    }
}
