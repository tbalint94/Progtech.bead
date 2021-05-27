package Bjobeadando;

import java.util.UUID;

public class Beszallito {
    Beszallitostrategia strategia;
    private UUID beszallitoazonosar;
    private String nev;
    private String termek;

    public Beszallito(Beszallitostrategia sr, UUID beszallitoazonositoar, String nev, String termek ) {
        this.strategia = sr;
    	this.beszallitoazonosar = beszallitoazonositoar;
        this.nev = nev;
        this.termek=termek;
    }

    public int vegosszeg(int ar){
            return strategia.rendertek(ar);
    }
}
