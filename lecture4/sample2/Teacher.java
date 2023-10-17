package sample2;

public class Teacher extends Member {
    String title;

    Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }
}
