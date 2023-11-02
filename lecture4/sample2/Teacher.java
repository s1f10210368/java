//Teacher
package sample2;

class Teacher extends Member {
    private String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    String getTeacherProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Title: ").append(title).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
   }
}
