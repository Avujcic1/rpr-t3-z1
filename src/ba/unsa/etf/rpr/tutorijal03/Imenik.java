package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa;

    public Imenik() {
        mapa = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        return mapa.get(broj).ispisi();
    }

    public String naSlovo(char s) {
        String temp = " ";
        int brojac = 1;
        for(Map.Entry<String, TelefonskiBroj> ulaz : mapa.entrySet()) {
            if(ulaz.getKey().charAt(0) == s) {
                temp += brojac + ". " + ulaz.getKey() + " - " + ulaz.getValue().ispisi() + "\n";
                brojac++;
            }
        }
        return temp;
    }

    public Set<String> izGrada(FiksniBroj g) {
        Set<String> temp = new HashSet<>();
        for(Map.Entry<String, TelefonskiBroj> ulaz : mapa.entrySet()) {
            TelefonskiBroj broj = mapa.get(ulaz.getKey());
            if(broj instanceof FiksniBroj) {
                if(((FiksniBroj) broj).getGrad() == g) {
                    temp.add(ulaz.getKey());
                }
            }
        }
        return temp;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj g) {

    }


}
