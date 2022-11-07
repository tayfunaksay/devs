package kodlama.io.devs.business.requests.framework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateFrameworkRequest {
	private int id;
	private int programmingLanguageId;
	private String name;
}
