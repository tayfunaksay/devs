package kodlama.io.devs.business.responses.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProgrammingLanguageByIdResponse {
	
	private int id;
	private String name;

}
