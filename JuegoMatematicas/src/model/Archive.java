/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bombe
 */
public class Archive {
    //Calendar today = Calendar.getInstance();
    //System.out.println("Today is " + today.getTime());
    public static void saveChild(Niño n){
        FileWriter fw;
        PrintWriter pw;
        Calendar today = Calendar.getInstance();
        String name=n.getName();
        System.out.println(name);
        double a1=n.getAct1();
        double a2=n.getAct2();
        double a3=n.getAct3();
        String day = Integer.toString(today.get(Calendar.DATE));
        String month = Integer.toString(today.get(Calendar.MONTH)+1);
        String year = Integer.toString(today.get(Calendar.YEAR));
        String hour = Integer.toString(today.get(Calendar.HOUR));
        String minute = Integer.toString(today.get(Calendar.MINUTE));
        try{
            fw=new FileWriter("Ninos.txt",true);
            pw=new PrintWriter(fw);
            pw.write(day+"/"+month+"/"+year+";"+hour+":"+minute+";"+name+";"+a1+";"+a2+";"+a3);
            pw.write("\r\n");
            pw.close();
        }catch(IOException ex){
            ex.printStackTrace();
            
        }
    }
     public DefaultTableModel listUsers(){
      Vector cabeceras = new Vector();
      cabeceras.addElement("Fecha");
      cabeceras.addElement("Hora");
      cabeceras.addElement("Nombre");
      cabeceras.addElement("Actividad1");
      cabeceras.addElement("Actividad2");
      cabeceras.addElement("Actividad3");
      
      DefaultTableModel mdlTable= new DefaultTableModel(cabeceras,0);
      
     try{
         FileReader fr=new FileReader("Ninos.txt");
         BufferedReader br = new BufferedReader(fr);
         String d;
         while((d=br.readLine())!=null){
             StringTokenizer dato = new StringTokenizer(d,";");
             Vector x=new Vector();
             while(dato.hasMoreTokens()){
                 x.addElement(dato.nextToken());
         }
             mdlTable.addRow(x);
         
         }
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
     return mdlTable;
    }
}
