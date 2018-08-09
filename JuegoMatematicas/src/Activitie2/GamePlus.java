/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activitie2;

import Auxiliar.Images;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author tady
 */
public class GamePlus {

    private Images images=new Images();
    private ImageIcon im1; 
    private int numOperation=0;
    private int hits=0;
    private int fail=0;
    private boolean end=false;
    int[] numbers=new int[9];
    
    public GamePlus() {
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public void setIm1(ImageIcon im1) {
        this.im1 = im1;
    }

    public void setNumOperation(int numOperation) {
        this.numOperation = numOperation;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void setFail(int fail) {
        this.fail = fail;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public Images getImages() {
        return images;
    }

    public ImageIcon getIm1() {
        return im1;
    }

    public int getNumOperation() {
        return numOperation;
    }

    public int getHits() {
        return hits;
    }

    public int getFail() {
        return fail;
    }

    public boolean isEnd() {
        return end;
    }
    
            
    public int[] getnumRnd(){//{}
        //int[] numbers=new int[9];
        int count =0;
        
        while(count < 9){
            Random r=new Random();
            int na=r.nextInt(9)+1;
            int nvr=0;
            
            for(int i=0;i<9;i++){
                if(numbers[i] == na){
                    nvr++;
                }
            }
            
            if(nvr<1){
                numbers[count] =na;
                count++;
            }
        }
        
        for(int i=0;i<9;i++){
            numbers[i]+=1;
        }
        
        for(int i=0;i<numbers.length;i++){
            System.out.println(" "+numbers[i]);
        }
        
        return numbers;
    }
    
    public int[] getnumRndSub(){//{}
        //int[] numbers=new int[9];
        int count =0;
        
        while(count < 9){
            Random r=new Random();
            int na=r.nextInt(9)+1;
            int nvr=0;
            
            for(int i=0;i<9;i++){
                if(numbers[i] == na){
                    nvr++;
                }
            }
            
            if(nvr<1){
                numbers[count] =na;
                count++;
            }
        }
        
        for(int i=0;i<9;i++){
            numbers[i]-=1;
        }
        
        for(int i=0;i<numbers.length;i++){
            System.out.println(" "+numbers[i]);
        }
        
        return numbers;
    }
    
    public void compare(String i,JLabel btn){
        im1=(ImageIcon) btn.getIcon();
        
        if(im1.getDescription().compareTo(i) == 0){
            JOptionPane.showMessageDialog(null,"","Has Ganado",JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Images/aplausos.gif"));
            numOperation++;
            nextOperation(btn);
            hits++;
        }
        else{
            fail++;
        }
    }
    public void compareSub(String i,JLabel btn){
        im1=(ImageIcon) btn.getIcon();
        
        if(im1.getDescription().compareTo(i) == 0){
            JOptionPane.showMessageDialog(null,"","Has Ganado",JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Images/aplausos.gif"));
            numOperation++;
            nextOperationSub(btn);
            hits++;
        }
        else{
            fail++;
        }
    }
    
    public void nextOperation(JLabel lblOperations){
        if(numOperation<9){
            images.setBalls(lblOperations,numbers[numOperation]);
        }else{
            JOptionPane.showMessageDialog(null,"","Has Ganado",JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Images/endActivity.png"));
            hits++;
            System.out.println("aciertos= "+hits+"  fallos="+fail);
            end=true;
        }
    }
    
    public void nextOperationSub(JLabel lblOperations){
        if(numOperation<9){
            images.setBallsSub(lblOperations,numbers[numOperation]);
        }else{
            JOptionPane.showMessageDialog(null,"","Has Ganado",JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Images/endActivity.png"));
            hits++;
            System.out.println("aciertos= "+hits+"  fallos="+fail);
            end=true;
        }
    }

    public boolean endGame(ArrayList<JButton> balls){
        if(end){
            for(int i=0;i<balls.size();i++)
                balls.get(i).setEnabled(false);
        }
        return end;
    }
    
}
