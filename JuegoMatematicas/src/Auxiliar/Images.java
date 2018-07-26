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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kalex
 */
public class Images {
    
    Image im;
    //DAR LAS IMAGENES A LAS CARTAS
    public void setCards(JButton btn,int numbers[],int i){
        if(numbers[i]==1 || numbers[i]==2 || numbers[i]==3 || numbers[i]==4){   
            if(numbers[i]==1){
                setCardsB(btn,numbers[i]);
                for(int j=0;j<numbers.length;j++){
                    if(numbers[j]==1){
                        numbers[j]=11;
                    }
                }
            }
            if(numbers[i]==2){
                setCardsB(btn,numbers[i]);
                for(int j=0;j<numbers.length;j++){
                    if(numbers[j]==2){
                        numbers[j]=22;
                    }
                }
            }
            if(numbers[i]==3){
                setCardsB(btn,numbers[i]);
                for(int j=0;j<numbers.length;j++){
                    if(numbers[j]==3){
                        numbers[j]=33;
                    }
                }
            }
            if(numbers[i]==4){
                setCardsB(btn,numbers[i]);
                for(int j=0;j<numbers.length;j++){
                    if(numbers[j]==4){
                        numbers[j]=44;
                    }
                }
            }
        }
        else{
            setCardsB(btn,numbers[i]);
        }
        
        //btn.setDisabledIcon(new ImageIcon(getClass().getResource("../Images/c"+numbers[i]+".png")));
    }
    
    //DAR LA IMAGEN A LA ESPALDA DE LA CARTA CON TAMAÑO CORRECTO
    public void setCardsBackward(JButton btn){
        ImageIcon img=new ImageIcon ("src/Images/card.png");
        Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIcon(icono);
    }
    
    public void setCardsB(JButton btn,int i){
        
        if(i==1 || i==2 || i==3 || i==4){ 
            ImageIcon img=new ImageIcon ("src/Images/"+i+".png");
            img.setDescription(String.valueOf(i));
            //Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
            btn.setDisabledIcon(img);
        }
        else{
            if(i==11){
                ImageIcon img=new ImageIcon ("src/Images/"+i+".png");
                img.setDescription("1");
                //Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
                btn.setDisabledIcon(img);
            }
            if(i==22){
                ImageIcon img=new ImageIcon ("src/Images/"+i+".png");
                img.setDescription("2");
                //Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
                btn.setDisabledIcon(img);
            }
            if(i==33){
                ImageIcon img=new ImageIcon ("src/Images/"+i+".png");
                img.setDescription("3");
                //Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
                btn.setDisabledIcon(img);
            }
            if(i==44){
                ImageIcon img=new ImageIcon ("src/Images/"+i+".png");
                img.setDescription("4");
                //Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
                btn.setDisabledIcon(img);
            }
            
        }
    }
    
    public void setLbl(JLabel btn,String nombre){
        ImageIcon img=new ImageIcon ("src/Images/"+nombre+".png");
        Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIcon(icono);
    }
    
    public void setBtn(JButton btn,String nombre){
        ImageIcon img=new ImageIcon ("src/Images/"+nombre+".png");
        Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIcon(icono);
    }
    
    public void setFrame(JFrame btn,String nombre){
        ImageIcon img=new ImageIcon ("src/Images/"+nombre+".png");
        Icon icono=new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIconImage(img.getImage());
    }
    
}
