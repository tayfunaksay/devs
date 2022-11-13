package kodlama.io.devs.entities.concretes;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "frameworks")
public class Framework {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="name")
	private String name;
	
	@ManyToOne()
	@JoinColumn(name = "programming_language_id")
	private ProgrammingLanguage programmingLanguage;


	public Framework() {
	}

	public Framework(int id) {
		this.id = id;
	}

	public Framework(String name, ProgrammingLanguage programmingLanguage) {
		this.name = name;
		this.programmingLanguage = programmingLanguage;
	}

	public Framework(int id, String name, ProgrammingLanguage programmingLanguage) {
		this(name, programmingLanguage);
		this.id = id;

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

	public ProgrammingLanguage getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Framework framework = (Framework) o;
		return id == framework.id && Objects.equals(name, framework.name) && Objects.equals(programmingLanguage, framework.programmingLanguage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, programmingLanguage);
	}

	@Override
	public String toString() {
		return "Framework{" +
				"id=" + id +
				", name='" + name + '\'' +
				", programmingLanguage=" + programmingLanguage +
				'}';
	}
}
