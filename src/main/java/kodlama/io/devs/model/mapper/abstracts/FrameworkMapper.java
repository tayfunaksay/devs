package kodlama.io.devs.model.mapper.abstracts;

import kodlama.io.devs.model.dtos.framework.CreateFrameworkRequest;
import kodlama.io.devs.model.dtos.framework.DeleteFrameworkRequest;
import kodlama.io.devs.model.dtos.framework.UpdateFrameworkRequest;
import kodlama.io.devs.model.dtos.framework.FrameworkDto;
import kodlama.io.devs.model.dtos.framework.FrameworkByIdDto;
import kodlama.io.devs.model.entities.Framework;

import java.util.List;


public interface FrameworkMapper {


	Framework toFramework (CreateFrameworkRequest from);

	Framework toFramework (UpdateFrameworkRequest from);
	Framework toFramework (DeleteFrameworkRequest from);
	
	List<FrameworkDto> toFrameworkResponseList (List<Framework> frameworks);
	FrameworkDto toFrameworkResponse (Framework framework);
	FrameworkByIdDto toFrameworkByIdResponse (Framework framework);
}
	