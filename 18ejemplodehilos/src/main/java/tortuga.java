
import static java.lang.Thread.sleep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alfredo
 */
import java.util.loggin.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;


public class tortuga extends Thread {
    
    public void run(){
        for(in i = 0; i < 100; i++){
            System.out.println("avanza la tortuga"+i);
            
            try{
                sleep(300);
            }catch(InterruptedException ex){
                logger.getLogger(tortuga.class.getName()). log(Level.SERVERE,null,ex);
            }
        }
        System.out.println("Termino Tortuga");
    }
    
}
    