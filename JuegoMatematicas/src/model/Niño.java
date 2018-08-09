/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author bombe
 */
public class Niño {
    private String name;
    private double act1;
    private double act2;
    private double act3;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the act1
     */
    public double getAct1() {
        return act1;
    }

    /**
     * @param act1 the act1 to set
     */
    public void setAct1(double act1) {
        this.act1 = act1;
    }

    /**
     * @return the act2
     */
    public double getAct2() {
        return act2;
    }

    /**
     * @param act2 the act2 to set
     */
    public void setAct2(double act2) {
        this.act2 = act2;
    }

    /**
     * @return the act3
     */
    public double getAct3() {
        return act3;
    }

    /**
     * @param act3 the act3 to set
     */
    public void setAct3(double act3) {
        this.act3 = act3;
    }


    public Niño(String name, double act1, double act2, double act3) {
        this.name = name;
        this.act1 = act1;
        this.act2 = act2;
        this.act3 = act3;
    }
    
    public Niño() {
        
    }
   
} 