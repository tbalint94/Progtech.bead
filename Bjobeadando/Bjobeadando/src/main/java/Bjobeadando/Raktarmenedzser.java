package Bjobeadando;

import java.util.ArrayList;
import java.util.Collection;

public class Raktarmenedzser {
    private static Raktarmenedzser raktarmenedzser;
    private Collection<Raktar> raktar;

    public static Raktarmenedzser getInstance() {
        if (raktarmenedzser == null) {
            raktarmenedzser = new Raktarmenedzser();
        }
        return raktarmenedzser;
    }

    private Raktarmenedzser() {
        this.raktar = new ArrayList<>();
    }

    public void addRaktar(Raktar raktar) {
        this.raktar.add(raktar);
    }


}
