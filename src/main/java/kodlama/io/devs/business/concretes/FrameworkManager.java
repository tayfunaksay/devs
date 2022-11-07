package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.business.mapping.mapStruct.FrameworkMapper;
import kodlama.io.devs.business.requests.framework.CreateFrameworkRequest;
import kodlama.io.devs.business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.devs.business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.devs.business.responses.framework.GetAllFrameworksResponse;
import kodlama.io.devs.business.responses.framework.GetFrameworkByIdResponse;
import kodlama.io.devs.core.results.Result;
import kodlama.io.devs.core.results.RulesManager;
import kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.entities.concretes.Framework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FrameworkManager implements FrameworkService {

	private final FrameworkRepository frameworkRepository;

	private final  FrameworkMapper frameworkMapper;
	
	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository, FrameworkMapper frameworkMapper) {
		super();
		this.frameworkRepository = frameworkRepository;
		this.frameworkMapper = frameworkMapper;
	}
	
	@Override
	public void add(CreateFrameworkRequest createFrameworkRequest) {
		List<Result> rules = new ArrayList<>();
		Framework framework = frameworkMapper.toFramework(createFrameworkRequest);
		rules.add(isFrameworkNameExist(framework));
		rules.add(isFrameworkNameBlank(framework));

		Result checkRulesResult = RulesManager.checkRules(rules);
		if (!checkRulesResult.isSuccess()) {

			System.out.println(checkRulesResult.getMessage());
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
		
		List<Result> rules = new ArrayList<>();
		Framework framework =frameworkMapper.toFramework(updateFrameworkRequest);
		
		rules.add(isFrameworkExist(framework));
		rules.add(isFrameworkNameExist(framework));
		rules.add(isFrameworkNameBlank(framework));
		
		Result checkedRulesResult = RulesManager.checkRules(rules);
		if (!checkedRulesResult.isSuccess()) {

			System.out.println(checkedRulesResult.getMessage());
		} else {

			this.frameworkRepository.save(framework);

		}
				
	}

	@Override
	public List<GetAllFrameworksResponse> getAll() {
		
		return frameworkMapper.toFrameworkResponseList(frameworkRepository.findAll());
	}

	@Override
	public GetFrameworkByIdResponse getById(int id) {
		
			return frameworkMapper.toFrameworkByIdResponse(this.frameworkRepository.getFrameworkById(id)) ;
		}

	public Result isFrameworkNameExist(Framework framework) {

		Result result = new Result(true, "");

		for (Framework existFramework : this.frameworkRepository.findAll()) {
			if (existFramework.getName().equals(framework.getName())) {

				result.setSuccess(false);
				result.setMessage(
						"Aynı isimde zaten bir Framework var. Lütfen farklı bir isim veriniz. İşlem Başarısız.");
			}
		}
		return result;
	}

	public Result isFrameworkNameBlank(Framework framework) {

		Result result = new Result(true, "");

		if (framework.getName().isBlank()) {

			result.setSuccess(false);
			result.setMessage("Girilen isim değeri boş olamaz ve sadece boşluklardan oluşamaz. İşlem Başarısız.");
		}
		return result;
	}
	
	
	public Result isFrameworkExist (Framework framework) {
		Result result = new Result(true, "");
		if (!this.frameworkRepository.findById(framework.getId()).isPresent()) {
			result.setMessage("Bu id ile bir framework bulunamadı. Lütfen bilgileri kontrol ediniz.");
			result.setSuccess(false);
		}
		
		return result;
	}

	
	

}
