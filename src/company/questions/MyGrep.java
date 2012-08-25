package company.questions;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;


public class MyGrep {

	public static void main(String[] args) {
		new MyGrep();

	}

	public MyGrep() {
		System.out.println("Enter pattern");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int pHash = pHashCalc(s, s.length());
		System.out.println("Pattern Hash: " + pHash);
		
		
		System.out.println("Enter filename");
		Scanner in2 = new Scanner(System.in);
		String s2 = in2.next();
		String data = readFile(s2);
		int[] fHash = fHashCalc(data, s.length());
		
		for(int i=0; i<fHash.length; i++){
			System.out.println(fHash[i]);
			if(fHash[i] == pHash) System.out.println("PATTERN MATCHED");
		}
			
		
	}
	
	public String readFile(String s2){
		    File file = new File(s2);
		    int ch;
		    StringBuffer strContent = new StringBuffer("");
		    FileInputStream fin = null;
		    try {
		      fin = new FileInputStream(file);
		      while ((ch = fin.read()) != -1)
		        strContent.append((char) ch);
		      fin.close();
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		    return strContent.toString();
	}
	
	public int pHashCalc(String s, int len){
		int hash=0;
		for(int i=0; i<len; i++){
			hash += (int)s.charAt(i);
		}
		return hash;
	}
	
	public int[] fHashCalc(String s, int len){
		int[] hash= new int[s.length()-len+1];
		
		for(int i=0; i<len;i++){
			hash[0] += (int)s.charAt(i);
		}
		
		;
		for(int j=len, k = 1; j < s.length(); j++, k++){
			hash[k] = hash[k-1] - (int)s.charAt(k-1) + (int)s.charAt(len+1);
		}
			
		return hash;
	}

}
