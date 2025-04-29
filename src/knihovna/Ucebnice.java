package knihovna;

import java.util.Scanner;

public class Ucebnice extends Publikace{
    Scanner sc = new Scanner(System.in);
    String predmet;
    public Ucebnice() {
        super();
        System.out.println("Jaký je předmět:");
        predmet = sc.nextLine();
    }
    public void vypisInfo(){
        System.out.println("Kniha se jmenuje " +nazev+ " a jejím autorem je " +autor+ ". A rok vydání je " + rok+ " s IBSN " +IBSN + " a teké počtem stran " + pocet + ". Předmět je " + predmet+ ".");
    }
    public void nejstarsiUcebnice(){
        if(predmet == "Matematika" && predmet == "matematika"){
            System.out.println("Autoři s učebnicý Matematiky: " +autor);
        }
        else{
            System.out.println("Nikdo takový není!!");
        }
    }










}
