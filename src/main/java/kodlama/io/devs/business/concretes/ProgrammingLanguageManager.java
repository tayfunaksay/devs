package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.model.mapper.abstracts.ProgrammingLanguageMapper;
import kodlama.io.devs.model.dtos.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.devs.model.dtos.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.model.dtos.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.model.dtos.programmingLanguages.ProgrammingLanguageDto;
import kodlama.io.devs.model.dtos.programmingLanguages.ProgrammingLanguageByIdDto;
import kodlama.io.devs.core.results.Result;
import kodlama.io.devs.core.results.RulesManager;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.model.entities.ProgrammingLanguage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private final ProgrammingLanguageRepository programmingLanguageRepository;
	private final ProgrammingLanguageMapper programmingLanguageMapper;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,
									  ProgrammingLanguageMapper programmingLanguageMapper) {
		this.programmingLanguageRepository = programmingLanguageRepository;
		this.programmingLanguageMapper = programmingLanguageMapper;
	}


	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {

		List<Result> rules = new ArrayList<>();
		ProgrammingLanguage programmingLanguage = programmingLanguageMapper.toProgrammingLanguage
				(createProgrammingLanguageRequest);

		rules.add(isNameExist(programmingLanguage));
		rules.add(isNameBlank(programmingLanguage));

		Result checkRulesResult = RulesManager.checkRules(rules);

		if (!checkRulesResult.isSuccess()) {

			System.out.println(checkRulesResult.getMessage());
		} else {

			this.programmingLanguageRepository.save(programmingLanguage);
		}
	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {

		this.programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());

	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {

		List<Result> rules = new ArrayList<>();
		ProgrammingLanguage programmingLanguage = programmingLanguageMapper.toProgrammingLanguage(updateProgrammingLanguageRequest);
		rules.add(isNameExist(programmingLanguage));
		rules.add(isNameBlank(programmingLanguage));
		rules.add(isProgrammingLanguageExist(programmingLanguage));

		Result checkedRulesResult = RulesManager.checkRules(rules);

		if (!checkedRulesResult.isSuccess()) {

			System.out.println(checkedRulesResult.getMessage());
		} else {

			this.programmingLanguageRepository.save(programmingLanguage);

		}

	}

	@Override
	public List<ProgrammingLanguageDto> getAll() {

		return programmingLanguageMapper.toProgrammingLanguageList
				(this.programmingLanguageRepository.findAll());
	}

	@Override
	public ProgrammingLanguageByIdDto getById(int id) {

		return programmingLanguageMapper.toProgrammingLanguageById
				(this.programmingLanguageRepository.getProgrammingLanguageById(id));
	}





	public Result isNameExist(ProgrammingLanguage programmingLanguage) {

		Result result = new Result(true, "");

		for (ProgrammingLanguage language : this.programmingLanguageRepository.findAll()) {
			if (language.getName().equals(programmingLanguage.getName())) {

				result.setSuccess(false);
				result.setMessage(
						"Ayn?? isimde zaten bir programlama dili var. L??tfen farkl?? bir isim veriniz. ????lem Ba??ar??s??z.");
			}
		}
		return result;
	}

	public Result isNameBlank(ProgrammingLanguage programmingLanguage) {

		Result result = new Result(true, "");

		if (programmingLanguage.getName().isBlank()) {

			result.setSuccess(false);
			result.setMessage("Girilen isim de??eri bo?? olamaz ve sadece bo??luklardan olu??amaz. ????lem Ba??ar??s??z.");
		}
		return result;
	}
	public Result isProgrammingLanguageExist (ProgrammingLanguage programmingLanguage) {
		Result result = new Result(true, "");
		if (!this.programmingLanguageRepository.findById(programmingLanguage.getId()).isPresent()) {
			result.setMessage("Bu id ile bir Programming Language bulunamad??. L??tfen bilgileri kontrol ediniz.");
			result.setSuccess(false);
		}

		return result;
	}
}
