/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adams.aeii.troopeditor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author st000120
 */
public final class Image {

    private static BufferedImage[] units;
    private BufferedImage troop_image;
    private final int unit_count = 12;
    private int i;
    private int x;
    private final int y = 0;
    private final int width = 24;
    private final int height = 24;

//    public  BufferedImage getImageClip(BufferedImage source, int x, int y, int width, int height) {
//        BufferedImage clip = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//        clip.getGraphics().drawImage(source, -x, -y, null);
//        return clip;
//    }
    public Image() throws IOException {
        this.getUnits();
    }

    public void getUnits() throws IOException {
        BufferedImage img_unit = ImageIO.read(getClass().getResource("image\\unit_icons.png"));
        units = new BufferedImage[12];
        for (i = 0; i < unit_count; i++) {
            x = 24 * i;
            BufferedImage clip = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            clip.getGraphics().drawImage(img_unit, -x, y, null);
            units[i] = clip;
        }
    }

    public void setTroopImage(String troop) {
//        System.out.println(troop);
        switch (troop) {
            case "unit_0.dat":
                troop_image = units[0];
//                System.out.println("0");
                break;
            case "unit_1.dat":
                troop_image = units[1];
                break;
            case "unit_2.dat":
                troop_image = units[2];
//                System.out.println("2");
                break;
            case "unit_3.dat":
                troop_image = units[3];
                break;
            case "unit_4.dat":
                troop_image = units[4];
                break;
            case "unit_5.dat":
                troop_image = units[5];
//                System.out.println("5");
                break;
            case "unit_6.dat":
                troop_image = units[6];
                break;
            case "unit_7.dat":
                troop_image = units[7];
                break;
            case "unit_8.dat":
                troop_image = units[8];
                break;
            case "unit_9.dat":
                troop_image = units[9];
                break;
            default:
                troop_image = units[10];
                break;
        }
    }

    public ImageIcon getTroopImage() {
        ImageIcon imageIcon = new ImageIcon(troop_image);
        return imageIcon;
    }

}
