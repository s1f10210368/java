package sample2;

public class Main {
    public static void main(String[] args) {
        // Student st = new Student("1234", "Taro",1);
        // // st.id = "1234";
        // // st.name = "Taro";
        // // st.grade = 1;
        // System.out.printf("%s %s %d\n", st.id,st.name, st.grade);
        // System.out.println(st.getEmail());

        Student st = new Student("1234", "Taro", 1);
        System.out.printf(st.getStudentProfile());

        Teacher t = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(t.getTeacherProfile());
    }
}
