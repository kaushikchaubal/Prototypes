package string.operations;

public class PrintOnlySeq {

	public static void main(String[] args) {
		new PrintOnlySeq();

	}

	public PrintOnlySeq() {
		String input = "ABCXYZACCD";
		
		try{
			for(int i = 0; i < input.length(); i++){
				System.out.print(input.charAt(i) + " ");
				if((int) input.charAt(i+1) - (int) input.charAt(i) != 1)
					System.out.print("\n");
			}
		}
		catch(Exception e){}
			
		
	}

}
