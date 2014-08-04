/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adams.aeii.troopeditor;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author st000120
 */
public class Troop_Editor extends JFrame {

    private Troop_Attribute ta;
    private Button btn;
    private Image image;

    public Troop_Editor() throws IOException {
        this.setTitle("AEII_Troop_Editor");
        this.getContentPane();
        this.setBounds(300, 50, 800, 400);
        this.setResizable(false);
        this.setLayout(new GridLayout(2, 2));
        ImageIcon icon = new ImageIcon(this.getClass().getResource("image/aeii.png"));
        this.setIconImage(icon.getImage());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        });
        ta = new Troop_Attribute();
        image = new Image();
        btn = new Button(ta,image,this);
       
        this.getContentPane().add(ta.initJtTroopEditor());
        this.getContentPane().add(btn.initButton());
        this.show();
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        new Troop_Editor();
    }
}
