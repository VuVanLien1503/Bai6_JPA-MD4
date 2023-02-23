package manager.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String address;
    private String image;
    @Transient
    private MultipartFile multipartFile;
    @ManyToOne
    private Classroom classroom;

    public Student() {
    }

    public Student(Long id, String name, int age, String address, String image, MultipartFile multipartFile, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.image = image;
        this.multipartFile = multipartFile;
        this.classroom = classroom;
    }

    public Student(String name, int age, String address, String image, MultipartFile multipartFile, Classroom classroom) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.image = image;
        this.multipartFile = multipartFile;
        this.classroom = classroom;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
