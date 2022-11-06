package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.core.results.Result;
import kodlama.io.devs.core.results.RulesManager;
import kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.entities.concretes.Framework;

@Service
public class FrameworkManager implements FrameworkService {

	private FrameworkRepository frameworkRepository;
	
	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository) {

		this.frameworkRepository = frameworkRepository;
	}

	
	@Override
	public void add(Framework framework) {
		this.frameworkRepository.save(framework);
		
	}

	@Override
	public void delete(Framework framework) {
		this.frameworkRepository.delete(framework);
		
	}

	@Override
	public void update(Framework framework) {
		
		List<Result> rules = new ArrayList<Result>();
		
		rules.add(isFrameworkExist(framework));
		
		Result checkedRulesResult = RulesManager.checkRules(rules);
		if (checkedRulesResult.isSuccess()) {

			System.out.println(checkedRulesResult.getMessage());
		} else {

			this.frameworkRepository.save(framework);

		}
				
	}

	@Override
	public List<Framework> getAll() {
		
		return this.frameworkRepository.findAll();
	}

	@Override
	public Optional<Framework> getById(int id) {
		
			return this.frameworkRepository.findById(id);
		}
	
	
	
	
	public Result isFrameworkExist (Framework framework) {
		Result result = new Result(false, "");
		if (!this.frameworkRepository.findById(framework.getId()).isEmpty()) {
			result.setMessage("Bu id ile bir framework bulunamadı. Lütfen bilgileri kontrol ediniz.");
			result.setSuccess(true);
		}
		
		return result;
	}
	

}
