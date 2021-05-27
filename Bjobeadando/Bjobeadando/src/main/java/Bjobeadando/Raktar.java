package Bjobeadando;

import java.util.ArrayList;
import java.util.Collection;

public class Raktar {
    private Collection<Termek> keszlet;

    public Raktar() {
        this.keszlet = new ArrayList<Termek>();
    }

    public void Keszlethozza(Termek ujkeszlet) {
        boolean ujtermek = true;
        for (Termek termek : keszlet) {
            if (termek.getNev().equals(ujkeszlet.getNev())) {
                termek.setTermekar(termek.getTermekar() + termek.getTermekar());
                ujtermek = false;
            }
        }
        if (ujtermek) {
            keszlet.add(ujkeszlet);
        }
    }
}

