import java.util.ArrayList;

/**
 * Created by mkamien on 5/24/18.
 */
public class ListadoDeAulas {

    private ArrayList<Aula> aulas = new ArrayList<Aula>();

    public Aula solicitarAula(Solicitud solicitud) {
        Aula aulaResultante = new NingunAula();
        for (Aula aula: this.aulas) {
            aulaResultante = aula.devolveteSiAplicas(solicitud, aulaResultante);
        }
        return aulaResultante;
    }

    public void add(AulaConcreta aula){
        this.aulas.add(aula);
    }
}
