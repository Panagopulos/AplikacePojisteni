package Pojistovna;

import java.util.Scanner;

public class KonzolovaAplikace {
    public static void main(String[] args) {
        SpravcePojistenychUzivatelu spravcePojistenychUzivatelu = new SpravcePojistenychUzivatelu();
        Scanner scanner = new Scanner(System.in,"Windows-1250");

        while(true) {
            System.out.println("/----------------------------------------------------------/");
            System.out.println("Vítejte v evidenci uživatelu u Armádní pojištovny.");
            System.out.println("/----------------------------------------------------------/");
            System.out.println("1. Vytvořit pojištěnou osobu");
            System.out.println("2. Zobrazit seznam pojištěných osob");
            System.out.println("3. Vyhledat pojištěnou osobu");
            System.out.println("4. Ukončit aplikaci");

            int volba = scanner.nextInt();
            scanner.nextLine(); // Vygooglil jsem že to dava pryč znaky a bez tohoto to nejede.

            switch (volba) {
                case 1:
                    System.out.println("Zadejte jméno pojištěného: ");
                    String jmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení pojištěného: ");
                    String prijmeni = scanner.nextLine();
                    System.out.println("Zadejte věk pojištěného: ");
                    int vek = scanner.nextInt();
                    scanner.nextLine(); // Bez tohoto to nefunguje,Odstranuje znaky.
                    System.out.println("Zadejte telefoní číslo s předvolbou: ");
                    String telefoniCislo = scanner.nextLine();
                    spravcePojistenychUzivatelu.vytvoreniPojisteneho(jmeno, prijmeni, vek, telefoniCislo);

                    System.out.println("Pokračujte stisknutím ENTER");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Zde je seznam pojištěných osob");
                    spravcePojistenychUzivatelu.zobrazSeznamPojistenych();

                    System.out.println("Pokračujte stisknutím ENTER");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Zadejte jméno hledaného pojištěnce");
                    String hledaneJmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení hledaného pojištěnce");
                    String hledanePrijmeni = scanner.nextLine();
                    PojistenaOsoba nalezena = spravcePojistenychUzivatelu.najdiPojistenouOsobu(hledaneJmeno, hledanePrijmeni);
                    if (nalezena != null) {
                        System.out.println("Nalezeny pojištěný: " + nalezena);
                    } else {
                        System.out.println("Pojištěná osoba nenalezena!");
                    }

                    System.out.println("Pokračujte stisknutím ENTER");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Příjemný den přeje Armadní Pojištovna,naviděnou!");
                    System.out.println("------------------------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Neplatná volba");
                    break;
            }
        }
    }
}
