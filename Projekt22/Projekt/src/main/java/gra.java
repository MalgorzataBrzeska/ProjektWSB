package gra;

public class WisielecGra {
    private String slowo;  // Słowo do odgadnięcia
    private StringBuilder zgadywaneLitery; // Odgadnięte litery
    private int maxProb; // Maksymalna liczba błędnych prób
    private int bledneProby; // Liczba błędnych prób


    public WisielecGra(String slowo, int maxProb) {
        this.slowo = slowo.toLowerCase();
        this.maxProb = maxProb;
        zgadywaneLitery = new StringBuilder();
    }

// Sprawdza, czy gra się skończyła
    public boolean czyKoniecGry() {
        return bledneProby >= maxProb || czySlowoOdgadniete();
    }
// Sprawdza, czy słowo zostało odgadnięte poprawnie
    public boolean czySlowoOdgadniete() {
        for (int i = 0; i < slowo.length(); i++) {
            if (!zgadywaneLitery.toString().contains(Character.toString(slowo.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
   // Odgaduje literę
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

 // Zwraca słowo z odgadniętymi literami
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
