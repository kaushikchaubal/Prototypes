package java.basics;

public class TryCatchFunda {

	public TryCatchFunda() throws Exception {
		String e = null;
		try{
			e.charAt(0);
			
		}
//		catch(NullPointerException e2){
//			System.out.println("NOOO");
//		}
		finally{
				System.out.println("YESSS");
		}
		
		System.out.println("HASDAsdasr");
	}

	public static void main(String[] args) throws Exception {
			new TryCatchFunda();
	}

}
