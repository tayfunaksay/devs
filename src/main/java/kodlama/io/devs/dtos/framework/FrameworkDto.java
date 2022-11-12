package kodlama.io.devs.dtos.framework;

import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;

public class FrameworkDto {
	
	private int id;
	private String name;
	private ProgrammingLanguageDto programmingLanguageDto;

	public FrameworkDto() {
	}



	public FrameworkDto(int id, String name, ProgrammingLanguageDto programmingLanguageDto) {
		this.id = id;
		this.name = name;
		this.programmingLanguageDto = programmingLanguageDto;
	}

}
