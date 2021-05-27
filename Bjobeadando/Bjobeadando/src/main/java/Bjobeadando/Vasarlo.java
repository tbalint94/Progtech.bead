package Bjobeadando;

import java.util.Date;
import java.util.UUID;

public class Vasarlo {
    private UUID vasarloiazonosito;
    private String nev;
    private Date szuldatum;
    private String szulhely;
    private String telszam;
    private String email;
    private String szallhelyvaros;
    private String szallhelyutca;
    private int szallhelyhazszam;

    public Vasarlo(UUID vasarloiazonosito, String nev, Date szuldatum,String szulhely,String telszam, String email, 
    		String szallhelyvaros,String szallhelyutca,int szallhelyhazszam ) {
        this.vasarloiazonosito=vasarloiazonosito;
        this.nev=nev;
        this.szuldatum=szuldatum;
        this.szulhely=szulhely;
        this.telszam=telszam;
        this.email=email;
        this.szallhelyvaros=szallhelyvaros;
        this.szallhelyutca=szallhelyutca;
        this.szallhelyhazszam=szallhelyhazszam;
        }

   }
