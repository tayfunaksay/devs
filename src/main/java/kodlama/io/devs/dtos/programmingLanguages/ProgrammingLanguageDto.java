package kodlama.io.devs.dtos.programmingLanguages;

import java.util.Objects;

public class ProgrammingLanguageDto {
	private int id;
	private String name;

	public ProgrammingLanguageDto() {
	}
	public ProgrammingLanguageDto(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ProgrammingLanguageDto that = (ProgrammingLanguageDto) o;
		return id == that.id && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "GetAllProgrammingLanguagesResponse{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
