package kodlama.io.devs.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.devs.business.requests.framework.CreateFrameworkRequest;
import kodlama.io.devs.business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.devs.business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.devs.business.responses.framework.GetAllFrameworksResponse;
import kodlama.io.devs.business.responses.framework.GetFrameworkByIdResponse;

public interface FrameworkService {
	
	void add(CreateFrameworkRequest createFrameworkRequest);
	
	void delete(DeleteFrameworkRequest deleteFrameworkRequest);
	
	void update(UpdateFrameworkRequest updateFrameworkRequest);
	
	List<GetAllFrameworksResponse> getAll();
	
	Optional<GetFrameworkByIdResponse> getById(int id);

}
