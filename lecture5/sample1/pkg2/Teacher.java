package sample1.pkg2;

import sample1.pkg1.Member;

public class Teacher extends Member{
    private String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    @Override
    public String getProfile() {//getTeacherProfile()から変更
         StringBuffer sb = new StringBuffer();
         sb.append("----- Teacher -----\n");
         sb.append(super.getProfile()); //MemberクラスのgetProfile()を呼び出す
         sb.append("Title: ").append(title).append("\n");
         return sb.toString();
    }

    // スーパークラスに合わせて protected
    @Override
    protected String getEmail() {
        return name + DOMAIN;
    }
}
