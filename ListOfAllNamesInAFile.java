package fileoperationsnew;

import java.io.File;

public class ListOfAllNamesInAFile {
	public static void main(String [] args){
		int count = 0;  // no of files
		File file = new File("C://Users//Mohan//Desktop//Java");
		String [] s = file.list();  //use list method
		
		for(String s1:s){ // for every string in s list
			File file1=new File(file, s1); 
			if(file1.isFile()){
				count++;
				
				System.out.println(s1);
			
				
			}
				
				
			}
			System.out.println("No. of files =  "+count);
		}
		
}

