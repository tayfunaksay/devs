package kodlama.io.devs.model.dtos.framework;


import java.util.Objects;

public class CreateFrameworkRequest {
	
	private int programmingLanguageId;
	private String name;

	public CreateFrameworkRequest() {
	}

	public int getProgrammingLanguageId() {
		return programmingLanguageId;
	}

	public void setProgrammingLanguageId(int programmingLanguageId) {
		this.programmingLanguageId = programmingLanguageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CreateFrameworkRequest(int programmingLanguageId, String name) {
		this.programmingLanguageId = programmingLanguageId;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CreateFrameworkRequest that = (CreateFrameworkRequest) o;
		return programmingLanguageId == that.programmingLanguageId && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programmingLanguageId, name);
	}

	@Override
	public String toString() {
		return "CreateFrameworkRequest{" +
				"programmingLanguageId=" + programmingLanguageId +
				", name='" + name + '\'' +
				'}';
	}
}
