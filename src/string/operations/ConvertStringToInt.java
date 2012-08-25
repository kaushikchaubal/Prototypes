package string.operations;
import java.util.Scanner;


public class ConvertStringToInt {

	public static void main(String[] args) {
		new ConvertStringToInt();
	}

	public ConvertStringToInt() {
		System.out.println("Enter String: ");
		String s = (new Scanner(System.in)).next();
		
		int number = convert(s);
		if(number==0) System.out.println("Unvalid Int");
		else System.out.println(number);
	}

	public int convert(String s){
		int number=0;
		
		for(int i=0; i < s.length(); i++){
			
			if((int)s.charAt(i)>= 48 && (int)s.charAt(i)<= 57)
				number += ((int)s.charAt(i) - 48)* Math.pow(10,s.length()-1-i);
			else{
				number = 0;
				break;
			}
		}
		
		if(s.charAt(0) == '-') number = number*-1;
		
		return number;
	}
}
