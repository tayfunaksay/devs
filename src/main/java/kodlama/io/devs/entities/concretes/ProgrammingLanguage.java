package kodlama.io.devs.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "programmingLanguage")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "frameworks"})

public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "programmingLanguage")
    private List<Framework> frameworks;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int id) {
        this.id = id;
    }

    public ProgrammingLanguage(String name) {
        this.name = name;
    }

    public ProgrammingLanguage(int id, String name) {
        this(id);
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

    public List<Framework> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<Framework> frameworks) {
        this.frameworks = frameworks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(frameworks, that.frameworks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, frameworks);
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", frameworks=" + frameworks +
                '}';
    }
}
