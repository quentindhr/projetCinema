/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpcinema;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author quentindeharo
 */
public class FilmAction extends AbstractAction {
    private CinemaFenetre fenetre;
    
    public FilmAction(CinemaFenetre fenetre, String texte){
        super(texte);
 
	this.fenetre = fenetre;
    }
    
    public void actionPerformed(ActionEvent e) { 
        fenetre.dispose();
    
    }
    
}
