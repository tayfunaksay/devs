package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.core.results.Result;
import kodlama.io.devs.core.results.RulesManager;
import kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.model.dtos.framework.*;
import kodlama.io.devs.model.entities.Framework;
import kodlama.io.devs.exceptions.FrameworkNotFoundException;
import kodlama.io.devs.model.mapper.abstracts.FrameworkMapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class FrameworkManager implements FrameworkService {
    private final FrameworkRepository frameworkRepository;
    private final FrameworkMapper frameworkMapper;
    public FrameworkManager(FrameworkRepository frameworkRepository, FrameworkMapper frameworkMapper) {
        this.frameworkRepository = frameworkRepository;
        this.frameworkMapper = frameworkMapper;
    }

    @Override
    public void add(CreateFrameworkRequest createFrameworkRequest) {

        Framework framework = frameworkMapper.toFramework(createFrameworkRequest);

        Result checkedRulesResult = RulesManager.checkRules(
                List.of(isFrameworkNameExist(framework),isFrameworkNameBlank(framework),isFrameworkExist(framework)));

        if (!checkedRulesResult.isSuccess()) {
            System.out.println(checkedRulesResult.getMessage());
        } else {
            this.frameworkRepository.save(framework);
        }
    }

    @Override
    public void delete(DeleteFrameworkRequest deleteFrameworkRequest) {
        this.frameworkRepository.deleteById(frameworkMapper.toFramework(deleteFrameworkRequest).getId());

    }

    @Override
    public void update(UpdateFrameworkRequest updateFrameworkRequest) {
        Framework framework = frameworkMapper.toFramework(updateFrameworkRequest);

        Result checkedRulesResult = RulesManager.checkRules(
                List.of(isFrameworkNameExist(framework),isFrameworkNameBlank(framework),isFrameworkExist(framework)));

        if (!checkedRulesResult.isSuccess()) {
            System.out.println(checkedRulesResult.getMessage());
        } else {
            this.frameworkRepository.save(framework);
        }
    }

    @Override
    public List<FrameworkDto> getAll() {
        return frameworkMapper.toFrameworkResponseList(frameworkRepository.findAll());
    }

    @Override
    public FrameworkByIdDto getById(int id) {
        return frameworkMapper
                .toFrameworkByIdResponse(this.frameworkRepository.findById(id)
                        .orElseThrow(() -> new FrameworkNotFoundException("Framework could not found by id: " + id))
                );
    }

    public Result isFrameworkNameExist(Framework framework) {

        Result result = new Result(true, "");

        for (Framework existFramework : this.frameworkRepository.findAll()) {
            if (existFramework.getName().equals(framework.getName())) {

                result.setSuccess(false);
                result.setMessage("Ayn?? isimde zaten bir Framework var. L??tfen farkl?? bir isim veriniz. ????lem Ba??ar??s??z.");
            }
        }
        return result;
    }

    public Result isFrameworkNameBlank(Framework framework) {
        Result result = new Result(true, "");
        if (framework.getName().isBlank()) {
            result.setSuccess(false);
            result.setMessage("Girilen isim de??eri bo?? olamaz ve sadece bo??luklardan olu??amaz. ????lem Ba??ar??s??z.");
        }
        return result;
    }

    public Result isFrameworkExist(Framework framework) {
        Result result = new Result(true, "");
        if (!this.frameworkRepository.findById(framework.getId()).isPresent()) {
            result.setMessage("Bu id ile bir framework bulunamad??. L??tfen bilgileri kontrol ediniz.");
            result.setSuccess(false);
        }
        return result;
    }
}