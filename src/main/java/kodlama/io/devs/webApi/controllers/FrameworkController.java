package kodlama.io.devs.webApi.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.entities.concretes.Framework;

@RestController
@RequestMapping("/api/v1/frameworks")
public class FrameworkController {
	
	@Autowired
	private FrameworkService frameworkService;

	public FrameworkController(FrameworkService frameworkService) {
		
		this.frameworkService = frameworkService;
	}
	
	@PostMapping("/add")
	public void add(Framework framework){
		
		this.frameworkService.add(framework);

	}

	@DeleteMapping("/delete")
	public void delete(Framework framework) {

		this.frameworkService.delete(framework);

	}

	@PutMapping("/update")
	public void update(Framework framework){
		
		this.frameworkService.update(framework);
		
	}

	@GetMapping("/getall")
	public List<Framework> getAll() {
		return this.frameworkService.getAll();

		
	}
	
	@GetMapping("/getbyid")
	public Optional<Framework> getById(int id) {
		return this.frameworkService.getById(id);

		
	}
	

}
