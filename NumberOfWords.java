package fileoperationsnew;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NumberOfWords {
	

	
		public static void main(String [] args) throws IOException{
			
			
			int [] Words = {};
			int count = 0;
			String line;
			FileReader fr  = new FileReader("C://Users//Mohan//Desktop//Java//ProgramCopy.txt");
			BufferedReader br = new BufferedReader (fr);
			 while((line = br.readLine()) != null){
				 for(count = 0; count<Words.length;count++){
						
				 System.out.println(count);
				 br.close();
				}
					
					
				}
				System.out.println(line);
			}
}	
	


