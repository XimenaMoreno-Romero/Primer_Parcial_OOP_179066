package PixelArt;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GeneradorImage {
	 static Color rosaOP = new Color(188,3,88,255);
	 static Color rosaClaro = new Color(254,167,222,255);
	 static Color Brown = new Color(156,90,60);
	 static Color rosaBrillo=new Color(254,105,177,255);
	 static Color rosaChillon=new Color(254,23,156,255);
	 static Color rojoOP=new Color(202,0,0,255);
	 static Color rosaRojo=new Color(255,82,93,255);
	 static Color moradoOP= new Color (110,0,26,255);
	 
	 
	 
	 
	    public static BufferedImage Imagen1(){
	        int width = 800, height = 800, PIXEL_SIZE = 40;
	        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2D = bufferedImage.createGraphics();
	        ImagenConfig.fondo(bufferedImage, Color.WHITE);
	        ImagenConfig.cuadricula(bufferedImage, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 2, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 4, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 2, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 13, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14, 6, PIXEL_SIZE);
	       
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 2, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 13, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14, 7, PIXEL_SIZE);
	       
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 2, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 13, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 14,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 15, 8, PIXEL_SIZE);
	       
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 2, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 5, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 6, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 10, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 11, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 13, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 14, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 15,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 16,9 , PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 2, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,6, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 13, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 14, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 15, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 16,10 , PIXEL_SIZE);
	       
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,6, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 11, PIXEL_SIZE);

	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 13, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 14, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 15, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 16,11 , PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,6, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 12, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13,12 , PIXEL_SIZE);
	       ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 15,12 , PIXEL_SIZE);
	     
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 3, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,6, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 13, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 14, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 15, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 16,13 , PIXEL_SIZE);

	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3,14 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 4, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,7, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 8, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 12, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,14 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 13, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 14, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 15, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 16,14 , PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3,15 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,15 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 5, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 6, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,8, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 12, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 10, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 11, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,15 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 13, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 14, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 15, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 16,15 , PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 3, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 4, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 7, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro,8, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaClaro, 9, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 11, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 12, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 13, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 14, 16, PIXEL_SIZE);    
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 15,16 , PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 1,17 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,17 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,17 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,17 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,17 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 2, 17, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 3, 17, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 4, 17, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo,5, 17, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 6, 17, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,17 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 13, 17, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, rosaBrillo, 12, 17, PIXEL_SIZE);    
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14,17 , PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,18 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13,18 , PIXEL_SIZE);
	  
	        
	        
	        
	        
	        return bufferedImage;
	    }
	    public static BufferedImage Imagen2(){
	        int width = 800, height = 800, PIXEL_SIZE = 40;
	        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2D = bufferedImage.createGraphics();
	        ImagenConfig.fondo(bufferedImage, Color.WHITE);
	        ImagenConfig.cuadricula(bufferedImage, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,3 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,3 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,3 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,3 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,4 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,4 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,4 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,4 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,4 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,4 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,5 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,5 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,5 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,5 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,6 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,6 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 7,6 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 8,6 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,6 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,6 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 5,7 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 6,7 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 7,7 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 8,7 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 9,7 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 10,7 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13,18 , PIXEL_SIZE);
	  
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 6,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 7,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 8,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 9,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,8 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,8 , PIXEL_SIZE);

	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,9 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,9 , PIXEL_SIZE);
	        
	       
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,10 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13,10 , PIXEL_SIZE);
	     

	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,11 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13,11 , PIXEL_SIZE);
	     

	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 2, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3,12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,12 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13,12 , PIXEL_SIZE);
	     
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11,13 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12,13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 13, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5,14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,14 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7,14 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8,14 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9,14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,14 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 6,15 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 10,15 , PIXEL_SIZE);
	       
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 5,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 6,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 7,16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 9,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 10,16 , PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 11,16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.ORANGE, 7, 16, PIXEL_SIZE);
	        
	  
	        
	        
	        
	        
	        
	  
	        
	  
	        return bufferedImage;
	    }
	    public static BufferedImage Imagen3(){
	        int width = 800, height = 800, PIXEL_SIZE = 40;
	        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2D = bufferedImage.createGraphics();
	        ImagenConfig.fondo(bufferedImage, Color.WHITE);
	        ImagenConfig.cuadricula(bufferedImage, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5, 3, PIXEL_SIZE);
	      
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6,14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 7, 15, PIXEL_SIZE);
	        
	        
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 8, 16, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.GREEN, 9, 15, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 12, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 13, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10,14, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 15, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 3, PIXEL_SIZE);
	        
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 16, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 17, PIXEL_SIZE);
	        
	        return bufferedImage;
	    }
	    public static BufferedImage Imagen4(){
	        int width = 800, height = 800, PIXEL_SIZE = 40;
	        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2D = bufferedImage.createGraphics();
	        ImagenConfig.fondo(bufferedImage, Color.WHITE);
	        ImagenConfig.cuadricula(bufferedImage, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12, 3, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 6, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 7, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 12, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13, 4, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 5, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 6, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 7, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 12, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 13, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14, 5, PIXEL_SIZE);
	        
	       
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 5, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 12, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 6, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 7, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10,6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 13, 6, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14, 6, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 5, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 6, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 7, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 13, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 12, 7, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 14, 7, PIXEL_SIZE);
	        
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 6, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 7, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 12, 8, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13, 8, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 7, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 11, 9, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12, 9, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 10, 10, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 10, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 11, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 12, PIXEL_SIZE);
	        
	        
	        
	        return bufferedImage;
	    }
	    public static BufferedImage Imagen5(){
	        int width = 800, height = 800, PIXEL_SIZE = 40;
	        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2D = bufferedImage.createGraphics();
	        ImagenConfig.fondo(bufferedImage, Color.WHITE);
	        ImagenConfig.cuadricula(bufferedImage, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 7, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 8, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 10, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 3, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 9, 3, PIXEL_SIZE);
	        
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 5, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 11, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 12, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 13, 4, PIXEL_SIZE);
	        
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 3, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 4, 5, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.BLACK, 6, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 8, 4, PIXEL_SIZE);
	        ImagenConfig.Pixel(bufferedImage, Color.RED, 9, 4, PIXEL_SIZE);
	        return bufferedImage;
	    }

}

