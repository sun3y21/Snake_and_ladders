package mp3player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javazoom.jl.player.*;

/**
 *
 * @author SUNNNY SAINI
 */
public class Mp3player {

    /**
     * @param args the command line arguments
     */
    public static void play(){
        try{
            File file=new File("C:\\Users\\SUNNY\\Desktop\\Snake_Ladder\\src\\mp3player\\Snake.mp3");
           FileInputStream fis=new FileInputStream(file);
           BufferedInputStream bis=new BufferedInputStream(fis);
           try{
           Player player=new Player(bis);
           
           player.play();
           }catch(Exception e){}
        
        }
        catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
    }
    
}
