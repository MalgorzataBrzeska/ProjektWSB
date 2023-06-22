package main;

import gra.WisielecGra;
import interfejs.WisielecInterfejs;

public class Wisielecmain {
    public static void main(String[] args) {
        String slowo = "wisielec"; // Wybrane słowo do odgadnięcia
        int maxProb = 6; // Maksymalna liczba błędnych prób


        WisielecGra wisielecGra = new WisielecGra(slowo, maxProb);
        WisielecInterfejs wisielecInterfejs = new WisielecInterfejs(wisielecGra);
        wisielecInterfejs.rozpocznijGre(); // Rozpoczęcie gry
    }
}
