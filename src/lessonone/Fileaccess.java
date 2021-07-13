package lessonone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fileaccess {
	
	public void openImage(String filepath) {
		File file = new File("C:\\learning\\logo.jpeg");
		try {
		FileInputStream fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		Fileaccess fileaccess = new Fileaccess();
		fileaccess.openImage(" ");
	}

}
