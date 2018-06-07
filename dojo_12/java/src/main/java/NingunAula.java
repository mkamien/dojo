/**
 * Created by mkamien on 5/24/18.
 */
public class NingunAula implements Aula{

    public String obtenerEtiqueta() {
        return "No hay aula disponible";
    }

    @Override
    public Aula devolveteSiAplicas(Solicitud solicitud, Aula otraAula) {
        return this;
    }
}
