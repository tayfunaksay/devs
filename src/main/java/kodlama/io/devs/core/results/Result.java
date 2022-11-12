package kodlama.io.devs.core.results;

import java.util.Objects;

public class Result {
	
	private boolean success;
	private String message;

	public Result() {
	}

	public Result(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Result result = (Result) o;
		return success == result.success && Objects.equals(message, result.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(success, message);
	}

	@Override
	public String toString() {
		return "Result{" +
				"success=" + success +
				", message='" + message + '\'' +
				'}';
	}
}
