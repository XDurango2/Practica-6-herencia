/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class CanvasImagen extends Canvas {

   private BufferedImage image;

   public CanvasImagen() {
  	try {
     	// Cargar la imagen desde el archivo PNG
     	image = ImageIO.read(new File("intel.jpg"));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
   }

   public void paint(Graphics g) {
  	// Dibujar la imagen en el objeto Canvas
  	g.drawImage(image, 10, 10, 50,50,(ImageObserver)this);
   }

   public static void main(String[] args) {
    	CanvasImagen canvas1 = new CanvasImagen();
  	Frame frame = new Frame();
  	frame.setSize(300, 300);
  	frame.add(canvas1);
  	frame.setVisible(true);
   }

}
