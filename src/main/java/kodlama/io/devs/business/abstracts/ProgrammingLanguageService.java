package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.dtos.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageByIdDto;

import java.util.List;

public interface ProgrammingLanguageService {
	
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	
	List<ProgrammingLanguageDto> getAll();
	
	ProgrammingLanguageByIdDto getById(int id);
	


}
