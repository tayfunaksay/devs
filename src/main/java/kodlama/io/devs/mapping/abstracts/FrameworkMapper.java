package kodlama.io.devs.mapping.abstracts;

import kodlama.io.devs.dtos.framework.CreateFrameworkRequest;
import kodlama.io.devs.dtos.framework.DeleteFrameworkRequest;
import kodlama.io.devs.dtos.framework.UpdateFrameworkRequest;
import kodlama.io.devs.dtos.framework.FrameworkDto;
import kodlama.io.devs.dtos.framework.FrameworkByIdDto;
import kodlama.io.devs.entities.concretes.Framework;

import java.util.List;


public interface FrameworkMapper {


	Framework toFramework (CreateFrameworkRequest from);

	Framework toFramework (UpdateFrameworkRequest from);
	Framework toFramework (DeleteFrameworkRequest from);
	
	List<FrameworkDto> toFrameworkResponseList (List<Framework> frameworks);
	FrameworkDto toFrameworkResponse (Framework framework);
	FrameworkByIdDto toFrameworkByIdResponse (Framework framework);
}
	