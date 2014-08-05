/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adams.aeii.troopeditor;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author st000120
 */
public class Troop_Editor extends JFrame {

    private final Troop_Attribute ta;
    private final Button btn;
    private JPanel jp_image;
    private JLabel jl_image;

    public Troop_Editor() throws IOException {
        this.setTitle("AEII_Troop_Editor");
        this.setResizable(false);
        this.getContentPane().setPreferredSize(new Dimension(600,600));
        this.pack();
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
         
        ImageIcon icon = new ImageIcon(this.getClass().getResource("image/aeii.png"));
        this.setIconImage(icon.getImage());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        });
        ta = new Troop_Attribute();
        initJpImage();
        btn = new Button(ta, jl_image,this);

        this.getContentPane().add(ta.initJtTroopEditor());
        this.getContentPane().add(btn.initButton());
        this.getContentPane().add(jp_image);
        this.setVisible(true);
    }

    public void initJpImage() {
        jp_image = new JPanel();
        jp_image.setBorder(BorderFactory.createTitledBorder("兵种图片显示："));
        jl_image = new JLabel();
        jp_image.setBounds(480, 20, 120, 80);
        jp_image.add(jl_image);
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        System.setProperty("Quaqua.tabLayoutPolicy", "wrap");
        try {
//            JFrame.setDefaultLookAndFeelDecorated(true);
//            String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
//            UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        new Troop_Editor();
    }
}
