/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activitie1;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author tady
 */
public class GameCount {
    private int numObjs;
    private int count=0;

    public void setNumObjs(int numObjs) {
        this.numObjs = numObjs;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumObjs() {
        return numObjs;
    }

    public int getCount() {
        return count;
    }


    public GameCount(int numObjs) {
        this.numObjs=numObjs;
    }

    public void showCheck(){  //{}
        if(numObjs == count){
            JOptionPane.showMessageDialog(null,"","Muy Bien Hecho",JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Images/aplausos.gif"));
        }
    }
    
}
