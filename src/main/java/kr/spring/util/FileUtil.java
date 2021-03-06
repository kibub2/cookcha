package kr.spring.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

public class FileUtil {


	public static String UPLOAD_PATH="C:/Users/kibub2/Documents/cookcha/src/main/webapp/upload";

	
	public static String rename(String fileName)throws Exception{

		if(fileName==null) return null;

		String newName = Long.toString(System.currentTimeMillis())+(int)(Math.random()*50);

		return rename(fileName,newName);
	}
	public static String rename(String fileName,String newName)
			throws Exception{
		if(fileName == null) return null;

		File file = new File(UPLOAD_PATH,fileName);


		int idx = fileName.lastIndexOf(".");

		String extention = "";
		String newFileName = "";

		if(idx !=-1){
			extention = fileName.substring(idx);
		}

		int newIdx = newName.lastIndexOf(".");
		if(newIdx !=-1){
			newName = newName.substring(0,newIdx);
		}

		//�솗�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝�떥�슱�삕 �뜝�룞�삕�뜝�떦紐뚯삕
		newFileName = newName + extention.toLowerCase();

		File fs = new File(UPLOAD_PATH,newFileName);
		file.renameTo(fs); //�뜝�룞�삕�뜝�떦紐뚯삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕


		return newFileName;
	}
	public static void removeFile(String fileName){
		if(fileName != null){
			File file = new File(UPLOAD_PATH,fileName);
			if(file.exists()) file.delete();
		}
	}

	public static String createThumbnail(String uploadedFile,int thumbnailWidth, int thumbnailHeight){
		return createThumbnail(uploadedFile, null, thumbnailWidth, thumbnailHeight);
	}
	
	public static String createThumbnail(String uploadedFile,String thumbnailFile,int thumbnailWidth, int thumbnailHeight){
		if(thumbnailFile==null){
			int index = uploadedFile.lastIndexOf(".");

			if(index !=-1){//�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝占� �솗�뜝�룞�삕�뜝�뙓�뙋�삕 jpg�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕

				thumbnailFile = "s" + uploadedFile.substring(0,index) + ".jpg";
			}
		}else{
			int index = thumbnailFile.lastIndexOf(".");

			if(index !=-1){//�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝占� �솗�뜝�룞�삕�뜝�뙓�뙋�삕 jpg�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕

				thumbnailFile = thumbnailFile.substring(0,index) + ".jpg";
			}
		}
		
		FileInputStream fs = null; 
		try { 
			fs = new FileInputStream(UPLOAD_PATH+"/"+uploadedFile);
			BufferedImage im = ImageIO.read(fs);

			int width;
			int height;


			if(thumbnailHeight == 0){//占쏙옙占싱몌옙 0占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占� 占쏙옙占싱몌옙 

				int radio = im.getWidth() / thumbnailWidth;//占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙


				width = thumbnailWidth;
				height = im.getHeight() / radio;
			}else{
				width = thumbnailWidth;
				height = thumbnailHeight;
			}

			BufferedImage thumb = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D 	g2 = thumb.createGraphics();

			g2.drawImage(im.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, width, height, null);
			ImageIO.write(thumb, "jpg", new File(UPLOAD_PATH,thumbnailFile));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fs!=null)try {fs.close();} catch (IOException e) {}
		}
		return thumbnailFile;
	}
}
