package kodlama.io.devs.model.mapper.concretes;

import kodlama.io.devs.model.dtos.framework.*;
import kodlama.io.devs.model.mapper.abstracts.FrameworkMapper;
import kodlama.io.devs.model.entities.Framework;
import kodlama.io.devs.model.entities.ProgrammingLanguage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FrameworkConverter implements FrameworkMapper {

    private final ProgrammingLanguageConverter programmingLanguageConverter;

    public FrameworkConverter(ProgrammingLanguageConverter programmingLanguageConverter) {
        this.programmingLanguageConverter = programmingLanguageConverter;
    }

    @Override
    public Framework toFramework(CreateFrameworkRequest from) {
        return new Framework(from.getName(),new ProgrammingLanguage(from.getProgrammingLanguageId()));
    }

    @Override
    public Framework toFramework(UpdateFrameworkRequest from) {
        return new Framework(from.getId(), from.getName(),new ProgrammingLanguage(from.getProgrammingLanguageId()));
    }

    @Override
    public Framework toFramework(DeleteFrameworkRequest from) {
        return new Framework(from.getId());
    }

    @Override
    public List<FrameworkDto> toFrameworkResponseList(List<Framework> frameworks) {

        return  frameworks
                .stream()
                .map(
                        framework -> toFrameworkResponse(framework)
                )
                .collect(Collectors.toList());
    }

    @Override
    public FrameworkDto toFrameworkResponse(Framework framework) {
        return new FrameworkDto(
                framework.getId(),
                framework.getName(),
                programmingLanguageConverter.toProgrammingLanguageDto(framework.getProgrammingLanguage()) );
    }

    @Override
    public FrameworkByIdDto toFrameworkByIdResponse(Framework framework) {

        return new FrameworkByIdDto(
                framework.getId(),
                framework.getName(),
                programmingLanguageConverter.toProgrammingLanguageDto(framework.getProgrammingLanguage()));
    }
}
