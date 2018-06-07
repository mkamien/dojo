/**
 * Created by mkamien on 5/24/18.
 */
public class AulaConcreta implements Aula{

    private String nombre;
    private Integer capacidad;
    private Integer metrosCuadrados;

    public AulaConcreta(String nombre, Integer capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.metrosCuadrados = 0;
    }

    public AulaConcreta(String nombre, Integer capacidad, Integer metrosCuadrados) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String obtenerEtiqueta() {
        return "Aula: " + this.nombre;
    }

    public Aula devolveteSiAplicas(Solicitud solicitud, Aula otraAula) {
        return (solicitud.entraEnAula(this.capacidad) && solicitud.tieneSuficientesM2(this.metrosCuadrados)) ? this : otraAula;
    }
}
