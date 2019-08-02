package sk.pro.exam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {

    @Id
    private String id;
    private String name;
    private String dekan;

    public Department() {
    }

    public Department(String name, String dekan) {
        this.name = name;
        this.dekan = dekan;
    }

    public Department(String id, String name, String dekan) {
        this.id = id;
        this.name = name;
        this.dekan = dekan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDekan() {
        return dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dekan='" + dekan + '\'' +
                '}';
    }
}
