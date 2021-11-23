package sk.uniza.fri;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Adam
 * Date: 23. 11. 2021
 * Time: 14:37
 */
public class Main {

    public static void main(String[] args) {
        Stavy stavy = new Stavy();
        Scanner scanner = new Scanner(System.in);

        info();

        String vstup = scanner.next();

        while (!vstup.equals("k")) {
            if (stavy.zmenaStavuASemaforu(vstup)) {
                stavy.zmenFarbuSemaforu();
                System.out.println("Aktuálny stav : " + stavy.getStav());
                System.out.println("Farba semafóru : " + stavy.getFarbaSemaforu());
                info();
                vstup = scanner.next();
            } else {
                System.out.println("Takýto prechod medzi stavmi NEEXISTUJE, alebo ste zadali nesprávny formát");
                System.out.println("Aktuálny stav : S" + stavy.getStav());
                info();
                vstup = scanner.next();
            }

        }
    }
    public static void info() {
        System.out.println("Prosím zadajte vstup (A,B). Vstup je potrebné zadávať v tvare : a,b ");
        System.out.println("Ak chcete program ukončiť prosím zadajte písmeno k a stalčte klávesu ENTER.");
    }
}
