package kodlama.io.devs.entities.concretes;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguage {
	
	private int id;
	
	@NonNull
	private String name;

}
