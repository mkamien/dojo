/**
 * Created by mkamien on 5/24/18.
 */
public class Solicitud {

    private Integer capacidad;
    private Integer metrosCuadrados;

    public Solicitud(Integer capacidad) {
        this.capacidad = capacidad;
        this.metrosCuadrados = 0;
    }

    public Solicitud(Integer capacidad, Integer metrosCuadrados) {
        this.capacidad = capacidad;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean entraEnAula(Integer capacidadDelAula) {
        return this.capacidad <= capacidadDelAula;
    }

    public boolean tieneSuficientesM2(Integer metrosCuadradosDelAula) {
        return this.metrosCuadrados <= metrosCuadradosDelAula;
    }
}
