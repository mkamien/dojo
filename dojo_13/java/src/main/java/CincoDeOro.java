/**
 * Created by mkamien on 6/14/18.
 */
public class CincoDeOro implements Carta{

    @Override
    public Carta desafiar(Carta otraCarta) {
        return null;
    }

    @Override
    public boolean equals(Object otraCarta){
        return otraCarta.getClass().equals(this.getClass());
    }
}
