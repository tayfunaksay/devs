package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception{
		
		this.programmingLanguageService.add(programmingLanguage);

	}

	@PostMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {

		this.programmingLanguageService.delete(programmingLanguage);

	}

	@PostMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		
		this.programmingLanguageService.update(programmingLanguage);
		
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return this.programmingLanguageService.getAll();

		
	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return this.programmingLanguageService.getById(id);

		
	}

}
