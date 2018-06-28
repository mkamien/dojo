/**
 * Created by mkamien on 6/14/18.
 */
public class Mano {

    private Envido envido;

    public Mano(Carta primerCarta, Carta segundaCarta, Carta tercerCarta) {
    }

    public Envido desafiarEnvido(Mano segundaMano) {
        return new Envido(new SieteDeOro(), new CincoDeOro());
    }

    private Envido calcularEnvido() {
        return this.envido;
    }
}
