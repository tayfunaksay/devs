package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.dtos.framework.CreateFrameworkRequest;
import kodlama.io.devs.dtos.framework.DeleteFrameworkRequest;
import kodlama.io.devs.dtos.framework.UpdateFrameworkRequest;
import kodlama.io.devs.dtos.framework.FrameworkDto;
import kodlama.io.devs.dtos.framework.FrameworkByIdDto;

import java.util.List;

public interface FrameworkService {
	
	void add(CreateFrameworkRequest createFrameworkRequest);
	
	void delete(DeleteFrameworkRequest deleteFrameworkRequest);
	
	void update(UpdateFrameworkRequest updateFrameworkRequest);
	
	List<FrameworkDto> getAll();
	
	FrameworkByIdDto getById(int id);

}
