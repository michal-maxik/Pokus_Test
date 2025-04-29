package knihovna;
import java.util.*;
public class Roman extends Publikace {
    Scanner sc = new Scanner(System.in);
    String zanr;
    public Roman() {
        super();
        System.out.println("jaký je žánr:");
        zanr = sc.nextLine();
    }

    public void vypisInfo(){
        System.out.println("Kniha se jmenuje " +nazev+ " a jejím autorem je " +autor+ ". A rok vydání je " + rok+ " s IBSN " +IBSN + " a teké počtem stran " + pocet + ". Žánr je " +zanr+".");
    }


}












































