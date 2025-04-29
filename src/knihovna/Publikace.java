package knihovna;
import java.util.*;
public class Publikace {
    String nazev;
    String autor;
    int rok;
    String IBSN;
    int pocet;
    Scanner sc = new Scanner(System.in);
    public Publikace() {
        System.out.println("Kniha je: ");
        nazev = sc.nextLine();
        System.out.println("Autor: ");
        autor = sc.nextLine();
        System.out.println("Rok: ");
        rok = sc.nextInt();
        sc.nextLine();
        System.out.println("IBSN: ");
        IBSN = sc.nextLine();
        System.out.println("Pocet: ");
        pocet = sc.nextInt();


    }
    public void vypisInfo(){
        System.out.println("Kniha se jmenuje " +nazev+ " a jejím autorem je " +autor+ ". A rok vydání je " + rok+ " s IBSN " +IBSN + " a teké počtem stran " + pocet + ".");
    }


    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    public void setIBSN(String IBSN) {
        this.IBSN = IBSN;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocet() {
        return pocet;
    }

    public String getIBSN() {
        return IBSN;
    }

    public int getRok() {
        return rok;
    }

    public String getAutor() {
        return autor;
    }

    public String getNazev() {
        return nazev;
    }
}
