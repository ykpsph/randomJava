package randomJava.NLayeredApp.entities;

import java.util.List;

public class Course {
    private int id;
    private String name;
    private double price;
    private String difficulty;
    private String instructorName;

    public Course() {

    }

    public Course(int id, String name, double price, String difficulty, String instructorName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.difficulty = difficulty;
        this.instructorName = instructorName;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDesc(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
