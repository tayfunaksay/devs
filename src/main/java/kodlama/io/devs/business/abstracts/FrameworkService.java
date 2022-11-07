package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.framework.CreateFrameworkRequest;
import kodlama.io.devs.business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.devs.business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.devs.business.responses.framework.GetAllFrameworksResponse;
import kodlama.io.devs.business.responses.framework.GetFrameworkByIdResponse;

import java.util.List;

public interface FrameworkService {
	
	void add(CreateFrameworkRequest createFrameworkRequest);
	
	void delete(DeleteFrameworkRequest deleteFrameworkRequest);
	
	void update(UpdateFrameworkRequest updateFrameworkRequest);
	
	List<GetAllFrameworksResponse> getAll();
	
	GetFrameworkByIdResponse getById(int id);

}
