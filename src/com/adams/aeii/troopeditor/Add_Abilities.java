/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adams.aeii.troopeditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author s1407003
 */
public class Add_Abilities  implements ActionListener{

    private Troop_Attribute ta;
    
    public Add_Abilities (Troop_Attribute ta) {
        this.ta = ta;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ta.getBaseInto()) {
            if(ta.getJlAbilities().isSelectionEmpty() == false) {
//                System.out.println(ta.getJlAbilities().getSelectedValue());
                ta.getBaseAbilities().add(ta.getJlAbilities().getSelectedValue());
                ta.getJlBaseAbilities().setListData(ta.getBaseAbilities());
//                ta.getJlAbilities().setSelectedValue(null, true);
            } else {    
            }
        }else if(e.getSource() == ta.getBaseOut()) {
             if(ta.getJlBaseAbilities().isSelectionEmpty() == false) {
//                System.out.println(ta.getJlAbilities().getSelectedValue());
                ta.getBaseAbilities().removeElement(ta.getJlBaseAbilities().getSelectedValue());
                ta.getJlBaseAbilities().setListData(ta.getBaseAbilities());
            } else {    
            }
        }else if(e.getSource() == ta.getLearnableInto()) {
             if(ta.getJlAbilities().isSelectionEmpty() == false) {
//                System.out.println(ta.getJlAbilities().getSelectedValue());
                ta.getLearnableAbilities().add(ta.getJlAbilities().getSelectedValue());
                ta.getJlLearnableAbilities().setListData(ta.getLearnableAbilities());
            } else {    
            }
        }else if(e.getSource() == ta.getLearnableOut()) {
             if(ta.getJlLearnableAbilities().isSelectionEmpty() == false) {
//                System.out.println(ta.getJlAbilities().getSelectedValue());
                ta.getLearnableAbilities().removeElement(ta.getJlLearnableAbilities().getSelectedValue());
                ta.getJlLearnableAbilities().setListData(ta.getLearnableAbilities());
            } else {    
            }
        }
    }
    
}
