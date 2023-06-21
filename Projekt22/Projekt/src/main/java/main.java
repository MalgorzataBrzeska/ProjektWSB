package main;

import gra.WisielecGra;
import interfejs.WisielecInterfejs;

public class Wisielecmain {
    public static void main(String[] args) {
        String slowo = "wisielec";
        int maxProb = 6;

        WisielecGra wisielecGra = new WisielecGra(slowo, maxProb);
        WisielecInterfejs wisielecInterfejs = new WisielecInterfejs(wisielecGra);
        wisielecInterfejs.rozpocznijGre();
    }
}
