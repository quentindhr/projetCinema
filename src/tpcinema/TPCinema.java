package tpcinema;

//Coupery Foucauld

import javax.swing.SwingUtilities;

//Deharo Quentin

public class TPCinema {

    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				CinemaFenetre fenetre = new CinemaFenetre();
				fenetre.setVisible(true);
			}
		});
    }
    
}
