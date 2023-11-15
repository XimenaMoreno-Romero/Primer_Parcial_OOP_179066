package PixelArt;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.List;
public class Guardador {
	  public static void guadadorIMagen() {
	        try {
	            BufferedImage bufferedImage = GeneradorImage.Imagen1();
	            ImageIO.write(bufferedImage, "jpg", new File("imagen1.jpg"));
	            bufferedImage = GeneradorImage.Imagen2();
	            ImageIO.write(bufferedImage, "jpg", new File("imagen2.jpg"));
	            bufferedImage = GeneradorImage.Imagen3();
	            ImageIO.write(bufferedImage, "jpg", new File("imagen3.jpg"));
	            bufferedImage = GeneradorImage.Imagen4();
	            ImageIO.write(bufferedImage, "jpg", new File("imagen4.jpg"));
	            bufferedImage = GeneradorImage.Imagen5();
	            ImageIO.write(bufferedImage, "jpg", new File("imagen5.jpg"));


	        }catch (IOException e){
	            e.printStackTrace();
	        }
	    }

}
