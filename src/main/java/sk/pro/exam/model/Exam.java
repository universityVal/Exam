package sk.pro.exam.model;

import java.time.LocalDate;

public class Exam {
    private String id;
    private String name;
    private LocalDate date;
    private String professor;
    private Student student;
    private char mark;
    private int points;
    private boolean present;

    public Exam(String id, String name, LocalDate date, String professor, Student student, char mark, boolean present) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.professor = professor;
        this.student = student;
        this.mark = mark;
        this.present = present;
    }

    public Exam(String name, LocalDate date, String professor, Student student, char mark, boolean present) {
        this.name = name;
        this.date = date;
        this.professor = professor;
        this.student = student;
        this.mark = mark;
        this.present = present;
    }

    public Exam() {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", professor='" + professor + '\'' +
                ", student=" + student +
                ", mark=" + mark +
                ", present=" + present +
                '}';
    }
}
