package kodlama.io.devs.model.mapper.concretes;

import kodlama.io.devs.model.dtos.programmingLanguages.*;
import kodlama.io.devs.model.entities.ProgrammingLanguage;
import kodlama.io.devs.model.mapper.abstracts.ProgrammingLanguageMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ProgrammingLanguageConverter implements ProgrammingLanguageMapper {
    @Override
    public ProgrammingLanguage toProgrammingLanguage(CreateProgrammingLanguageRequest from) {
        return new ProgrammingLanguage(from.getName());
    }

    @Override
    public ProgrammingLanguage toProgrammingLanguage(UpdateProgrammingLanguageRequest from) {
        return new ProgrammingLanguage(from.getId(),from.getName());
    }

    @Override
    public ProgrammingLanguage toProgrammingLanguage(DeleteProgrammingLanguageRequest from) {
        return new ProgrammingLanguage(from.getId());
    }

    @Override
    public List<ProgrammingLanguageDto> toProgrammingLanguageList(List<ProgrammingLanguage> programmingLanguages) {
        return programmingLanguages
                .stream()
                .map(
                        programmingLanguage -> new ProgrammingLanguageDto(
                                programmingLanguage.getId(),
                                programmingLanguage.getName()
                        )
                )
                .collect(Collectors.toList());
    }

    @Override
    public ProgrammingLanguageDto toProgrammingLanguageDto(ProgrammingLanguage programmingLanguage) {
        return new ProgrammingLanguageDto(programmingLanguage.getId(), programmingLanguage.getName());
    }

    @Override
    public ProgrammingLanguageByIdDto toProgrammingLanguageById(ProgrammingLanguage programmingLanguage) {
        return new ProgrammingLanguageByIdDto(programmingLanguage.getId(), programmingLanguage.getName());
    }
}
