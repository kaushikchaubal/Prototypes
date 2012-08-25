package java.basics;
import java.util.ArrayList;
import java.util.Scanner;


public class ScanInData {

	public static void main(String[] args) {
		new ScanInData();
	}

/*	public ScanInData() {
		System.out.println("Enter Data: ");
		Scanner in  = new Scanner(System.in);
		in.useDelimiter("[\n]");
		
		String data = in.next();
		System.out.println(data);
		
		ArrayList<String> input = new ArrayList<String>();
		int oldIndex = 0;
		for(int i=0; i<data.length(); i++){
			if(data.charAt(i) == ' '){
				String temp = data.substring(oldIndex, i);
				oldIndex = i;
				oldIndex++;
				input.add(temp);
			}
			if(i == data.length()-1){
				System.out.println("IM HERE");
				String temp = data.substring(oldIndex, data.length()-1);
				input.add(temp);
			}
		}
		
		System.out.println(input);
		
	}
*/
	
/*	public ScanInData(){
		Scanner keyboard= new Scanner(System.in);
		System.out.println("enter the string to be sorted");
		String orig= keyboard.nextLine();

		String original[]= orig.split(" ");


		int leng=original.length;
	
		try{
			for(int i=0;i<leng;i++){
				System.out.println(original[0].charAt(0));
				System.out.println("NOOOO");
			}
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("YESSS");
		}


		
	}
	*/
}
