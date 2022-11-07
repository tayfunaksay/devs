package kodlama.io.devs.business.responses.framework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetFrameworkByIdResponse {
	
	private int id;
	private String name;
	
}
