package PixelArt;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagenConfig {
	public static void fondo(BufferedImage image, Color color){
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setColor(color);
        graphics2D.fillRect(0,0,image.getWidth(), image.getHeight());
    }
    public static void cuadricula(BufferedImage image, int pixelSize){
        Graphics2D graphics2D = image.createGraphics();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                graphics2D.setColor(Color.black);
                graphics2D.drawRect(i * pixelSize, j * pixelSize, pixelSize, pixelSize);
            }
        }
    }
    public static void Pixel(BufferedImage image, Color color, int x, int y, int pixelsize){
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setColor(color);
        graphics2D.fillRect(x*pixelsize, y*pixelsize, pixelsize, pixelsize);
    }
}
