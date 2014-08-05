package com.adams.aeii.troopeditor;

import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author st000120
 */
public class Button {
    
    private JPanel jp_button;
    private JButton open_troop;
    private JButton save_troop;
    private final Troop_Attribute pte;
    private final JLabel jl_image;
    private Troop_Editor te;
    
    public Button(Troop_Attribute pte,JLabel jl_image,Troop_Editor te) {
        this.pte = pte;
        this.jl_image = jl_image;
        this.te = te;
    }
    
    public JPanel initButton() {
        jp_button = new JPanel(new GridLayout(2,1));
        open_troop = new JButton("打开兵种文件");
        open_troop.addActionListener(new Button_Listener(pte,jl_image,te));
        save_troop = new JButton("保存兵种文件");
        save_troop.addActionListener(new Button_Listener(pte,jl_image,te));
        jp_button.add(open_troop);
        jp_button.add(save_troop);
        jp_button.setBounds(480, 540, 120, 60);
        return jp_button;
    }
}
