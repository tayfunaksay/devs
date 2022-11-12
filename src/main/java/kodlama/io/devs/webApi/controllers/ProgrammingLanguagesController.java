package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dtos.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageByIdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/programminglanguages")
public class ProgrammingLanguagesController {
	
	ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
		
		this.programmingLanguageService.add(createProgrammingLanguageRequest);

	}

	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {

		this.programmingLanguageService.delete(deleteProgrammingLanguageRequest);

	}

	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest){
		
		this.programmingLanguageService.update(updateProgrammingLanguageRequest);
		
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguageDto> getAll() {
		return this.programmingLanguageService.getAll();

		
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguageByIdDto getById(int id) {
		return this.programmingLanguageService.getById(id);

		
	}

}
