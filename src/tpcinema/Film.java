/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpcinema;

import java.io.FileWriter;
import java.time.LocalDate;

/**
 *
 * @author quentindeharo
 */
public class Film {
    private String titre;
    private String genre;
    private LocalDate DateSortie;
    private String acteur;
    private String real;
    private String synopsis;
    private int note;
    private Salle[] salle;

    public Film(String titre, String genre, LocalDate DateSortie, String acteur, String real, String synopsis, int note, Salle[] salle) {
        this.titre = titre;
        this.genre = genre;
        this.DateSortie = DateSortie;
        this.acteur = acteur;
        this.real = real;
        this.synopsis = synopsis;
        this.note = note;
        this.salle = new Salle[1000];
    }
    
    @Override
    public String toString() {
        return "Film{" + "titre=" + titre + ", genre=" + genre + ", DateSortie=" + DateSortie + ", acteur=" + acteur + ", real=" + real + ", synopsis=" + synopsis + ", note=" + note + ", salle=" + salle + '}';
    }

    public String versFichier1(){
        String Salle = "";
        for(int i=0;i<(salle.length);i++){
                Salle = Salle+salle[i]+System.lineSeparator();
                }
        return titre+ System.lineSeparator()+genre+System.lineSeparator()+ DateSortie +System.lineSeparator()+acteur+System.lineSeparator()+real+System.lineSeparator()+synopsis+System.lineSeparator()+note+System.lineSeparator()+Salle;
                
    }
    
    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDateSortie() {
        return DateSortie;
    }

    public String getActeur() {
        return acteur;
    }

    public String getReal() {
        return real;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getNote() {
        return note;
    }

    public Salle[] getSalle() {
        return salle;
    }

    
    
}
