public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taro", 3);
        Student student2 = new Student("jiro", 1);
        
        if(Student.older(student, student2)){
            System.out.printf("%s is older than %s.\n", student.name, student2.name);
        }
    }
}