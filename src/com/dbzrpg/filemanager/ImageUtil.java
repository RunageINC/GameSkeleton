package com.dbzrpg.filemanager;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageUtil {

	private static final String BATTLERS_PATH = "res/battlers/";
	
	public static ImageIcon loadImg(String file) {
		BufferedImage originalImg;
		
		try {
			originalImg = ImageIO.read(new File(BATTLERS_PATH + file));
			ImageIcon icon = new ImageIcon(resizeImage(originalImg, 120, 200));
			
			return icon;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Imagem não encontrada!");
			return null;
		}
	}
	
	public static ImageIcon loadEnergyIcon() {
		BufferedImage originalImg;
		try {
			originalImg = ImageIO.read(new File("res/icons/energyIcon.jpg"));
			ImageIcon icon = new ImageIcon(resizeImage(originalImg, 30, 30));
			return icon;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
	    BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
	    Graphics2D graphics2D = resizedImage.createGraphics();
	    graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
	    graphics2D.dispose();
	    return resizedImage;
	}
}
