/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 *
 * @author kalex
 */
public class Sound {
    private Clip clip;
    private String ruta="/Audio/";
    private String archivo;
    
    public Sound(String archivo){
        this.archivo=archivo;
    }
    
    public void play(){
        try{
            clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        }catch(Exception e){
        
        }
    }
    
    public void stop(){
        try{
            clip.stop();
        }catch(Exception e){
        
        }
    }
}
