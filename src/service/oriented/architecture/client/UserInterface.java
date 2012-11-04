package service.oriented.architecture.client;

import java.util.List;

import service.oriented.architecture.server.FamilyServiceImpl;
import service.oriented.architecture.shared.FamilyService;

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
