package service.oriented.architecture.shared;

import java.util.List;

public interface FamilyService {
	
	public String getSurname();

	public List<String> getNames();
	
	public int getSize();

}
