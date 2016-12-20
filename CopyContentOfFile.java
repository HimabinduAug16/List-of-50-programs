package fileoperationsnew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentOfFile {
	public static void main (String [] args) throws IOException{
		File file = new File("C://Users//Mohan//Desktop//Java//ThisKeyword.txt");
        file.createNewFile();  // create a folder
        File file1 = new File("C://Users//Mohan//Desktop//Java//Copy.txt");
        file1.createNewFile();
        FileReader fr = new FileReader("C://Users//Mohan//Desktop//Java//ThisKeyword.txt");
        FileWriter fw = new FileWriter("C://Users//Mohan//Desktop//Java//ProgramCopy.txt");
         BufferedReader br = new BufferedReader(fr);
         BufferedWriter bw = new BufferedWriter (fw);
         String line;
         while((line = br.readLine())!=null){
        	 bw.write(line);  // to write new line
        	 
        	bw.newLine(); // for new line
         }
         br.close();
         bw.close();
         fr.close();
         fw.close();
         
         }
}
