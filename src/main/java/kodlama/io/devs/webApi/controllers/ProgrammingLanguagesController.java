package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.programmingLanguage.GetProgrammingLanguageByIdResponse;
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
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		return this.programmingLanguageService.getAll();

		
	}
	
	@GetMapping("/getbyid")
	public GetProgrammingLanguageByIdResponse getById(int id) {
		return this.programmingLanguageService.getById(id);

		
	}

}
