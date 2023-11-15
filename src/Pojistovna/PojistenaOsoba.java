package Pojistovna;
//Vytvoření hlavni třidy (objektu)
public class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefoniCislo;


    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefoniCislo = telefon;
    }

    public String getPrijmeni () {
        return prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }

    public String getTelefoniCislo() {
        return telefoniCislo;
    }
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (Tel.Cislo: " + telefoniCislo + " Věk: " + vek + ")";
    }
}
