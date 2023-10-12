public class Student {
    String name;
    int grade;
    static int cnt = 0;
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        cnt++;
    }

    static boolean older(Student a, Student b){
        return a.grade > b.grade;
    }
}