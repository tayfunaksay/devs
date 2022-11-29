package kodlama.io.devs.model.dtos.framework;

import java.util.Objects;

public class UpdateFrameworkRequest {
	private int id;
	private int programmingLanguageId;
	private String name;

	public UpdateFrameworkRequest() {
	}

	public UpdateFrameworkRequest(int id, int programmingLanguageId, String name) {
		this.id = id;
		this.programmingLanguageId = programmingLanguageId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UpdateFrameworkRequest that = (UpdateFrameworkRequest) o;
		return id == that.id && programmingLanguageId == that.programmingLanguageId && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, programmingLanguageId, name);
	}

	@Override
	public String toString() {
		return "UpdateFrameworkRequest{" +
				"id=" + id +
				", programmingLanguageId=" + programmingLanguageId +
				", name='" + name + '\'' +
				'}';
	}
}

