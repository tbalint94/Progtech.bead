package Bjobeadando;

public class Email extends Uzenet {
    public Email(Subject rendeles) {
        super(rendeles);
    }

    @Override
    String display() {
        return ("Az ön csomagja az alábbi állapotba került : " + this.allapotuzi);
    }
}
