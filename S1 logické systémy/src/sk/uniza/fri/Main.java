package sk.uniza.fri;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Adam
 * Date: 23. 11. 2021
 * Time: 14:37
 */
public class Main {

    private static Stavy stavy = new Stavy();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        info();
        String vstup = scanner.next();

        while (!vstup.equals("k")) {
            if (stavy.zmenaStavuASemaforu(vstup)) {
                stavy.zmenFarbuSemaforu();
                info();
                vstup = scanner.next();
            } else {
                info();
                vstup = scanner.next();
            }
        }
    }
    private static void info() {
        System.out.println("Aktuálny stav : S" + stavy.getStav());
        System.out.println("Farba semafóru : " + stavy.getFarbaSemaforu());
        System.out.println("Prosím zadajte vstup (A,B). Vstup je potrebné zadávať v tvare : a,b ");
        System.out.println("Ak chcete program ukončiť prosím zadajte písmeno k a stalčte klávesu ENTER.");
    }
}
