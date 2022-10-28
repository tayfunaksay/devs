package kodlama.io.devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.concretes.ProgrammingLanguageManager;
import kodlama.io.devs.dataAccess.concretes.InMemoryProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@SpringBootApplication
public class DevsApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DevsApplication.class, args);
		
		ProgrammingLanguage p_lan = new ProgrammingLanguage(5,"a");
		
		ProgrammingLanguageService service = new ProgrammingLanguageManager(new InMemoryProgrammingLanguageRepository());
		
		service.add(p_lan);
		service.delete(new ProgrammingLanguage(1,"Java"));
		for (ProgrammingLanguage pl : service.getAll()) {
			System.out.println(pl.getId()+"  "+ pl.getName());
		}
	}
}