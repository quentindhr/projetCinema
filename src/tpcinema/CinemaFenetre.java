/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpcinema;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CinemaFenetre extends JFrame{
     private JTextField field1;
     private JTextField field2;
     
     public CinemaFenetre(){
		super();
 
		build();
                
	}
     
     private void build(){
		setTitle("Cinema"); 
		setSize(400,200); 
		setLocationRelativeTo(null); 
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setContentPane(buildContentPane());
        }
     
     private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
                
                field1 = new JTextField();
		field1.setColumns(10);
 
		panel.add(field1);
 
		field2 = new JTextField();
		field2.setColumns(10);
 
		panel.add(field2);
 
		JButton bouton = new JButton(new FilmAction(this, "Rechercher un film"));
 
		panel.add(bouton);
 
		JLabel label = new JLabel("Truc");
 
		panel.add(label);
                
                JButton quitter = new JButton(new QuitterBouton(this, "Quitter"));
 
		panel.add(quitter);
 
		return panel;
	}
     
}
