package fileoperationsnew;

import java.io.FileWriter;
import java.io.IOException;

public class ReplaceStringInAFile extends CopyContentOfFile {
	public static void main (String [] args) throws IOException{
		

        String oldtext = "Employer";
        
		String s  = oldtext.replaceAll("Employee", "Employer");
        

        FileWriter fw = new FileWriter("C://Users//Mohan//Desktop//Java//ProgramCopy.txt");
       fw.write(s);;


        fw.close();
	}

}
