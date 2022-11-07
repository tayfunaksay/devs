package kodlama.io.devs.business.mapping.mapStruct;

import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.programmingLanguage.GetProgrammingLanguageByIdResponse;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper(componentModel = "spring")
public interface ProgrammingLanguageMapper {

	ProgrammingLanguageMapper INSTANCE = Mappers.getMapper( ProgrammingLanguageMapper.class );


	ProgrammingLanguage toProgrammingLanguage (CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	ProgrammingLanguage toProgrammingLanguage (UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	ProgrammingLanguage toProgrammingLanguage (DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	
	List<GetAllProgrammingLanguagesResponse> toProgrammingLanguageList (List<ProgrammingLanguage> programmingLanguages);
	GetProgrammingLanguageByIdResponse toProgrammingLanguageById (ProgrammingLanguage programmingLanguage);
	
}
