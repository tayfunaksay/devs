package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dtos.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;
import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageByIdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Void> add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        this.programmingLanguageService.add(createProgrammingLanguageRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
        this.programmingLanguageService.delete(deleteProgrammingLanguageRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<Void> update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        this.programmingLanguageService.update(updateProgrammingLanguageRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getall")
    public ResponseEntity<List<ProgrammingLanguageDto>> getAll() {
        return ResponseEntity.ok(this.programmingLanguageService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<ProgrammingLanguageByIdDto> getById(int id) {
        return ResponseEntity.ok(this.programmingLanguageService.getById(id));
    }

}
