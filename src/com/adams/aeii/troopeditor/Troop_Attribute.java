package com.adams.aeii.troopeditor;

import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author st000120
 */
public class Troop_Attribute {

    /**
     * @param args the command line arguments
     */
    private JPanel jp_price;
    private JPanel jp_hp;
    private JPanel jp_movement;
    private JPanel jp_attack;
    private JPanel jp_defence;
    private JPanel jp_attack_range;
    private JPanel jp_attack_type;
    private JPanel jp_abilities;
    private JPanel jp_database;

    private JTabbedPane jt_troop_editor;
    /*   private JTabbedPane jt_movement;
     private JTabbedPane jt_attack;
     private JTabbedPane jt_defence;
     private JTabbedPane jt_attack_range;
     private JTabbedPane jt_attack_type;
     private JTabbedPane jt_abilities; */

    private JLabel jl_price;

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
    private JTextField jf_price;

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

//    private JComboBox jc_abilities;
//    private JComboBox jc_learnable_abilities;
    private JList jl_abilities;
    private JList jl_base_abilities;
    private JList jl_learnable_abilities;

    private JButton base_into;
    private JButton base_out;
    private JButton learnable_into;
    private JButton learnable_out;

    Vector base_abilities;
    Vector learnable_abilities;
    private String[] abilities;
//    private String[] str_learnable_abilities;

//    private Image image;
    private JScrollPane sp_abilities;
    private JScrollPane sp_base_abilities;
    private JScrollPane sp_learnable_abilities;

    private int base_abilities_counts;
    private int learnable_abilities_counts;
    private String str_base_abilities;
    private String str_learnable_abilities;

    public Troop_Attribute() {

    }

    public JTabbedPane initJtTroopEditor() {
        jt_troop_editor = new JTabbedPane();
        jt_troop_editor.addTab("基础数据设定", initJpDatabase());
        jt_troop_editor.addTab("特殊能力设定", initJpAbilities());
        jt_troop_editor.setBounds(0, 0, 480, 600);
        return jt_troop_editor;
    }

    public JPanel initJpDatabase() {
        jp_database = new JPanel();
        jp_database.setLayout(null);
        jp_database.add(initJpPrice());
        jp_database.add(initJpHp());
        jp_database.add(initJpMovement());
        jp_database.add(initJpAttack());
        jp_database.add(initJpDefence());
        jp_database.add(initJpAttackRange());
        jp_database.add(initJpAttackType());
        return jp_database;
    }

    public void initJTextField(String price, String max_hp, String movement_point, String attack, String physical_defence, String magical_defence, String hp_growth, String movement_growth, String attack_growth, String physical_defence_growth, String magical_defence_growth, String max_attack_range, String min_attack_range) {
        jf_price.setText(price);
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

    public JPanel initJpPrice() {
        jp_price = new JPanel(new GridLayout(1, 1));
        jp_price.setBorder(BorderFactory.createTitledBorder("价格值设定"));
        jl_price = new JLabel("兵种价格：");
        jf_price = new JTextField(10);
        jp_price.add(jl_price);
        jp_price.add(jf_price);
        jp_price.setBounds(10, 10, 200, 50);
        return jp_price;
    }

    public void initJRadioButton(String attack_type) {
        switch (attack_type) {
            case "0":
                jr_physical.setSelected(true);
                break;
            case "1":
                jr_magical.setSelected(true);
                break;
        }
    }

    public void initJlBaseAbilities(int index) {
        base_abilities.add(abilities[index]);
        jl_base_abilities.setListData(base_abilities);
    }

    public void initJlLearnableAbilities(int index) {
        learnable_abilities.add(abilities[index]);
        jl_learnable_abilities.setListData(learnable_abilities);
    }

    public void clearJlBaseAbilities() {
        base_abilities.removeAllElements();
        jl_base_abilities.setListData(base_abilities);
    }

    public void clearJlLearnableAbilities() {
        learnable_abilities.removeAllElements();
        jl_learnable_abilities.setListData(learnable_abilities);
    }
    /*    public void initJComboBox() {
        
     }
     */

    public JPanel initJpHp() {
        jp_hp = new JPanel(new GridLayout(2, 2));
        jp_hp.setBorder(BorderFactory.createTitledBorder("HP值设定"));
        jl_max_hp = new JLabel("最大HP值：");
        jl_hp_growth = new JLabel("HP成长值：");
        jf_max_hp = new JTextField(10);
        jf_hp_growth = new JTextField(10);
        jp_hp.add(jl_max_hp);
        jp_hp.add(jf_max_hp);
        jp_hp.add(jl_hp_growth);
        jp_hp.add(jf_hp_growth);
        jp_hp.setBounds(10, 65, 200, 70);
//        jp_hp.setPreferredSize();
        return jp_hp;
    }

    public JPanel initJpMovement() {
        jp_movement = new JPanel(new GridLayout(2, 2));
        jp_movement.setBorder(BorderFactory.createTitledBorder("移动力值设定"));
        jl_movement_point = new JLabel("移动力：");
        jl_movement_growth = new JLabel("移动力成长值：");
        jf_movement_point = new JTextField(10);
        jf_movement_growth = new JTextField(10);
        jp_movement.add(jl_movement_point);
        jp_movement.add(jf_movement_point);
        jp_movement.add(jl_movement_growth);
        jp_movement.add(jf_movement_growth);
        jp_movement.setBounds(10, 140, 250, 70);
        return jp_movement;
    }

    public JPanel initJpAttack() {
        jp_attack = new JPanel(new GridLayout(2, 2));
        jp_attack.setBorder(BorderFactory.createTitledBorder("攻击力值设定"));
        jl_attack = new JLabel("攻击力：");
        jl_attack_growth = new JLabel("攻击力成长值：");
        jf_attack = new JTextField(10);
        jf_attack_growth = new JTextField(10);
        jp_attack.add(jl_attack);
        jp_attack.add(jf_attack);
        jp_attack.add(jl_attack_growth);
        jp_attack.add(jf_attack_growth);
        jp_attack.setBounds(10, 215, 250, 70);
        return jp_attack;
    }

    public JPanel initJpDefence() {
        jp_defence = new JPanel(new GridLayout(4, 2));
        jp_defence.setBorder(BorderFactory.createTitledBorder("防御力值设定"));
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
        jp_defence.setBounds(10, 290, 250, 120);
        return jp_defence;
    }

    public JPanel initJpAttackRange() {
        jp_attack_range = new JPanel(new GridLayout(2, 2));
        jp_attack_range.setBorder(BorderFactory.createTitledBorder("攻击距离值设定"));
        jl_max_attack_range = new JLabel("最大攻击距离：");
        jl_min_attack_range = new JLabel("最小攻击距离：");
        jf_max_attack_range = new JTextField(10);
        jf_min_attack_range = new JTextField(10);
        jp_attack_range.add(jl_max_attack_range);
        jp_attack_range.add(jf_max_attack_range);
        jp_attack_range.add(jl_min_attack_range);
        jp_attack_range.add(jf_min_attack_range);
        jp_attack_range.setBounds(10, 415, 250, 70);
        return jp_attack_range;
    }

    public JPanel initJpAttackType() {
        jp_attack_type = new JPanel(new GridLayout(1, 2));
        jp_attack_type.setBorder(BorderFactory.createTitledBorder("攻击类型设定"));
        jr_physical = new JRadioButton("物理攻击");
        jr_magical = new JRadioButton("魔法攻击");
        bg_attack_type = new ButtonGroup();
        bg_attack_type.add(jr_physical);
        bg_attack_type.add(jr_magical);
        jp_attack_type.add(jr_physical);
        jp_attack_type.add(jr_magical);
        jp_attack_type.setBounds(10, 490, 300, 50);
        return jp_attack_type;
    }

    public JPanel initJpAbilities() {
        jp_abilities = new JPanel();
        jp_abilities.setLayout(null);
        jp_abilities.setBorder(BorderFactory.createTitledBorder("特殊能力设定"));
        abilities = new String[]{
            "可以占领建筑物（城堡除外）",
            "在水中获得攻防属性加成",
            "在森林中获得攻防属性加成",
            "在山区获得攻防属性加成",
            "可以破坏建筑物",
            "飞行单位，无视地形以及地面单位阻挡，可被空军单位阻挡",
            "可以从墓碑中召唤骷髅战士",
            "回合开始附近单位回复血量",
            "攻击后可以继续使用一次剩余的移动力但不能攻击",
            "攻击使目标中毒每回合开始损失血量",
            "可以修复被破坏的建筑物",
            "攻击使目标降低攻击力和防御力",
            "攻击空军单位时伤害增加",
            "在水中移动消耗移动力1并每回合回复血量",
            "在森林中移动消耗移动力1并每回合回复血量",
            "在山区移动消耗移动力1并每回合回复血量",
            "在陆地上移动移动力消耗均为1",
            "攻击使目标移动力降低",
            "可以占领城堡",
            "每回合移动/攻击二选一",
            "回合开始增加附近友军攻击力",
            "回合开始增加附近友军防御力",
            "回合开始增加附近友军移动力",
            "死亡时全军回复生命值",
            "回合开始降低附近敌方防御力"};

        jl_abilities = new JList(abilities);
        jl_abilities.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jl_abilities.setBorder(BorderFactory.createTitledBorder("所有的特殊能力"));

        base_abilities = new Vector();
        learnable_abilities = new Vector();

        jl_base_abilities = new JList();
        jl_base_abilities.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jl_base_abilities.setBorder(BorderFactory.createTitledBorder("基础特殊能力"));
//        base_abilities.addElement("深思");

        jl_learnable_abilities = new JList();
        jl_learnable_abilities.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jl_learnable_abilities.setBorder(BorderFactory.createTitledBorder("可学习特殊能力"));

        sp_abilities = new JScrollPane(jl_abilities);
        sp_abilities.setBounds(290, 10, 180, 550);

        sp_base_abilities = new JScrollPane(jl_base_abilities);
        sp_base_abilities.setBounds(10, 20, 200, 250);

        sp_learnable_abilities = new JScrollPane(jl_learnable_abilities);
        sp_learnable_abilities.setBounds(10, 300, 200, 260);

        base_into = new JButton("<---");
        base_into.setBounds(220, 80, 60, 30);
        base_into.addActionListener(new Add_Abilities(this));
        base_out = new JButton("--->");
        base_out.setBounds(220, 120, 60, 30);
        base_out.addActionListener(new Add_Abilities(this));
        learnable_into = new JButton("<---");
        learnable_into.setBounds(220, 360, 60, 30);
        learnable_into.addActionListener(new Add_Abilities(this));
        learnable_out = new JButton("--->");
        learnable_out.setBounds(220, 400, 60, 30);
        learnable_out.addActionListener(new Add_Abilities(this));

        jp_abilities.add(sp_abilities);
        jp_abilities.add(sp_base_abilities);
        jp_abilities.add(sp_learnable_abilities);

        jp_abilities.add(base_into);
        jp_abilities.add(base_out);
        jp_abilities.add(learnable_into);
        jp_abilities.add(learnable_out);
//        jc_abilities = new JComboBox(str_abilities);
//        jc_abilities.setBorder(BorderFactory.createTitledBorder("自带特殊能力"));
//        str_learnable_abilities = new String[]{"None", "可以占领建筑物（城堡除外）", "在水中获得攻防属性加成", "在森林中获得攻防属性加成", "在山区获得攻防属性加成"};
//        jc_learnable_abilities = new JComboBox(str_learnable_abilities);
//        jc_learnable_abilities.setBorder(BorderFactory.createTitledBorder("可学习特殊能力"));
////        jc_abilities.setBounds(0, 0, 100, 400);
//        jp_abilities.add(jc_abilities);
//        jp_abilities.add(jc_learnable_abilities);
        return jp_abilities;
    }

    public String getJfPrice() {
        return jf_price.getText();
    }

    public String getJfMaxHpText() {
        return jf_max_hp.getText();
    }

    public String getJfHpGrowthText() {
        return jf_hp_growth.getText();
    }

    public String getJfMovementPointText() {
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

    public String getAttackType() {
        if (jr_physical.isSelected() == true) {
            return "0";
        } else if (jr_magical.isSelected() == true) {
            return "1";
        }
        return null;
    }

    public JButton getBaseInto() {
        return base_into;
    }

    public JButton getBaseOut() {
        return base_out;
    }

    public JButton getLearnableInto() {
        return learnable_into;
    }

    public JButton getLearnableOut() {
        return learnable_out;
    }

    public Vector getBaseAbilities() {
        return base_abilities;
    }

    public Vector getLearnableAbilities() {
        return learnable_abilities;
    }

    public JList getJlAbilities() {
        return jl_abilities;
    }

    public JList getJlBaseAbilities() {
        return jl_base_abilities;
    }

    public JList getJlLearnableAbilities() {
        return jl_learnable_abilities;
    }

    public void setBaseAbilitiesCounts() {
        base_abilities_counts = base_abilities.size();
    }

    public String getBaseAbilitiesCounts() {
        this.setBaseAbilitiesCounts();
        return Integer.toString(base_abilities_counts);
    }

    public void setLearnableAbilitiesCounts() {
        learnable_abilities_counts = learnable_abilities.size();
    }

    public String getLearnableAbilitiesCounts() {
        this.setLearnableAbilitiesCounts();
        return Integer.toString(learnable_abilities_counts);
    }

    public String getStrBaseAbilities() {
        str_base_abilities = "";
        for (Object base_abilitie : base_abilities) {
            str_base_abilities = str_base_abilities + "\r\n" + getStrBaseIndex((String) base_abilitie);
        }
        return str_base_abilities;
    }

    public String getStrBaseIndex(String str) {
        for (int i = 0; i < abilities.length; i++) {
            if (str.equals(abilities[i])) {
                return Integer.toString(i);
            }
        }
        return null;
    }

    public String getStrLearnableAbilities() {
        str_learnable_abilities = "";
        for (Object learnable_abilitie : learnable_abilities) {
            str_learnable_abilities = str_learnable_abilities + "\r\n" + getStrLearnableIndex((String) learnable_abilitie);
        }
        return str_learnable_abilities;
    }

    public String getStrLearnableIndex(String str) {
        for (int i = 0; i < abilities.length; i++) {
            if (str.equals(abilities[i])) {
                return Integer.toString(i);
            }
        }
        return null;
    }

    /*    public String getAbilities() {
        
     }*/
}
