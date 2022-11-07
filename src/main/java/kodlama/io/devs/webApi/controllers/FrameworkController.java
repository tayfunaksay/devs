package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.business.requests.framework.CreateFrameworkRequest;
import kodlama.io.devs.business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.devs.business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.devs.business.responses.framework.GetAllFrameworksResponse;
import kodlama.io.devs.business.responses.framework.GetFrameworkByIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/frameworks")
public class FrameworkController {
	
	@Autowired
	private FrameworkService frameworkService;

	public FrameworkController(FrameworkService frameworkService) {
		
		this.frameworkService = frameworkService;
	}
	
	@PostMapping("/add")
	public void add(CreateFrameworkRequest createFrameworkRequest){
		
		this.frameworkService.add(createFrameworkRequest);

	}

	@DeleteMapping("/delete")
	public void delete(DeleteFrameworkRequest deleteFrameworkRequest) {

		this.frameworkService.delete(deleteFrameworkRequest);

	}

	@PutMapping("/update")
	public void update(UpdateFrameworkRequest updateFrameworkRequest){
		
		this.frameworkService.update(updateFrameworkRequest);
		
	}

	@GetMapping("/getall")
	public List<GetAllFrameworksResponse> getAll() {
		return this.frameworkService.getAll();

		
	}
	
	@GetMapping("/getbyid")
	public GetFrameworkByIdResponse getById(int id) {
		return this.frameworkService.getById(id);

		
	}
	

}
