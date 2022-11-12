package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.dtos.framework.CreateFrameworkRequest;
import kodlama.io.devs.dtos.framework.DeleteFrameworkRequest;
import kodlama.io.devs.dtos.framework.UpdateFrameworkRequest;
import kodlama.io.devs.dtos.framework.FrameworkDto;
import kodlama.io.devs.dtos.framework.FrameworkByIdDto;
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
	public List<FrameworkDto> getAll() {
		return this.frameworkService.getAll();

		
	}
	
	@GetMapping("/getbyid")
	public FrameworkByIdDto getById(int id) {
		return this.frameworkService.getById(id);

		
	}
	

}
