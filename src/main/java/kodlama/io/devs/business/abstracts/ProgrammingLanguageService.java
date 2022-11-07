package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.programmingLanguage.GetProgrammingLanguageByIdResponse;

import java.util.List;

public interface ProgrammingLanguageService {
	
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	
	List<GetAllProgrammingLanguagesResponse> getAll();
	
	GetProgrammingLanguageByIdResponse getById(int id);
	


}
