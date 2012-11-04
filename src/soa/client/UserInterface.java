package soa.client;

import java.util.List;

import soa.server.FamilyServiceImpl;
import soa.shared.FamilyService;

public class UserInterface {

	FamilyService familyService;
	
	public static void main(String[] args) {
		new UserInterface();
	}

	public UserInterface(){
		familyService = new FamilyServiceImpl();
		String surname = familyService.getSurname();
		List<String> names = familyService.getNames();
		int size = familyService.getSize();
		
		System.out.println("Surname: " + surname);
		for (String string : names) 
			System.out.println("Names: " + string);
		System.out.println("Size: " + size);
	}
}
