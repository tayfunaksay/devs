package kodlama.io.devs.model.mapper.abstracts;

import kodlama.io.devs.model.dtos.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.devs.model.dtos.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.model.dtos.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.model.dtos.programmingLanguages.ProgrammingLanguageDto;
import kodlama.io.devs.model.dtos.programmingLanguages.ProgrammingLanguageByIdDto;
import kodlama.io.devs.model.entities.ProgrammingLanguage;

import java.util.List;


public interface ProgrammingLanguageMapper {

	ProgrammingLanguage toProgrammingLanguage (CreateProgrammingLanguageRequest from);
	ProgrammingLanguage toProgrammingLanguage (UpdateProgrammingLanguageRequest from);
	ProgrammingLanguage toProgrammingLanguage (DeleteProgrammingLanguageRequest from);
	
	List<ProgrammingLanguageDto> toProgrammingLanguageList (List<ProgrammingLanguage> programmingLanguages);
	ProgrammingLanguageDto toProgrammingLanguageDto (ProgrammingLanguage programmingLanguage);
	ProgrammingLanguageByIdDto toProgrammingLanguageById (ProgrammingLanguage programmingLanguage);
	
}
