package Pojistovna;
import java.util.ArrayList;
import java.util.List;

public class SpravcePojistenychUzivatelu {
    private List<PojistenaOsoba> seznamPojistenych;  //Privatní pole,které bude obsahovat obejkty typu 'Pojisteny'.

    public SpravcePojistenychUzivatelu() {

        seznamPojistenych = new ArrayList<>(); //slouží k ukladaní osob pojištěných osob a řadí je do "seznamPojistenych".Využivame diamantovy operaton k zjednodušení syntaxe.
    }

    /**
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefoniCislo
     */
    public void vytvoreniPojisteneho(String jmeno, String prijmeni, int vek, String telefoniCislo) {
        //Overeni prazdneho jména,pokud neni zadano diky return se neulozi.
        if (jmeno.isEmpty()) {
            System.out.println("Chyba:Jméno nesmí být prázdné.");
            return;
        }
        //Vytvoreni instance pokud je jmeno zadano spravne pomoci teto tridy a predany informace o veku atd.
        PojistenaOsoba novaPojistenaOsoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefoniCislo);
        seznamPojistenych.add(novaPojistenaOsoba); //Předání nově uloženeho pojištěnce do seznamuPojistenych.
        System.out.println("Pojištěná osoba byla vytvořena: " + novaPojistenaOsoba); // Vypis pro uživatele

    }

    public void zobrazSeznamPojistenych() {
        for (PojistenaOsoba pojisteni : seznamPojistenych) {
            System.out.println(pojisteni);
        }
    }

    public PojistenaOsoba najdiPojistenouOsobu(String jmeno, String prijmeni) {
        for (PojistenaOsoba pojisteni : seznamPojistenych) {
            if (pojisteni.getJmeno().equalsIgnoreCase(jmeno) && pojisteni.getPrijmeni().equalsIgnoreCase(prijmeni)) ;
            {
                return pojisteni;
            }
        }
        return null;

    }
}
