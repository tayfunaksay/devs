package kodlama.io.devs.business.mapping.mapStruct;

import kodlama.io.devs.business.requests.framework.CreateFrameworkRequest;
import kodlama.io.devs.business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.devs.business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.devs.business.responses.framework.GetAllFrameworksResponse;
import kodlama.io.devs.business.responses.framework.GetFrameworkByIdResponse;
import kodlama.io.devs.entities.concretes.Framework;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FrameworkMapper {
	FrameworkMapper INSTANCE = Mappers.getMapper( FrameworkMapper.class );
	
	
	Framework toFramework (CreateFrameworkRequest createFrameworkRequest);
	Framework toFramework (UpdateFrameworkRequest updateFrameworkRequest);
	Framework toFramework (DeleteFrameworkRequest deleteFrameworkRequest);
	
	List<GetAllFrameworksResponse> toFrameworkResponseList (List<Framework> frameworks);
	GetFrameworkByIdResponse toFrameworkByIdResponce (Framework framework);
}
	