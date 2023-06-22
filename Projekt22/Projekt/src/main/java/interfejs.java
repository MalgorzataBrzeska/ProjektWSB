package interfejs;

import gra.WisielecGra;
import java.util.Scanner;

public class WisielecInterfejs {
    private WisielecGra wisielecGra;
    private Scanner scanner;

    public WisielecInterfejs(WisielecGra wisielecGra) {
        this.wisielecGra = wisielecGra;
        scanner = new Scanner(System.in);
    }

// Rozpoczyna grę w Wisielca
    public void rozpocznijGre() {
        System.out.println("Witaj w grze Wisielec!");

        while (!wisielecGra.czyKoniecGry()) {
            System.out.println("\nSlowo: " + wisielecGra.getSlowoZOdgadnietymi());
            System.out.println("Pozostałe próby: " + (wisielecGra.maxProb - wisielecGra.bledneProby));
            System.out.print("Podaj literę: ");
            char litera = scanner.next().toLowerCase().charAt(0);
            boolean czyPoprawnaLitera = wisielecGra.zgadnijLitera(litera);

            if (czyPoprawnaLitera) {
                System.out.println("Poprawna litera!");
            } else {
                System.out.println("Błędna litera!");
            }
        }

        if (wisielecGra.czySlowoOdgadniete()) {
            System.out.println("\nGratulacje! Odgadłeś słowo: " + wisielecGra.getSlowoZOdgadnietymi());
        } else {
            System.out.println("\nKoniec gry! Nie udało Ci się odgadnąć słowa. Słowo to: " + wisielecGra.getSlowo());
        }
    }
}
