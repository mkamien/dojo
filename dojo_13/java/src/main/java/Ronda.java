/**
 * Created by mkamien on 6/14/18.
 */
public class Ronda {

    Carta primeraCarta;
    Carta segundaCarta;

    public Ronda(Carta primeraCarta, Carta segundaCarta) {
        this.primeraCarta = primeraCarta;
        this.segundaCarta = segundaCarta;
    }



    public Carta ganador() {
        return this.primeraCarta.desafiar(segundaCarta);
    }
}
