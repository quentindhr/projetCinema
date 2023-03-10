/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpcinema;

/**
 *
 * @author quentindeharo
 */
public class Salle {
    
    private String adresse;
    private String ville;
    private int tarif;
    private int note;
    private Film[] prog;
    private int horraire;

    public Salle(String adresse, String ville, int tarif, int note, Film[] prog, int horraire) {
        this.adresse = adresse;
        this.ville = ville;
        this.tarif = tarif;
        this.note = note;
        this.prog = new Film[1000];
        this.horraire = horraire;
    }
    
    

    @Override
    public String toString() {
        return "Salle{" + "adresse=" + adresse + ", ville=" + ville + ", tarif=" + tarif + ", note=" + note + ", prog=" + prog + ", horraire=" + horraire + '}';
    }
    
    public String versFichier2(){
        String Film = "";
        for(int i=0;i<(prog.length);i++){
                Film = Film+prog[i]+System.lineSeparator();
                }
        return(adresse+System.lineSeparator()+ville+System.lineSeparator()+tarif+System.lineSeparator()+note+System.lineSeparator()+Film+horraire);
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public int getTarif() {
        return tarif;
    }

    public int getNote() {
        return note;
    }

    public Film[] getProg() {
        return prog;
    }

    public int getHorraire() {
        return horraire;
    }

   
    
}
