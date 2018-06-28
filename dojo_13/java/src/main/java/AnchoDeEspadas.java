/**
 * Created by mkamien on 6/14/18.
 */
public class AnchoDeEspadas implements Carta{

    @Override
    public Carta desafiar(Carta otraCarta) {
        return this;
    }

    @Override
    public boolean equals(Object otraCarta){
        return otraCarta.getClass().equals(this.getClass());
    }
}
