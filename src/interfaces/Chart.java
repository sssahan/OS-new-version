package interfaces;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Chart extends Canvas{     
    
   
    
    public Chart(){       
        this.setIgnoreRepaint(true); 		
    }
    
    public void drawScreen(int noOfP) {
        Graphics2D g = (Graphics2D) this.getGraphics();	
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+String.valueOf(noOfP)+".png"));            
        } catch (IOException ex) {
            System.out.println("dasdasd");
        }       
        g.drawImage(image, 0, 0,this);         
        //rect(51+45,19+27,Color.RED);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }   
    
    public void drawQueue(String name) {
        Graphics2D g = (Graphics2D) this.getGraphics();	
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+name+".png"));            
        } catch (IOException ex) {
            System.out.println("dasdasd");
        }       
        g.drawImage(image, 0, 0,this);         
        //rect(51+45,19+27,Color.RED);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }   
    
    public void rect(int x,int y,String l) {
        Graphics2D g = (Graphics2D) this.getGraphics();
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+l+".png"));            
        } catch (IOException ex) {
            System.out.println("dasdasd");
        }       
        g.drawImage(image, x, y,this);          
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
}
