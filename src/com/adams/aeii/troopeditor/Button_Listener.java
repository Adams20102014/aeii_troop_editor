package com.adams.aeii.troopeditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author st000120
 */
class Button_Listener implements ActionListener {

    private JFileChooser fileChooser;
    
    private String price;
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
    
    private String troop_dat;
//  private String abilities;  
   
    File file ;
    
    private final Troop_Attribute pte;
    private Image image;
    private final JLabel jl_image;
    private final Troop_Editor te;
    
    public Button_Listener(Troop_Attribute pte,JLabel jl_image,Troop_Editor te) {
        this.pte = pte;
        this.jl_image = jl_image;
        this.te = te;
    }

    
    public void getString () {
        price = pte.getJfPrice();
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
        troop_info = price + "\r\n" + max_hp + "\r\n" + movement_point + "\r\n" + attack + "\r\n" + physical_defence + "\r\n" + magical_defence + "\r\n" + attack_type + "\r\n" + hp_growth + "\r\n" + movement_growth + "\r\n" + attack_growth + "\r\n" + physical_defence_growth + "\r\n" + magical_defence_growth + "\r\n" + max_attack_range + "\r\n" + min_attack_range;
        return troop_info;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getActionCommand().equals("打开兵种文件")) {
            fileChooser = new JFileChooser("打开文件");
            int state = fileChooser.showOpenDialog(te);
            if(state == JFileChooser.APPROVE_OPTION) {
                try {
                    int i = 0;
                    File dir = fileChooser.getCurrentDirectory();
                    troop_dat = fileChooser.getSelectedFile().getName();
                    file = new File(dir,troop_dat);
                    FileReader read = new FileReader(file);
                    BufferedReader buRead = new BufferedReader(read);
                    while((temp = buRead.readLine()) != null) {
                        if(i == 0) {
                            price = temp;
                            i++;
                        }else if(i == 1) {
                            max_hp = temp;
                            i++;
                        }else if(i == 2) {
                            movement_point = temp;
                            i++;
                        }else if(i == 3) { 
                            attack = temp;
//                            System.out.println(attack);
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
                    JOptionPane.showMessageDialog(fileChooser, "打开文件成功！", "提示对话框", JOptionPane.INFORMATION_MESSAGE);
                    pte.initJTextField(price,max_hp, movement_point, attack, physical_defence, magical_defence, hp_growth, movement_growth, attack_growth, physical_defence_growth, magical_defence_growth, max_attack_range, min_attack_range);
                    pte.initJRadioButton(attack_type);
//                    System.out.println(troop_dat);
                    image = new Image();
                    image.setTroopImage(troop_dat);
                    jl_image.setIcon((Icon) image.getTroopImage());
                    read.close();
                    buRead.close();
                } catch (IOException ex) {
                } 
            }
            
        }else if(e.getActionCommand().equals("保存兵种文件")) {
            fileChooser = new JFileChooser("保存文件");
            int state = fileChooser.showSaveDialog(te);
            if(state== JFileChooser.APPROVE_OPTION){
                try{
                    file = fileChooser.getSelectedFile();
                    FileWriter writer = new FileWriter(file);
                    BufferedWriter buWriter = new BufferedWriter(writer);
                    buWriter.write(getTroopInfo());
                    JOptionPane.showMessageDialog(fileChooser, "保存成功！", "提示对话框", JOptionPane.INFORMATION_MESSAGE);
                    buWriter.close();
                    writer.close();
                }catch(IOException ex) {
                }
            }
        }
    }
    
}
