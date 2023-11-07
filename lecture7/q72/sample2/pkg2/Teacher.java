package lecture7.q72.sample2.pkg2;

import lecture7.q72.sample2.pkg1.Member;

public class Teacher extends Member{
    private String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }
    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append(super.getProfile());
        sb.append("Title:  ").append(title).append("\n");
        return sb.toString();
    }
    @Override
    protected String getEmail() {
        return name + DOMAIN;
    }
    @Override
    public boolean canReserveRoom() {
        return true;
    }
}
