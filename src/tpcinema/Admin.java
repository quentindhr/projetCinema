
package tpcinema;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


public class Admin {
    
    private String id;
    private String mdp;
    private Film[] catalogue;
    private Salle[] salles;

    public Admin(String id, String mdp, Film[] catalogue, Salle[] salles) {
        this.id = id;
        this.mdp = mdp;
        this.catalogue = new Film[1000];
        this.salles = new Salle[1000];
    }
    
    public void AjouterFilm(String titre, String genre, LocalDate DateSortie, String acteur, String real, String synopsis, int note, Salle[] salle){
        Film F = new Film(titre,genre,DateSortie,acteur,real,synopsis,note,salle);
        for(int i = 0;i<(catalogue.length);i++){
            if(catalogue[i]==null){
                catalogue[i]=F;
                break;
            }
        }
    }
    
    public void versfichierFilm(String nom_fichier) throws IOException{
        FileWriter fich = new FileWriter(nom_fichier);
        for(int i = 0; i < catalogue.length; i++){
            if(catalogue[i]!=null){
            String ch = catalogue[i].versFichier1();
            fich.write(ch);}
        }
        fich.close();
    }
    
    public void AjouterSalle(String adresse, String ville, int tarif, int note, Film[] prog, int horraire){
        Salle S = new Salle(adresse,ville,tarif,note,prog,horraire);
        for(int i = 0;i<(salles.length);i++){
            if(salles[i]==null){
                salles[i]=S;
                break;
            }
        }
    
    }
    
    public void versfichierSalle(String nom_fichier) throws IOException{
        FileWriter fich = new FileWriter(nom_fichier);
        for(int i = 0; i < salles.length; i++){
            if(salles[i]!=null){
            String ch = salles[i].versFichier2();
            fich.write(ch);}
        }
        fich.close();
    }
    
    

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", mdp=" + mdp + '}';
    }
    
    public String getId() {
        return id;
    }

    public String getMdp() {
        return mdp;
    }
    
    
    
}
