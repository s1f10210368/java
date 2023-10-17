package sample2;

public class Main {
    public static void main(String[] args) {
        Student st =  new Student("1234", "Taro", 1);
        System.out.printf(st.getStudentProfile());
        Teacher t = new Teacher("1000", "Inoue", "professor");
        System.out.printf(t.getTeacherProfile());
    }
}
