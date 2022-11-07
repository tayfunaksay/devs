package kodlama.io.devs.business.responses.framework;

import kodlama.io.devs.business.responses.programmingLanguage.GetProgrammingLanguageByIdResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllFrameworksResponse {
	
	private int id;
	private String name;
	private GetProgrammingLanguageByIdResponse programmingLanguage;
	
}
