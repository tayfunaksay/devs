package kodlama.io.devs.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	void add(ProgrammingLanguage programmingLanguage);
	
	void delete(ProgrammingLanguage programmingLanguage);
	
	void update(ProgrammingLanguage programmingLanguage);
	
	List<ProgrammingLanguage> getAll();
	
	Optional<ProgrammingLanguage> getById(int id);
	


}
