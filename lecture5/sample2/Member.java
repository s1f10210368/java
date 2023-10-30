package sample2;

public class Member {
    static final String DOMAIN = "iniad.org";
    String id;
    String name;
    String title;

    String getEmail() {
        return this.id + DOMAIN;
    }

    Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    String getStudentProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("- - - - - Student - - - - -\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Grade: ").append(grade).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }

    String getTeacherProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("- - - - - Student - - - - -\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Title: ").append(title).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }
}
