package service.oriented.architecture.server;

import java.util.ArrayList;
import java.util.List;

import service.oriented.architecture.shared.FamilyService;

public class FamilyServiceImpl implements FamilyService{

	private static final String CHAUBAL = "Chaubal";
	private List<String> names;

	@Override
	public String getSurname() {
		return CHAUBAL;
	}

	@Override
	public List<String> getNames() {
		names = new ArrayList<String>();
		names.add("Sainath");
		names.add("Anil");
		return names;
	}

	@Override
	public int getSize() {
		return names.size();
	}

}
