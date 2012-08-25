package read.from.disk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class readFileNReverse {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("test.txt"));
		
		String s1 = in.readLine();

		String s2 = null;
		int temp = s1.length();
		
		for (int i=s1.length(); i>0; i--){
			if(s1.charAt(i-1)== ' '){
				
				s2 = s1.substring(i,temp);
				temp = i;
				System.out.print(s2 + " ");
			}
			if((i-1)==0){
				s2 = s1.substring(i-1,temp);
				System.out.print(s2 + " ");
			}
		}
		
	}
}
