package gra;

public class WisielecGra {
    private String slowo;
    private StringBuilder zgadywaneLitery;
    private int maxProb;
    private int bledneProby;

    public WisielecGra(String slowo, int maxProb) {
        this.slowo = slowo.toLowerCase();
        this.maxProb = maxProb;
        zgadywaneLitery = new StringBuilder();
    }


    public boolean czyKoniecGry() {
        return bledneProby >= maxProb || czySlowoOdgadniete();
    }

    public boolean czySlowoOdgadniete() {
        for (int i = 0; i < slowo.length(); i++) {
            if (!zgadywaneLitery.toString().contains(Character.toString(slowo.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    public boolean zgadnijLitera(char litera) {
        boolean czyPoprawna = slowo.contains(Character.toString(litera));
        if (!zgadywaneLitery.toString().contains(Character.toString(litera))) {
            zgadywaneLitery.append(litera);
            if (!czyPoprawna) {
                bledneProby++;
            }
        }
        return czyPoprawna;
    }


    public String getSlowoZOdgadnietymi() {
        StringBuilder wynik = new StringBuilder();
        for (int i = 0; i < slowo.length(); i++) {
            if (zgadywaneLitery.toString().contains(Character.toString(slowo.charAt(i)))) {
                wynik.append(slowo.charAt(i));
            } else {
                wynik.append("_");
            }
            wynik.append(" ");
        }
        return wynik.toString();
    }
}