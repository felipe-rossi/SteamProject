package Suporte;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Screenshot {

    public static void takeScrennshot(String nomePrint){
        try{
            Robot rb = new Robot();
            Rectangle rct = new Rectangle(1920,1080);

            BufferedImage screenshot = rb.createScreenCapture(rct);
            ImageIO.write(screenshot,"PNG", new File("D:\\Prints\\" + nomePrint + ".png"));


        }catch (Exception e){
            System.out.println("Erro ao tirar print da tela");
        }


    }
}
