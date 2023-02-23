package manager.model;

import javax.persistence.*;

@Entity
@NamedQuery(name = "findAll", query = "SELECT c FROM Classroom AS c")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Classroom() {
    }

    public Classroom(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Classroom(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
