package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.model.dtos.framework.CreateFrameworkRequest;
import kodlama.io.devs.model.dtos.framework.DeleteFrameworkRequest;
import kodlama.io.devs.model.dtos.framework.UpdateFrameworkRequest;
import kodlama.io.devs.model.dtos.framework.FrameworkDto;
import kodlama.io.devs.model.dtos.framework.FrameworkByIdDto;

import java.util.List;

public interface FrameworkService {
	
	void add(CreateFrameworkRequest createFrameworkRequest);
	
	void delete(DeleteFrameworkRequest deleteFrameworkRequest);
	
	void update(UpdateFrameworkRequest updateFrameworkRequest);
	
	List<FrameworkDto> getAll();
	
	FrameworkByIdDto getById(int id);

}
