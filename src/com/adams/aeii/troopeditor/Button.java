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
    private Troop_Attribute pte;
    
    public Button(Troop_Attribute pte) {
        this.pte = pte;
    }
    
    public JPanel initButton() {
        jp_button = new JPanel(new GridLayout(2,1));
        open_troop = new JButton("打开兵种dat文件");
        open_troop.addActionListener(new Button_Listener(pte));
        save_troop = new JButton("保存兵种dat文件");
        save_troop.addActionListener(new Button_Listener(pte));
        
        jp_button.add(open_troop);
        jp_button.add(save_troop);
        return jp_button;
    }
}
