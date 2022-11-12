package kodlama.io.devs.dtos.programmingLanguages;

import java.util.Objects;

public class DeleteProgrammingLanguageRequest {
	
	private int id;

	public DeleteProgrammingLanguageRequest() {
	}

	public DeleteProgrammingLanguageRequest(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DeleteProgrammingLanguageRequest that = (DeleteProgrammingLanguageRequest) o;
		return id == that.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "DeleteProgrammingLanguageRequest{" +
				"id=" + id +
				'}';
	}
}
