/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameConectPoints;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author tady
 */
public class GameConect {
    
    private int indexBtns=1;
    private int auxBtn=0;
    
    private ArrayList<JButton> points=new ArrayList<JButton>();

    public GameConect(ArrayList<JButton> points) {
        this.points=points;
    }

    public void setIndexBtns(int indexBtns) {
        this.indexBtns = indexBtns;
    }

    public void setAuxBtn(int auxBtn) {
        this.auxBtn = auxBtn;
    }

    public int getIndexBtns() {
        return indexBtns;
    }

    public int getAuxBtn() {
        return auxBtn;
    }
    
    public void paint(Graphics g,JButton b1,JButton b2) {
        int widht=b1.getWidth();
        int height=b1.getHeight();
        Point p1=new Point(b1.getLocation());
        Point p2=new Point(b2.getLocation());
        
        if (g instanceof Graphics2D)
        {
            Graphics2D g2 = (Graphics2D)g;
            g2.setColor(Color.YELLOW);
            g2.setStroke(new BasicStroke(5.0f)); // grosor de 5 pixels
            g2.drawLine (p1.x, p1.y, p2.x, p2.y);
        }
    }
    
    public void Link(Graphics g){
        paint(g, points.get(--auxBtn), points.get(--indexBtns));
        points.get(++indexBtns).setEnabled(true);
        points.get(++auxBtn).setEnabled(false);
        auxBtn++;
        indexBtns++;
    }
    
}
