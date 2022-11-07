package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.core.results.Result;
import kodlama.io.devs.core.results.RulesManager;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}


	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		List<Result> rules = new ArrayList<Result>();

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
	public void delete(ProgrammingLanguage programmingLanguage) {

		this.programmingLanguageRepository.deleteById(programmingLanguage.getId());

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		
		List<Result> rules = new ArrayList<Result>();

		rules.add(isNameExist(programmingLanguage));
		rules.add(isNameBlank(programmingLanguage));

		Result checkedRulesResult = RulesManager.checkRules(rules);

		if (!checkedRulesResult.isSuccess()) {

			System.out.println(checkedRulesResult.getMessage());
		} else {

			this.programmingLanguageRepository.save(programmingLanguage);

		}

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return this.programmingLanguageRepository.findAll();
	}

	@Override
	public Optional<ProgrammingLanguage> getById(int id) {

		return this.programmingLanguageRepository.findById(id);
	}
	
	
	
	

	public Result isNameExist(ProgrammingLanguage programmingLanguage) {

		Result result = new Result(true, "");

		for (ProgrammingLanguage language : this.programmingLanguageRepository.findAll()) {
			if (language.getName().equals(programmingLanguage.getName())) {

				result.setSuccess(false);
				result.setMessage(
						"Aynı isimde zaten bir programlama dili var. Lütfen farklı bir isim veriniz. İşlem Başarısız.");

			}
		}

		return result;

	}

	public Result isNameBlank(ProgrammingLanguage programmingLanguage) {

		Result result = new Result(true, "");

		if (programmingLanguage.getName().isBlank()) {

			result.setSuccess(false);
			result.setMessage("Girilen isim değeri boş olamaz ve sadece boşluklardan oluşamaz. İşlem Başarısız.");

		}

		return result;

	}

	
	

}
