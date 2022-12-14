package kodlama.io.devs.model.dtos.programmingLanguages;

import java.util.Objects;

public class CreateProgrammingLanguageRequest {
	
	private String name;

	public CreateProgrammingLanguageRequest() {
	}

	public CreateProgrammingLanguageRequest(String name) {
		this.name = name;
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
		CreateProgrammingLanguageRequest that = (CreateProgrammingLanguageRequest) o;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "CreateProgrammingLanguageRequest{" +
				"name='" + name + '\'' +
				'}';
	}
}
