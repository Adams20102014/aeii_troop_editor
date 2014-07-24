package com.adams.aeii.troopeditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author st000120
 */
class Button_Listener implements ActionListener {

    private JFileChooser fileChooser;
    
    private String max_hp;
    private String movement_point;
    private String attack;
    private String physical_defence;
    private String magical_defence;
    private String attack_type;
    private String hp_growth;
    private String movement_growth;
    private String attack_growth;
    private String physical_defence_growth;
    private String magical_defence_growth;
    private String max_attack_range;
    private String min_attack_range;
   // private String name;
    private String temp;
    private String troop_info;
//  private String abilities;  
   
    File file ;
    
    int i = 1;
    
    private Troop_Attribute pte;
    
    public Button_Listener(Troop_Attribute pte) {
        this.pte = pte;
    }

    
    public void getString () {
        max_hp = pte.getJfMaxHpText();
        movement_point = pte.getJfMovementPointText();
        attack = pte.getJfAttackText();
        physical_defence = pte.getJfPhysicalDefence();
        magical_defence = pte.getJfMagicalDefence();
        attack_type = pte.getAttackType();
        hp_growth = pte.getJfHpGrowthText();
        movement_growth = pte.getJfMovementGrowthText();
        attack_growth = pte.getJfAttackGrowth();
        physical_defence_growth = pte.getJfPhysicalDefenceGrowth();
        magical_defence_growth = pte.getJfMagicalDefenceGrowth();
        max_attack_range = pte.getJfMaxAttackRange();
        min_attack_range = pte.getJfMinAttackRange();
    }
    
    public String getTroopInfo () {
        this.getString();
        troop_info = max_hp + "\n" + movement_point + "\n" + attack + "\n" + physical_defence + "\n" + magical_defence + "\n" + attack_type + "\n" + hp_growth + "\n" + movement_growth + "\n" + attack_growth + "\n" + physical_defence_growth + "\n" + magical_defence_growth + "\n" + max_attack_range + "\n" + min_attack_range;
        return troop_info;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getActionCommand().equals("打开兵种dat文件")) {
            fileChooser = new JFileChooser("打开文件");
            int state = fileChooser.showOpenDialog(fileChooser);
            if(state == JFileChooser.APPROVE_OPTION) {
                try {
                    file = fileChooser.getSelectedFile();
                    FileReader read = new FileReader(file);
                    BufferedReader buRead = new BufferedReader(read);
                    while((temp = buRead.readLine()) != null) {
                        if(i == 1) {
                            max_hp = temp;
                            i++;
                        }else if(i == 2) {
                            movement_point = temp;
                            i++;
                        }else if(i == 3) { 
                            attack = temp;
                            i++;
                        }else if(i == 4) {
                            physical_defence = temp;
                            i++;
                        }else if(i == 5) {
                            magical_defence = temp;
                            i++;
                        }else if(i == 6) {
                            attack_type = temp;
                            i++;
                        }else if(i == 7) {
                            hp_growth = temp;
                            i++;
                        }else if(i == 8) {
                            movement_growth = temp;
                            i++;
                        }else if(i == 9) {
                            attack_growth = temp;
                            i++;
                        }else if(i == 10) {
                            physical_defence_growth = temp;
                            i++;
                        }else if(i == 11) {
                            magical_defence_growth = temp;
                            i++;
                        }else if(i == 12) {
                            max_attack_range = temp;
                            i++;
                        }else if(i == 13) {
                            min_attack_range = temp;
                            i++;
                        }
                    }
                    
                    pte.initJTextField(max_hp, movement_point, attack, physical_defence, magical_defence, hp_growth, movement_growth, attack_growth, physical_defence_growth, magical_defence_growth, max_attack_range, min_attack_range);
                    pte.initJRadioButton(attack_type);
                    read.close();
                    buRead.close();
                } catch (IOException ex) {  
                } 
            }
            
        }else if(e.getActionCommand().equals("保存兵种dat文件")) {
            fileChooser = new JFileChooser("保存文件");
            int state = fileChooser.showSaveDialog(fileChooser);
            if(state== JFileChooser.APPROVE_OPTION){
                try{
                     file = fileChooser.getSelectedFile();
                    FileWriter writer = new FileWriter(file);
                    BufferedWriter buWriter = new BufferedWriter(writer);
                    buWriter.write(getTroopInfo());
                    buWriter.close();
                    writer.close();
                }catch(IOException ex) {
                }
            }
        }
    }
    
}
