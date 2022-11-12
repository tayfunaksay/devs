package kodlama.io.devs.dtos.framework;

import java.util.Objects;

public class DeleteFrameworkRequest {
		
	private int id;
	public DeleteFrameworkRequest() {
	}

	public DeleteFrameworkRequest(int id) {
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
		DeleteFrameworkRequest that = (DeleteFrameworkRequest) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "DeleteFrameworkRequest{" +
				"id=" + id +
				'}';
	}
}
