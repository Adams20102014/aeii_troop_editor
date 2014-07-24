
package com.adams.aeii.troopeditor;


import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author st000120
 */
public class Troop_Attribute  {

    /**
     * @param args the command line arguments
     */
    private JPanel jp_hp;
    private JPanel jp_movement;
    private JPanel jp_attack;
    private JPanel jp_defence;
    private JPanel jp_attack_range;
    private JPanel jp_attack_type;
    private JPanel jp_abilities;
    
    private JTabbedPane jt_troop_editor;
 /*   private JTabbedPane jt_movement;
    private JTabbedPane jt_attack;
    private JTabbedPane jt_defence;
    private JTabbedPane jt_attack_range;
    private JTabbedPane jt_attack_type;
    private JTabbedPane jt_abilities; */
    
    private JLabel jl_max_hp;
    private JLabel jl_hp_growth;
    
    private JLabel jl_movement_point;
    private JLabel jl_movement_growth;
    
    private JLabel jl_attack;
    private JLabel jl_attack_growth;
    
    private JLabel jl_physical_defence;
    private JLabel jl_physical_defence_growth;
    private JLabel jl_magical_defence;
    private JLabel jl_magical_defence_growth;
    
    //private JLabel jl_attack_type;
   
    private JLabel jl_max_attack_range;
    private JLabel jl_min_attack_range;
    
   // private JLabel abilities;
   // private JLabel learnable_abilities;
    
    private JTextField jf_max_hp;
    private JTextField jf_hp_growth;
    
    private JTextField jf_movement_point;
    private JTextField jf_movement_growth;
    
    private JTextField jf_attack;
    private JTextField jf_attack_growth;
    
    private JTextField jf_physical_defence;
    private JTextField jf_physical_defence_growth;
    private JTextField jf_magical_defence;
    private JTextField jf_magical_defence_growth;
    
    private JTextField jf_max_attack_range;
    private JTextField jf_min_attack_range;
    
    private JRadioButton jr_physical;
    private JRadioButton jr_magical;
    private ButtonGroup bg_attack_type;
    
    private JComboBox jc_abilities;
//    private JComboBox jc_learnable_abilities;
    
    private String[] str_abilities;
//    private String[] str_learnable_abilities;
            
    public Troop_Attribute() {
        
        
    }
    
    
    public JTabbedPane initJtTroopEditor() {
        jt_troop_editor = new JTabbedPane();
        jt_troop_editor.addTab("HP值设定", initJpHp());
        jt_troop_editor.addTab("移动力值设定", initJpMovement());
        jt_troop_editor.addTab("攻击力值设定", initJpAttack());
        jt_troop_editor.addTab("防御力值设定", initJpDefence());
        jt_troop_editor.addTab("攻击距离值设定", initJpAttackRange());
        jt_troop_editor.addTab("攻击类型设定", initJpAttackType());
        jt_troop_editor.addTab("特殊能力设定", initJpAbilities());
        return jt_troop_editor;
    }
  
    public void initJTextField(String max_hp, String movement_point, String attack, String physical_defence, String magical_defence, String hp_growth, String movement_growth, String attack_growth, String physical_defence_growth, String magical_defence_growth, String max_attack_range, String min_attack_range) {
        jf_max_hp.setText(max_hp);
        jf_movement_point.setText(movement_point);
        jf_attack.setText(attack);
        jf_physical_defence.setText(physical_defence);
        jf_magical_defence.setText(magical_defence);
        jf_hp_growth.setText(hp_growth);
        jf_movement_growth.setText(movement_growth);
        jf_attack_growth.setText(attack_growth);
        jf_physical_defence_growth.setText(physical_defence_growth);
        jf_magical_defence_growth.setText(magical_defence_growth);
        jf_max_attack_range.setText(max_attack_range);
        jf_min_attack_range.setText(min_attack_range);
        jt_troop_editor.repaint();
    }
    
    public void initJRadioButton (String attack_type) {
        switch (attack_type) {
            case "0":
                jr_physical.setSelected(true);
                break;
            case "1":
                jr_magical.setSelected(true);
                break;
        }   
    }
    
/*    public void initJComboBox() {
        
    }
    */
    public JPanel initJpHp () {
        jp_hp = new JPanel(new GridLayout(2,2));
        jp_hp.setBorder(BorderFactory.createTitledBorder("HP值设定(请输入正常正整数)"));
        jl_max_hp = new JLabel("最大HP值：");
        jl_hp_growth = new JLabel("HP成长值：");
        jf_max_hp = new JTextField(10);
        jf_hp_growth = new JTextField(10);
        jp_hp.add(jl_max_hp);
        jp_hp.add(jf_max_hp);
        jp_hp.add(jl_hp_growth);
        jp_hp.add(jf_hp_growth);
        return jp_hp;
    }
    
    public JPanel initJpMovement () {
        jp_movement = new JPanel(new GridLayout(2,2));
        jp_movement.setBorder(BorderFactory.createTitledBorder("移动力值设定(请输入正常正整数)"));
        jl_movement_point = new JLabel("移动力：");
        jl_movement_growth = new JLabel("移动力成长值：");
        jf_movement_point = new JTextField(10);
        jf_movement_growth = new JTextField(10);
        jp_movement.add(jl_movement_point);
        jp_movement.add(jf_movement_point);
        jp_movement.add(jl_movement_growth);
        jp_movement.add(jf_movement_growth);
        return jp_movement;  
    }
    
    public JPanel initJpAttack () {
        jp_attack = new JPanel(new GridLayout(2,2));
        jp_attack.setBorder(BorderFactory.createTitledBorder("攻击力值设定(请输入正常正整数)"));
        jl_attack = new JLabel("攻击力：");
        jl_attack_growth = new JLabel("攻击力成长值：");
        jf_attack = new JTextField(10);
        jf_attack_growth = new JTextField(10);
        jp_attack.add(jl_attack);
        jp_attack.add(jf_attack);
        jp_attack.add(jl_attack_growth);
        jp_attack.add(jf_attack_growth);
        return jp_attack;
    }
     
    public JPanel initJpDefence () {
        jp_defence = new JPanel(new GridLayout(4,2));
        jp_defence.setBorder(BorderFactory.createTitledBorder("防御力值设定(请输入正常正整数)"));
        jl_physical_defence = new JLabel("物理防御力：");
        jl_physical_defence_growth = new JLabel("物理防御力成长值：");
        jl_magical_defence = new JLabel("法术防御力：");
        jl_magical_defence_growth = new JLabel("法术防御力成长值：");
        jf_physical_defence = new JTextField(10);
        jf_physical_defence_growth = new JTextField(10);
        jf_magical_defence = new JTextField(10);
        jf_magical_defence_growth = new JTextField(10);
        jp_defence.add(jl_physical_defence);
        jp_defence.add(jf_physical_defence);
        jp_defence.add(jl_physical_defence_growth);
        jp_defence.add(jf_physical_defence_growth);
        jp_defence.add(jl_magical_defence);
        jp_defence.add(jf_magical_defence);
        jp_defence.add(jl_magical_defence_growth);
        jp_defence.add(jf_magical_defence_growth);
        return jp_defence;
    }
       
    public JPanel initJpAttackRange () {
        jp_attack_range = new JPanel(new GridLayout(2,2));
        jp_attack_range.setBorder(BorderFactory.createTitledBorder("攻击距离值设定(请输入正常正整数)"));
        jl_max_attack_range = new JLabel("最大攻击距离：");
        jl_min_attack_range = new JLabel("最小攻击距离：");
        jf_max_attack_range = new JTextField(10);
        jf_min_attack_range = new JTextField(10);
        jp_attack_range.add(jl_max_attack_range);
        jp_attack_range.add(jf_max_attack_range);
        jp_attack_range.add(jl_min_attack_range);
        jp_attack_range.add(jf_min_attack_range);
        return jp_attack_range;
    } 
    
    public JPanel initJpAttackType () {
        jp_attack_type = new JPanel(new GridLayout(1,2));
        jp_attack_type.setBorder(BorderFactory.createTitledBorder("攻击类型设定"));
        jr_physical = new JRadioButton("物理攻击");
        jr_magical = new JRadioButton("魔法攻击");
        bg_attack_type = new ButtonGroup();
        bg_attack_type.add(jr_physical);
        bg_attack_type.add(jr_magical);
        jp_attack_type.add(jr_physical);
        jp_attack_type.add(jr_magical);
        return jp_attack_type;
    }
    
    public JPanel initJpAbilities () {
        jp_abilities = new JPanel(new GridLayout(1,2));
        jp_abilities.setBorder(BorderFactory.createTitledBorder("特殊能力设定"));
        str_abilities = new String[] {"None","可以占领建筑物（城堡除外）","在水中获得攻防属性加成","在森林中获得攻防属性加成","在山区获得攻防属性加成"};
        jc_abilities = new JComboBox(str_abilities);
        jc_abilities.setBorder(BorderFactory.createTitledBorder("自带特殊能力"));
        jp_abilities.add(jc_abilities);
        return jp_abilities;
    }
    
    public String getJfMaxHpText() {
        return jf_max_hp.getText();
    }
    
    public String getJfHpGrowthText() {
        return jf_hp_growth.getText();
    }
    
    public String getJfMovementPointText () {
        return jf_movement_point.getText();
    }
    
    public String getJfMovementGrowthText() {
        return jf_movement_growth.getText();
    }
    
    public String getJfAttackText() {
        return jf_attack.getText();
    }
    
    public String getJfAttackGrowth() {
        return jf_attack_growth.getText();
    }
    
    public String getJfPhysicalDefence() {
        return jf_physical_defence.getText();
    }
    
    public String getJfPhysicalDefenceGrowth() {
        return jf_physical_defence_growth.getText();
    }
    
    public String getJfMagicalDefence() {
        return jf_magical_defence.getText();
    }
    
    public String getJfMagicalDefenceGrowth() {
        return jf_magical_defence_growth.getText();
    }
    
    public String getJfMaxAttackRange() {
        return jf_max_attack_range.getText();
    }
    
    public String getJfMinAttackRange() {
        return jf_min_attack_range.getText();
    }
    
    public String getAttackType () {
        if(jr_physical.isSelected() == true) {
            return "0";
        }else if(jr_magical.isSelected() == true) {
            return "1";
        }
        return null;
    }
    
/*    public String getAbilities() {
        
    }*/
}
