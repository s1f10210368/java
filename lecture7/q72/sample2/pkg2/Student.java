package lecture7.q72.sample2.pkg2;

import lecture7.q72.sample2.pkg1.Member;

public class Student extends Member {
    protected int grade;

    public Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }
    
    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade:  ").append(grade).append("\n");
        return sb.toString();
    }
    @Override
    protected String getEmail() {
        return id + DOMAIN;
    }
    @Override
    public boolean canReserveRoom() {
        return false;
    }
}
