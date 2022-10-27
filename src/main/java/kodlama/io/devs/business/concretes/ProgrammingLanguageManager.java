package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {

		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isNameExist(programmingLanguage)) {

			throw new Exception("Aynı isimde yeni bir programlama dili kaydedilemez. İşlem başarısız.");
		}
		this.programmingLanguageRepository.add(programmingLanguage);

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {

		this.programmingLanguageRepository.delete(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isNameExist(programmingLanguage)) {

			throw new Exception("Aynı isimde bir programlama dili zaten var. İşlem başarısız.");
		}

		this.programmingLanguageRepository.update(programmingLanguage);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return this.programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return this.programmingLanguageRepository.getById(id);
	}

	public boolean isNameExist(ProgrammingLanguage programmingLanguage) throws Exception {

		boolean result = false;

		for (ProgrammingLanguage language : this.programmingLanguageRepository.getAll()) {
			if (language.getName().equals(programmingLanguage.getName())) {

				result = true;

			}
		}

		return result;

	}

}
