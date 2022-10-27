package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> programmingLanguages;
	
	

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Matlab"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Lingo"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Angular"));
		
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		
		programmingLanguages.remove(programmingLanguage);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		
		for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == programmingLanguage.getId()){
                language.setName(programmingLanguage.getName());
            }
        }
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		ProgrammingLanguage expectingLanguage = null;
		
		for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == id){
            	expectingLanguage=language;
            }
        }
		return expectingLanguage;	
	}

}
