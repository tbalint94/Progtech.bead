package Bjobeadando;

import java.util.UUID;

public class Termek {
    private UUID termekazonosito;
    private String termeknev;
    private int termekar;
    private Beszallito beszallito;

    public Termek(UUID termekazonosito, String termeknev, int termekar) {
        this.termekazonosito = termekazonosito;
        this.termeknev = termeknev;
        this.termekar = termekar;
    }

    public UUID getTermekazonosito() {
        return termekazonosito;
    }

    public String getNev() {
        return termeknev;
    }

    public void setNev(String nev) {
        this.termeknev = nev;
    }

    public int getTermekar() {
        return termekar;
    }

    public void setTermekar(int termekar) {
        this.termekar = termekar;
    }

    public Beszallito getBeszallito() {
        return beszallito;
    }

    public void setBeszallito(Beszallito beszallito) {
        this.beszallito = beszallito;
    }
}
