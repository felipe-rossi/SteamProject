package Suporte;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Screenshot {

    public static void takeScrennshot(){
        try{
            Robot rb = new Robot();
            Rectangle rct = new Rectangle(1920,1080);

            BufferedImage screenshot = rb.createScreenCapture(rct);




        }catch (Exception e){
            System.out.println("Erro ao tirar print da tela");
        }


    }
}
