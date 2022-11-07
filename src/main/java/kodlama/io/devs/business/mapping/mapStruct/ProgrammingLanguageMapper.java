package kodlama.io.devs.business.mapping.mapStruct;

import java.util.List;

import org.mapstruct.Mapper;

import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.programmingLanguage.GetProgrammingLanguageByIdResponse;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Mapper(componentModel = "spring")
public interface ProgrammingLanguageMapper {
	
	ProgrammingLanguage toCreateProgrammingLanguageRequest (CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	ProgrammingLanguage toUpdateProgrammingLanguageRequest(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	ProgrammingLanguage toDeleteProgrammingLanguageRequest(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	
	List<GetAllProgrammingLanguagesResponse> toProgrammingLanguageList (List<ProgrammingLanguage> programmingLanguages);
	GetProgrammingLanguageByIdResponse toProgrammingLanguage (ProgrammingLanguage programmingLanguage);
	
}
