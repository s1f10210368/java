package quiz1;

public class CourseNameCard extends NameCard {
    private final String course;

    // 任意のクラスからアクセスできる = public を使用
    public CourseNameCard(String name, String course) {
        // name を使用するためsuper で呼び出し
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return String.format("Course: %s", course);
    }
}
