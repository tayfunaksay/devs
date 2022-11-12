package kodlama.io.devs.mapping.abstracts;

import kodlama.io.devs.dtos.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageByIdDto;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;


public interface ProgrammingLanguageMapper {

	ProgrammingLanguage toProgrammingLanguage (CreateProgrammingLanguageRequest from);
	ProgrammingLanguage toProgrammingLanguage (UpdateProgrammingLanguageRequest from);
	ProgrammingLanguage toProgrammingLanguage (DeleteProgrammingLanguageRequest from);
	
	List<ProgrammingLanguageDto> toProgrammingLanguageList (List<ProgrammingLanguage> programmingLanguages);
	ProgrammingLanguageDto toProgrammingLanguageDto (ProgrammingLanguage programmingLanguage);
	ProgrammingLanguageByIdDto toProgrammingLanguageById (ProgrammingLanguage programmingLanguage);
	
}
