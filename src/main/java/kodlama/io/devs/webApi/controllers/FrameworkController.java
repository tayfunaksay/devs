package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.dtos.framework.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/frameworks")
public class FrameworkController {

    private FrameworkService frameworkService;
    public FrameworkController(FrameworkService frameworkService) {

        this.frameworkService = frameworkService;
    }


    @PostMapping("/add")
    public ResponseEntity<Void> add(CreateFrameworkRequest createFrameworkRequest) {
        this.frameworkService.add(createFrameworkRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(DeleteFrameworkRequest deleteFrameworkRequest) {
        this.frameworkService.delete(deleteFrameworkRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<Void> update(UpdateFrameworkRequest updateFrameworkRequest) {
        this.frameworkService.update(updateFrameworkRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getall")
    public ResponseEntity<List<FrameworkDto>> getAll() {

        return ResponseEntity.ok(this.frameworkService.getAll());
    }

    @GetMapping("/getbyid")
    public ResponseEntity<FrameworkByIdDto> getById(int id) {
        return ResponseEntity.ok(this.frameworkService.getById(id));
    }
}
