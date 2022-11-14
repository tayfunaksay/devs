package kodlama.io.devs.dtos.framework;

import kodlama.io.devs.dtos.programmingLanguages.ProgrammingLanguageDto;

import java.util.Objects;

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

	public ProgrammingLanguageDto getProgrammingLanguageDto() {
		return programmingLanguageDto;
	}

	public void setProgrammingLanguageDto(ProgrammingLanguageDto programmingLanguageDto) {
		this.programmingLanguageDto = programmingLanguageDto;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FrameworkDto that = (FrameworkDto) o;
		return id == that.id && Objects.equals(name, that.name) && Objects.equals(programmingLanguageDto, that.programmingLanguageDto);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, programmingLanguageDto);
	}

	@Override
	public String toString() {
		return "FrameworkDto{" +
				"id=" + id +
				", name='" + name + '\'' +
				", programmingLanguageDto=" + programmingLanguageDto +
				'}';
	}
}
