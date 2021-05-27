package Bjobeadando;

public abstract class Uzenet implements Observer {
    private Subject rendeles;
    private Statusz csomagallapot;
    protected String allapotuzi;

    public Uzenet(Subject rendel) {
        this.rendeles = rendel;
    }

    @Override
    public String Update() {
        this.csomagallapot = rendeles.getState();
        switch (csomagallapot) {
            case Csomagolas:
                allapotuzi = "A küldemény előkészítésre került";
                break;
            case Szallitas:
                allapotuzi = "A küldemény átadva a futtárszolgálat részére";
                break;
            case Rendeles:
                allapotuzi = "A megrendelés feldolgozva";
                break;
        }
        return display();
    }

    abstract String display();
}
