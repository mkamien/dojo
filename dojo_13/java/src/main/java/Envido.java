/**
 * Created by mkamien on 6/14/18.
 */
public class Envido {

    private Carta primerCarta;
    private Carta segundaCarta;

    public Envido(SieteDeOro sieteDeOro, CincoDeOro cincoDeOro) {
        this.primerCarta = sieteDeOro;
        this.segundaCarta = cincoDeOro;
    }

    @Override
    public boolean equals(Object otroEnvido){
        Envido envido = (Envido) otroEnvido;

        return this.primerCarta.equals( envido.primerCarta ) &&
                this.segundaCarta.equals( envido.segundaCarta );

    }
}
