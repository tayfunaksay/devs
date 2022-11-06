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

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/v1/programminglanguages")
public class ProgrammingLanguagesController {
	
	ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage){
		
		this.programmingLanguageService.add(programmingLanguage);

	}

	@DeleteMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {

		this.programmingLanguageService.delete(programmingLanguage);

	}

	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage){
		
		this.programmingLanguageService.update(programmingLanguage);
		
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return this.programmingLanguageService.getAll();

		
	}
	
	@GetMapping("/getbyid")
	public Optional<ProgrammingLanguage> getById(int id) {
		return this.programmingLanguageService.getById(id);

		
	}

}
