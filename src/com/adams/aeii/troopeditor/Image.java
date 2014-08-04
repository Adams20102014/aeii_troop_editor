/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adams.aeii.troopeditor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author st000120
 */
public class Image {

    private static BufferedImage[] units;
    private BufferedImage troop_image;
    private File unit_icons;
    private final int unit_count = 12;
    private int i;
    private int x;
    private final int y = 0;
    private final int width = 24;
    private final int height = 24;
    private JPanel jp_image;
    private JLabel jl_image;
             
    public static BufferedImage getImageClip(BufferedImage source, int x, int y, int width, int height) {
        BufferedImage clip = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        clip.getGraphics().drawImage(source, -x, -y, null);
        return clip;
    }

    public void getUnits() throws IOException {
        unit_icons = new File("image/unit_icons.png");

        for (i = 0; i < unit_count; i++) {
            x = 24 * i;
            units[i] = getImageClip(ImageIO.read(unit_icons), x, y, width, height);
        }
    }

    public void setTroopImage(String troop) {
        switch (troop) {
            case "unit_0":
                troop_image = units[0];
                break;
            case "unit_1":
                troop_image = units[1];
                break;
            case "unit_2":
                troop_image = units[2];
                break;
            case "unit_3":
                troop_image = units[3];
                break;
            case "unit_4":
                troop_image = units[4];
                break;
            case "unit_5":
                troop_image = units[5];
                break;
            case "unit_6":
                troop_image = units[6];
                break;
            case "unit_7":
                troop_image = units[7];
                break;
            case "unit_8":
                troop_image = units[8];
                break;
            case "unit_9":
                troop_image = units[9];
                break;
            default:
                troop_image = units[10];
                break;
        }
    }

    public JPanel initJpImage() throws IOException {
        jp_image = new JPanel();
        jp_image.setBorder(BorderFactory.createTitledBorder("兵种图片显示："));
        ImageIcon imageIcon = new ImageIcon(troop_image);
        jl_image = new JLabel(imageIcon);
        jp_image.add(jl_image);
        return jp_image;
    }

}
