/**
 * Created by mkamien on 6/14/18.
 */
public class SieteDeEspadas implements Carta{

    @Override
    public Carta desafiar(Carta otraCarta) {
        if(otraCarta.getClass() == AnchoDeEspadas.class || otraCarta.getClass() == AnchoDeBasto.class){
            return otraCarta;
        }
        return this;
    }

    @Override
    public boolean equals(Object otraCarta){
        return otraCarta.getClass().equals(this.getClass());
    }
}
