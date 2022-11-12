package kodlama.io.devs.dtos.framework;

import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;

public class FrameworkByIdDto {
	
	private int id;
	private String name;
	private ProgrammingLanguageDto programmingLanguageDto;

	public ProgrammingLanguageDto getProgrammingLanguageDto() {
		return programmingLanguageDto;
	}

	public void setProgrammingLanguageDto(ProgrammingLanguageDto programmingLanguageDto) {
		this.programmingLanguageDto = programmingLanguageDto;
	}

	public FrameworkByIdDto() {
	}

	public FrameworkByIdDto(int id, String name, ProgrammingLanguageDto programmingLanguageDto) {
		this.id = id;
		this.name = name;
		this.programmingLanguageDto = programmingLanguageDto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
