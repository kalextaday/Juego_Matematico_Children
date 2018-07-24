/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author kalex
 */
public class Images {
    
    //DAR LAS IMAGENES A LAS CARTAS
    public void setCards(JButton btn,int numbers[],int i){
        btn.setDisabledIcon(new ImageIcon(getClass().getResource("../Images/c"+numbers[i]+".png")));
    }
    
    //DAR LA IMAGEN A LA ESPALDA DE LA CARTA CON TAMAÑO CORRECTO
    public void setCardsBackward(JButton btn){
        ImageIcon img=new ImageIcon ("src/Images/card.png");
        Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIcon(icono);
    }
    
}
